-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: 3421a03
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activityhappens`
--

DROP TABLE IF EXISTS `activityhappens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `activityhappens` (
  `EventName` varchar(100) NOT NULL,
  `ActivityName` varchar(100) NOT NULL,
  `ActivityDate` date NOT NULL,
  PRIMARY KEY (`EventName`,`ActivityName`),
  CONSTRAINT `activityhappens_ibfk_1` FOREIGN KEY (`EventName`) REFERENCES `event` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activityhappens`
--

LOCK TABLES `activityhappens` WRITE;
/*!40000 ALTER TABLE `activityhappens` DISABLE KEYS */;
/*!40000 ALTER TABLE `activityhappens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cfpcount`
--

DROP TABLE IF EXISTS `cfpcount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cfpcount` (
  `cfp_count` smallint DEFAULT '1',
  `event_type` varchar(100) NOT NULL DEFAULT 'Event Book',
  PRIMARY KEY (`event_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cfpcount`
--

LOCK TABLES `cfpcount` WRITE;
/*!40000 ALTER TABLE `cfpcount` DISABLE KEYS */;
/*!40000 ALTER TABLE `cfpcount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `covers`
--

DROP TABLE IF EXISTS `covers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `covers` (
  `EventName` varchar(100) NOT NULL,
  `TopicName` varchar(100) NOT NULL,
  PRIMARY KEY (`EventName`,`TopicName`),
  KEY `TopicName` (`TopicName`),
  CONSTRAINT `covers_ibfk_1` FOREIGN KEY (`EventName`) REFERENCES `event` (`Name`),
  CONSTRAINT `covers_ibfk_2` FOREIGN KEY (`TopicName`) REFERENCES `researchtopic` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `covers`
--

LOCK TABLES `covers` WRITE;
/*!40000 ALTER TABLE `covers` DISABLE KEYS */;
/*!40000 ALTER TABLE `covers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `event` (
  `Name` varchar(100) NOT NULL,
  `EventWebLink` varchar(100) NOT NULL,
  `CFPText` varchar(1000) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventbook`
--

DROP TABLE IF EXISTS `eventbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eventbook` (
  `EventName` varchar(100) NOT NULL,
  `Publisher` varchar(100) NOT NULL,
  PRIMARY KEY (`EventName`),
  CONSTRAINT `eventbook_ibfk_1` FOREIGN KEY (`EventName`) REFERENCES `event` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventbook`
--

LOCK TABLES `eventbook` WRITE;
/*!40000 ALTER TABLE `eventbook` DISABLE KEYS */;
/*!40000 ALTER TABLE `eventbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventconference`
--

DROP TABLE IF EXISTS `eventconference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eventconference` (
  `EventName` varchar(100) NOT NULL,
  `City` varchar(100) NOT NULL,
  `Country` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`EventName`),
  CONSTRAINT `eventconference_ibfk_1` FOREIGN KEY (`EventName`) REFERENCES `event` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventconference`
--

LOCK TABLES `eventconference` WRITE;
/*!40000 ALTER TABLE `eventconference` DISABLE KEYS */;
/*!40000 ALTER TABLE `eventconference` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventjournal`
--

DROP TABLE IF EXISTS `eventjournal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eventjournal` (
  `EventName` varchar(100) NOT NULL,
  `JournalName` varchar(100) NOT NULL,
  `Publisher` varchar(100) NOT NULL,
  PRIMARY KEY (`EventName`),
  CONSTRAINT `eventjournal_ibfk_1` FOREIGN KEY (`EventName`) REFERENCES `event` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventjournal`
--

LOCK TABLES `eventjournal` WRITE;
/*!40000 ALTER TABLE `eventjournal` DISABLE KEYS */;
/*!40000 ALTER TABLE `eventjournal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organizes`
--

DROP TABLE IF EXISTS `organizes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organizes` (
  `EventName` varchar(100) NOT NULL,
  `PeopleName` varchar(100) NOT NULL,
  `Role` varchar(100) NOT NULL,
  PRIMARY KEY (`EventName`,`PeopleName`),
  KEY `PeopleName` (`PeopleName`),
  CONSTRAINT `organizes_ibfk_1` FOREIGN KEY (`EventName`) REFERENCES `event` (`Name`),
  CONSTRAINT `organizes_ibfk_2` FOREIGN KEY (`PeopleName`) REFERENCES `people` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organizes`
--

LOCK TABLES `organizes` WRITE;
/*!40000 ALTER TABLE `organizes` DISABLE KEYS */;
/*!40000 ALTER TABLE `organizes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `people`
--

DROP TABLE IF EXISTS `people`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people` (
  `Name` varchar(100) NOT NULL,
  `Affilliation` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people`
--

LOCK TABLES `people` WRITE;
/*!40000 ALTER TABLE `people` DISABLE KEYS */;
/*!40000 ALTER TABLE `people` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `researchtopic`
--

DROP TABLE IF EXISTS `researchtopic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `researchtopic` (
  `Name` varchar(100) NOT NULL,
  `Area` varchar(100) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `researchtopic`
--

LOCK TABLES `researchtopic` WRITE;
/*!40000 ALTER TABLE `researchtopic` DISABLE KEYS */;
/*!40000 ALTER TABLE `researchtopic` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-03  1:53:45
