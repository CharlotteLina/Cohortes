-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 27 mai 2019 à 19:20
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `ptut`
--

-- --------------------------------------------------------

--
-- Structure de la table `notess1`
--

DROP TABLE IF EXISTS `notess1`;
CREATE TABLE IF NOT EXISTS `notess1` (
  `NE` varchar(20) NOT NULL,
  `Res` varchar(10) NOT NULL,
  `M1101` varchar(20) NOT NULL,
  `M1101-1` varchar(20) NOT NULL,
  `M1101-2` varchar(20) NOT NULL,
  `M1101-3` varchar(20) NOT NULL,
  `M1102` varchar(20) NOT NULL,
  `M1102-1` varchar(20) NOT NULL,
  `M1102-2` varchar(20) NOT NULL,
  `M1103` varchar(20) NOT NULL,
  `M1103-1` varchar(20) NOT NULL,
  `M1103-2` varchar(20) NOT NULL,
  `M1104` varchar(20) NOT NULL,
  `M1104-1` varchar(20) NOT NULL,
  `M1104-2` varchar(20) NOT NULL,
  `M1105` varchar(20) NOT NULL,
  `M1105-1` varchar(20) NOT NULL,
  `M1105-2` varchar(20) NOT NULL,
  `M1106` varchar(20) NOT NULL,
  `UE11` varchar(20) NOT NULL,
  `M1201` varchar(20) NOT NULL,
  `M1202` varchar(20) NOT NULL,
  `M1203` varchar(20) NOT NULL,
  `M1204` varchar(20) NOT NULL,
  `M1205` varchar(20) NOT NULL,
  `M1206` varchar(20) NOT NULL,
  `M1207` varchar(20) NOT NULL,
  `UE12` varchar(20) NOT NULL,
  `MOY` varchar(20) NOT NULL,
  `PTN` varchar(20) NOT NULL,
  `RANG` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
