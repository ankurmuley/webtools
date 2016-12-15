CREATE DATABASE `project_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
-- SELECT
SELECT * FROM project_db.useraccount;
-- Create
CREATE TABLE `admin` (
  `experience` varchar(255) DEFAULT NULL,
  `personid` int(11) NOT NULL,
  `useraccount` int(11) DEFAULT NULL,
  PRIMARY KEY (`personid`),
  KEY `FKr3kjo7krqh2mcv8oo3w6kbeti` (`useraccount`),
  CONSTRAINT `FKo2p8okie9115uxbqpe6cpihtg` FOREIGN KEY (`personid`) REFERENCES `person` (`personid`),
  CONSTRAINT `FKr3kjo7krqh2mcv8oo3w6kbeti` FOREIGN KEY (`useraccount`) REFERENCES `useraccount` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `car` (
  `id` int(11) NOT NULL,
  `carname` varchar(255) DEFAULT NULL,
  `cartype` varchar(255) DEFAULT NULL,
  `photoname` varchar(255) DEFAULT NULL,
  `rate` int(11) DEFAULT NULL,
  `transmission` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `customer` (
  `address` varchar(255) DEFAULT NULL,
  `personid` int(11) NOT NULL,
  PRIMARY KEY (`personid`),
  CONSTRAINT `FKewmy429g18qsvg2buf62did8k` FOREIGN KEY (`personid`) REFERENCES `person` (`personid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;CREATE TABLE `payment` (
  `id` int(11) NOT NULL,
  `bill_amount` int(11) DEFAULT NULL,
  `bill_date` varchar(255) DEFAULT NULL,
  `card_holder_name` varchar(255) DEFAULT NULL,
  `card_number` varchar(255) DEFAULT NULL,
  `cardType` varchar(255) DEFAULT NULL,
  `cvv` varchar(255) DEFAULT NULL,
  `expiration_month` varchar(255) DEFAULT NULL,
  `expiration_year` varchar(255) DEFAULT NULL,
  `customer` int(11) NOT NULL,
  `reservation` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKej1plmucnx05jq4nkxlw0smk7` (`customer`),
  KEY `FKeej528q9jv79p3k774bomntwl` (`reservation`),
  CONSTRAINT `FKeej528q9jv79p3k774bomntwl` FOREIGN KEY (`reservation`) REFERENCES `reservation` (`reservationid`),
  CONSTRAINT `FKej1plmucnx05jq4nkxlw0smk7` FOREIGN KEY (`customer`) REFERENCES `customer` (`personid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `person` (
  `personid` int(11) NOT NULL,
  `age` varchar(255) DEFAULT NULL,
  `emailid` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`personid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `reservation` (
  `reservationid` int(11) NOT NULL,
  `pick_up_date` varchar(255) DEFAULT NULL,
  `pick_up_location` varchar(255) DEFAULT NULL,
  `pick_up_time` varchar(255) DEFAULT NULL,
  `return_date` varchar(255) DEFAULT NULL,
  `return_time` varchar(255) DEFAULT NULL,
  `carid` int(11) NOT NULL,
  `customer` int(11) NOT NULL,
  PRIMARY KEY (`reservationid`),
  KEY `FK1i9gab3gxcfcfhs9mn5o44yxf` (`carid`),
  KEY `FKsg8770wfft7ktwtf9r8a6cwos` (`customer`),
  CONSTRAINT `FK1i9gab3gxcfcfhs9mn5o44yxf` FOREIGN KEY (`carid`) REFERENCES `car` (`id`),
  CONSTRAINT `FKsg8770wfft7ktwtf9r8a6cwos` FOREIGN KEY (`customer`) REFERENCES `customer` (`personid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `useraccount` (
  `userid` int(11) NOT NULL,
  `password` varchar(30) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(30) NOT NULL,
  `customer` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `UK17ugd58vlmc127oypjag9pxee` (`username`,`password`),
  UNIQUE KEY `UK_blykjk27up0rm75xmcy2b4ncg` (`username`),
  KEY `FK4nk8g0axo2gr9w7en5qc66j73` (`customer`),
  CONSTRAINT `FK4nk8g0axo2gr9w7en5qc66j73` FOREIGN KEY (`customer`) REFERENCES `customer` (`personid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- UPDATE
update project_db.useraccount  set role="admin" where username = 'archana' 