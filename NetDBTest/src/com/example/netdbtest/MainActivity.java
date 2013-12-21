package com.example.netdbtest;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private String urlAPI = "Put your php url here! Like 'localhost/dbtest/db_helper.php for example!"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		String name = "David";
		String result = sendPostDataToInternet("getSeatNumberByName",name);
		TextView textView = (TextView) findViewById(R.id.result);
		textView.setText(name + "'s seat number is " + result);
		
	}
	
	private String sendPostDataToInternet(String action, String name){
		HttpPost httpRequest = new HttpPost(urlAPI);
		List<NameValuePair> params = new ArrayList<NameValuePair>();		
		params.add(new BasicNameValuePair("action", action));
		params.add(new BasicNameValuePair("name", name));
		try{
			httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
			HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequest);
			if(httpResponse.getStatusLine().getStatusCode() == 200){
				String strResult = EntityUtils.toString(httpResponse.getEntity(), HTTP.UTF_8);
				return strResult;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
