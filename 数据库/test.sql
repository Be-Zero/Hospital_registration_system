/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.40 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `doctor` */

DROP TABLE IF EXISTS `doctor`;

CREATE TABLE `doctor` (
  `id` int(100) NOT NULL AUTO_INCREMENT COMMENT '医生ID',
  `name` varchar(100) NOT NULL COMMENT '医生姓名',
  `profession` varchar(100) DEFAULT '无' COMMENT '所属类别',
  `department` varchar(100) NOT NULL DEFAULT '无' COMMENT '所属科室',
  `patientsNum` int(100) DEFAULT '0' COMMENT '候诊人数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `doctor` */

insert  into `doctor`(`id`,`name`,`profession`,`department`,`patientsNum`) values (1,'ZZL','泌尿外科医生','泌尿科',0),(2,'WMH','耳鼻喉专家','耳鼻喉科',1),(3,'WPJ','解剖学专家','解剖室',0);

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `id` int(100) NOT NULL AUTO_INCREMENT COMMENT '病人ID',
  `name` varchar(100) NOT NULL COMMENT '病人姓名',
  `sex` varchar(10) NOT NULL COMMENT '病人性别',
  `age` varchar(100) NOT NULL COMMENT '病人年龄',
  `consulation` varchar(100) DEFAULT '无' COMMENT '问诊信息',
  `num` int(100) DEFAULT '0' COMMENT '队号',
  `doc` varchar(100) DEFAULT '无' COMMENT '医生',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `patient` */

insert  into `patient`(`id`,`name`,`sex`,`age`,`consulation`,`num`,`doc`) values (1,'ZMQ','女','20','超声波碎石',0,'无'),(2,'ZZH','男','20','无',1,'WMH');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) NOT NULL COMMENT '账号',
  `passWord` varchar(100) NOT NULL COMMENT '密码',
  `role` int(10) DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`userId`,`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userId`,`userName`,`passWord`,`role`) values (1,'QTH','QTH',1),(2,'WMH','WMH',0),(3,'ZMQ','ZMQ',2),(4,'ZZL','ZZL',0),(5,'ZZH','ZZH',2),(9,'WPJ','WPJ',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
