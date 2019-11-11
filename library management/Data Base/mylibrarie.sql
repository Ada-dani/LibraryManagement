CREATE DATABASE  IF NOT EXISTS `mylibrarie` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mylibrarie`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: mylibrarie
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `editor`
--

DROP TABLE IF EXISTS `editor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `editor` (
  `editor` varchar(20) NOT NULL DEFAULT ' NULL',
  `code_postal` varchar(15) DEFAULT ' NULL',
  `code_editor` varchar(10) NOT NULL,
  `address` varchar(15) DEFAULT ' NULL',
  PRIMARY KEY (`editor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editor`
--

/*!40000 ALTER TABLE `editor` DISABLE KEYS */;
INSERT  DELAYED IGNORE INTO `editor` (`editor`, `code_postal`, `code_editor`, `address`) VALUES ('Omar',' 65230',' 978-3','Vaasa'),('Adam',' 65230','1666-7','Vaasa'),('Sanna','11500',' 978-2','Sweden');
/*!40000 ALTER TABLE `editor` ENABLE KEYS */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `books` (
  `code_book` varchar(10) NOT NULL,
  `title` varchar(45) DEFAULT ' NULL',
  `author` varchar(20) DEFAULT ' NULL',
  `editor` varchar(20) DEFAULT ' NULL',
  `code_editor` varchar(10) NOT NULL,
  PRIMARY KEY (`code_book`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT  IGNORE INTO `books` (`code_book`, `title`, `author`, `editor`, `code_editor`) VALUES ('10','allphp Java','Omar','Omar,' 978-3'),('20','C#','Sari','Sanna','1666-7'),('30','Adam','Adam Omar','php',' 978-2');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `id_trans` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `id_user` varchar(15) NOT NULL,
  `code_book` varchar(15) NOT NULL,
  PRIMARY KEY (`id_trans`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT  IGNORE INTO `transaction` (`id_trans`, `date`, `id_user`, `code_book`) VALUES ('1','24  Mars  2017','001','30'),('2','27  Mars 2017','003','20');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id_user` varchar(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` varchar(100) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT  IGNORE INTO `user` (`id_user`, `name`, `age`, `sex`, `Address`) VALUES ('2','Ville','27','M','Vaasa'),('3','Timo','21','M','Tampere'),('admin','admin','29','W','Helsinki'),('omar','ourahou','29','M','Vaasa');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

--
-- Dumping events for database 'mylibrarie'
--

--
-- Dumping routines for database 'mylibrarie'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-25  2:29:56
