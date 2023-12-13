-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: jifeixitong
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `agentshipinfo`
--

DROP TABLE IF EXISTS `agentshipinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agentshipinfo` (
  `id` float NOT NULL,
  `agentName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `zhname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `enName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `mmsi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nationality` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `callSign` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Imo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `shipType` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `shipLength` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `shipWidth` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `totalTonNum` int DEFAULT NULL,
  `netTonNum` int DEFAULT NULL,
  `loadTonNum` int DEFAULT NULL,
  `reserve1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `reserve2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `aboutport` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `prearrivaltime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `predeparttime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `chishui` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agentshipinfo`
--

LOCK TABLES `agentshipinfo` WRITE;
/*!40000 ALTER TABLE `agentshipinfo` DISABLE KEYS */;
INSERT INTO `agentshipinfo` VALUES (10,'湛江市恒泰船舶代理有限公司','蓉达天津','RONG DA TIAN JIN','414466000','中国','','','散货船','199.98','12',34444,NULL,NULL,NULL,NULL,NULL,NULL,NULL,5),(11,'湛江益冠船务有限公司','卡娜','KANARIS 21','215845000','马耳他','9HA5328','9889942','油船','277.36','48',81110,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4),(13,'中国湛江外轮代理有限公司','智海','COREWISE OL','352292000','巴拿马','','9636395','散货船','177.85','28.6',22855,12536,37059,NULL,NULL,NULL,NULL,NULL,7),(14,'湛江嘉裕物流有限公司','盖尔','GAIL','636015239','利比里亚','A8ZL5',NULL,'杂货船','176.20','26',18722,NULL,NULL,NULL,NULL,'IN','2021-11-16 22:00','2021-11-19 15:00',10),(874,'湛江嘉裕物流有限公司','昌明2','CHANG MING 2','636017936','利比里亚','',NULL,'散货船','225','26',38364,NULL,NULL,NULL,NULL,'IN','2023-03-30 15:00','2023-03-31 18:00',10);
/*!40000 ALTER TABLE `agentshipinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `areainfo`
--

DROP TABLE IF EXISTS `areainfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `areainfo` (
  `AreaName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `longitude` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `latitude` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `description` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `num` int NOT NULL,
  `abbr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areainfo`
--

LOCK TABLES `areainfo` WRITE;
/*!40000 ALTER TABLE `areainfo` DISABLE KEYS */;
INSERT INTO `areainfo` VALUES ('霞山港区',NULL,NULL,'',0,'霞山'),('宝满港区',NULL,NULL,'',1,'宝满'),('调顺港区',NULL,NULL,'',2,'调顺'),('电厂码头',NULL,NULL,'',3,'电厂'),('4804厂码头',NULL,NULL,'',4,'4804厂'),('部队码头',NULL,NULL,'',5,'部队'),('宝钢码头',NULL,NULL,'',6,'宝钢'),('中科炼化码头',NULL,NULL,'',7,'中科'),('南油码头',NULL,NULL,'',8,'南油'),('武理码头',NULL,NULL,'',9,'锚地'),('宝盛码头',NULL,NULL,'',10,'其他'),('海滨船厂',NULL,NULL,'',11,'海滨'),('湛江航道',NULL,NULL,'',19,'湛江');
/*!40000 ALTER TABLE `areainfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `berthinfo`
--

DROP TABLE IF EXISTS `berthinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `berthinfo` (
  `BerthName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Direction` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Length` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ForwardDepth` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `DockBasinDepth` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MeasureDate` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Company` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `AreaName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `BerthedBoatInfo` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  `Remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `berthinfo`
--

LOCK TABLES `berthinfo` WRITE;
/*!40000 ALTER TABLE `berthinfo` DISABLE KEYS */;
INSERT INTO `berthinfo` VALUES ('101','021-201','约433','10.3','12','2016-10','一公司','霞山港区','[{\"mmsi\":\"T20220002\",\"chineseName\":\"湛港驳一\"},{\"mmsi\":\"636017936\",\"chineseName\":\"昌明2\"},{\"mmsi\":\"636017936\",\"chineseName\":\"昌明2\"}]',NULL),('11#锚地','','','','','','湛江港','锚地','',NULL),('17#锚地','','','','','','湛江港','锚地','',NULL),('18#锚地','','','','','','湛江港','锚地',NULL,NULL),('19#锚地','','','','','','湛江港','锚地','',NULL),('200','055-185','142/470','22.5','20.6','2017-06','石化公司','霞山港区','[{\"mmsi\":\"626219000\",\"chineseName\":\"海洋\"}]',NULL),('201','010-190','138','12.9','优','2017-06','石化公司','霞山港区','',NULL),('202','010-190','124','10.7','优','2017-06','石化公司','霞山港区','[{\"mmsi\":\"413496820\",\"chineseName\":\"东城油161\"}]',NULL),('203','010-190','250','6.8','4.8','2017-06','石化公司','霞山港区','',NULL),('204','010-190','250','6.8','4.8','2017-06','石化公司','霞山港区','',NULL),('206','010-190','250','6.8','4.8','2017-06','石化公司','霞山港区','',NULL),('207','6.3-186.3','374','6.3','6.4','2017-06','石化公司','霞山港区','[{\"mmsi\":\"413500540\",\"chineseName\":\"JUN HUA YOU 26\"}]',NULL),('208','6.3-186.3','374','6.3','6.4','2017-06','石化公司','霞山港区','',NULL),('209','6.3-186.3','374','6.3','6.4','2017-06','石化公司','霞山港区','',NULL);
/*!40000 ALTER TABLE `berthinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operationinfo`
--

DROP TABLE IF EXISTS `operationinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operationinfo` (
  `Mkey` int NOT NULL AUTO_INCREMENT,
  `OperationName` varchar(40) NOT NULL,
  `OperationType` varchar(40) DEFAULT NULL,
  `ChargeStandard` varchar(100) DEFAULT NULL,
  `Remark` varchar(100) DEFAULT NULL,
  `abbr` varchar(255) DEFAULT NULL,
  `disable` varchar(255) DEFAULT 'false',
  PRIMARY KEY (`Mkey`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operationinfo`
--

LOCK TABLES `operationinfo` WRITE;
/*!40000 ALTER TABLE `operationinfo` DISABLE KEYS */;
INSERT INTO `operationinfo` VALUES (6,'助靠','OT01','《船舶靠离泊使用拖轮基准收费标准》','1','助靠','false'),(7,'助离','OT01','《船舶靠离泊使用拖轮基准收费标准》','1','助离','false'),(10,'护航龙腾（中科）','OT01','','1','护龙','true'),(11,'海湾大桥伴航','OT01','《船舶靠离泊使用拖轮基准收费标准》','1','伴桥','true'),(12,'锚地助掉头','OT01','《船舶靠离泊使用拖轮基准收费标准》','1','掉头','false'),(13,'接引水','OT02','《交通用途使用拖轮包干费收费标准》','2','接引水','false'),(14,'送引水','OT02','《交通用途使用拖轮包干费收费标准》','2','送引水','false'),(15,'监护作业','OT03','《拖轮监护作业收费标准》','1+时间','监护','false'),(16,'抢险救助','OT04','《抢险救助作业收费标准》','马力+时间','救助','false');
/*!40000 ALTER TABLE `operationinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipbasicinfo`
--

DROP TABLE IF EXISTS `shipbasicinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shipbasicinfo` (
  `mKey` int NOT NULL AUTO_INCREMENT,
  `MMSI` varchar(40) DEFAULT NULL,
  `VoyageID` varchar(20) DEFAULT NULL,
  `ChineseName` varchar(40) DEFAULT NULL,
  `EnglishName` varchar(40) DEFAULT NULL,
  `Nationality` varchar(40) DEFAULT NULL,
  `CallSign` varchar(30) DEFAULT NULL,
  `SiCode` varchar(100) DEFAULT NULL,
  `IMO` varchar(30) DEFAULT NULL,
  `ShipTypeCode` varchar(20) DEFAULT NULL,
  `ShipType` varchar(30) DEFAULT NULL,
  `Length` float DEFAULT NULL,
  `Width` float DEFAULT NULL,
  `GrossTon` float DEFAULT NULL,
  `NetTon` float DEFAULT NULL,
  `DeadWeightTon` float DEFAULT NULL,
  `IsInport` varchar(10) DEFAULT NULL,
  `UpdateTime` varchar(50) DEFAULT NULL,
  `Remark` varchar(100) DEFAULT NULL,
  `IsVoyageFinished` varchar(10) DEFAULT NULL,
  `reserve1` varchar(100) DEFAULT NULL,
  `reserve2` varchar(100) DEFAULT NULL,
  `reserve3` varchar(100) DEFAULT NULL,
  `IsInteam` varchar(255) DEFAULT NULL,
  `addDate` varchar(255) DEFAULT NULL,
  `addUsername` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mKey`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipbasicinfo`
--

LOCK TABLES `shipbasicinfo` WRITE;
/*!40000 ALTER TABLE `shipbasicinfo` DISABLE KEYS */;
INSERT INTO `shipbasicinfo` VALUES (1,'636017936','','昌明2','CHANG MING 2','利比里亚','','','','T3BC','散货船',225,NULL,38364,0,0,NULL,NULL,NULL,'N','2021-11-07 10:47:24',NULL,NULL,NULL,NULL,NULL),(2,'413438390','AID202110310002','金富星66','JIN FU XING 66','中国','','','','T3BC','散货船',159.8,NULL,15692,0,0,NULL,NULL,NULL,'Y','2023-01-06 18:58:08',NULL,NULL,NULL,NULL,NULL),(3,'477387200','','粤电85','YUE DIAN 85','中国香港','','','','T3BC','散货船',229,NULL,47984,0,0,NULL,NULL,NULL,'N','2021-10-31 15:05:54',NULL,NULL,NULL,NULL,NULL),(4,'413500540','','JUN HUA YOU 26','JUN HUA YOU 26','中国','','','','T2TA','油船',183,NULL,29800,0,0,NULL,NULL,NULL,'N','2021-11-07 10:47:24',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `shipbasicinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiptypeinfo`
--

DROP TABLE IF EXISTS `shiptypeinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shiptypeinfo` (
  `mKey` int NOT NULL AUTO_INCREMENT,
  `ShipTypeCode` char(4) NOT NULL,
  `ShipType` varchar(20) NOT NULL,
  PRIMARY KEY (`mKey`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiptypeinfo`
--

LOCK TABLES `shiptypeinfo` WRITE;
/*!40000 ALTER TABLE `shiptypeinfo` DISABLE KEYS */;
INSERT INTO `shiptypeinfo` VALUES (1,'T1CT','集装箱船'),(2,'T1PA','客船'),(3,'T1RO','滚装船'),(4,'T2CH','化学品船'),(5,'T2LG','液化气体船'),(6,'T2TA','油船'),(7,'T3BC','散货船'),(8,'T3GC','杂货船'),(9,'T3OT','其他'),(10,'TJUN','军舰'),(11,'THGC','海工船'),(12,'TC','拖轮');
/*!40000 ALTER TABLE `shiptypeinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tugapplymsginfo`
--

DROP TABLE IF EXISTS `tugapplymsginfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tugapplymsginfo` (
  `TugApplyID` varchar(20) NOT NULL,
  `ApplyDate` varchar(20) DEFAULT NULL,
  `ProposerName` varchar(40) DEFAULT NULL,
  `ChineseName` varchar(40) DEFAULT NULL,
  `EnglishName` varchar(40) DEFAULT NULL,
  `MMSI` varchar(20) DEFAULT NULL,
  `SACompany` varchar(100) DEFAULT NULL,
  `PayUnit` varchar(100) DEFAULT NULL,
  `IsRespAgree` varchar(200) DEFAULT '0',
  `RespAgreeMsg` varchar(200) DEFAULT NULL,
  `AuditState` varchar(20) DEFAULT '00',
  `checkState` varchar(20) DEFAULT '00',
  `AuditDate` varchar(255) DEFAULT NULL,
  `Auditclerk` varchar(255) DEFAULT NULL,
  `checker` varchar(20) DEFAULT NULL,
  `confirmRemark` varchar(255) DEFAULT NULL,
  `shipTel` varchar(255) DEFAULT NULL,
  `busstate` int DEFAULT '0',
  `applicant` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TugApplyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tugapplymsginfo`
--

LOCK TABLES `tugapplymsginfo` WRITE;
/*!40000 ALTER TABLE `tugapplymsginfo` DISABLE KEYS */;
INSERT INTO `tugapplymsginfo` VALUES ('AID2023121153005','2023年12月11日 14:15:00','调度','昌明2','CHANG MING 2','636017936','湛江嘉裕物流有限公司',NULL,'10','没问题','01','01','2023年12月11日 14:15:44','李四','王五','没问题','13566189199',0,'张三');
/*!40000 ALTER TABLE `tugapplymsginfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tugapplyopecontent`
--

DROP TABLE IF EXISTS `tugapplyopecontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tugapplyopecontent` (
  `mkey` int DEFAULT NULL,
  `Tugapplyid` varchar(45) DEFAULT NULL,
  `Operationname` varchar(45) DEFAULT NULL,
  `operationtime` varchar(45) DEFAULT NULL,
  `operationloc` varchar(45) DEFAULT NULL,
  `Tugnumber` int DEFAULT NULL,
  `cost` varchar(45) DEFAULT NULL,
  `cid` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`cid`),
  KEY `Tugapplyid_idx` (`Tugapplyid`),
  CONSTRAINT `apply_id_connect` FOREIGN KEY (`Tugapplyid`) REFERENCES `tugapplymsginfo` (`TugApplyID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tugapplyopecontent`
--

LOCK TABLES `tugapplyopecontent` WRITE;
/*!40000 ALTER TABLE `tugapplyopecontent` DISABLE KEYS */;
INSERT INTO `tugapplyopecontent` VALUES (6,'AID2023121153005','助靠','2022-01-01 18:30:29-2015-01-21 18:23:15','霞山港区',2,'1000.0',11),(7,'AID2023121153005','助离','2022-01-01 18:30:29-2015-01-21 18:23:15','霞山港区',2,'2000.0',12);
/*!40000 ALTER TABLE `tugapplyopecontent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userinfo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `usertype` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` VALUES (1,'张三','21232f297a57a5a743894a0e4a801fc3','0',NULL),(2,'李四','21232f297a57a5a743894a0e4a801fc3','1','0'),(3,'王五','21232f297a57a5a743894a0e4a801fc3','1','1');
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-13 22:56:55
