-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- 主機: 127.0.0.1
-- 產生日期: 2013 年 12 月 21 日 14:24
-- 伺服器版本: 5.5.32
-- PHP 版本: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 資料庫: `netdb`
--
CREATE DATABASE IF NOT EXISTS `netdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `netdb`;

-- --------------------------------------------------------

--
-- 表的結構 `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `name` varchar(10) NOT NULL,
  `seatNumber` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 轉存資料表中的資料 `student`
--

INSERT INTO `student` (`name`, `seatNumber`) VALUES
('Mary', 1),
('David', 2),
('Gary', 3),
('Tiffany', 4),
('Kobe', 5),
('Nash', 6);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
