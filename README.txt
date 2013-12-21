Android-MySQL
=============

This project allows your smart phone get the data from PC's database.

To deploy this app using eclipse,
Step 1. Setup the database, you can find the sql file in NetDB-database folder.
Step 2. Put the php files in your http space, you can find them in the NetDB-php folder. 
Step 3. Setup the configures of database connection, db_connect.php in NetDB-php folder.
Step 4. Test the php, it works if it shows -1 in browser.
Step 5. Copy the url of the php(db_helper.php) and then paste to NetDBTest\src\com\example\netdbtest\MainActivity.java
Step 6. Run the app.

Note: This project only can run on android2.X/3.X, android4.X will return an exception. It is because of android4.x not allows the http request running on main thread, you need to modify it to another thread. 
