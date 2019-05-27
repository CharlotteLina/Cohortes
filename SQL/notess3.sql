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
-- Structure de la table `notess3`
--

DROP TABLE IF EXISTS `notess3`;
CREATE TABLE IF NOT EXISTS `notess3` (
  `NE` varchar(20) NOT NULL,
  `Res` varchar(10) NOT NULL,
  `M3101` varchar(20) NOT NULL,
  `M3101-1` varchar(20) NOT NULL,
  `M3101-2` varchar(20) NOT NULL,
  `M3102` varchar(20) NOT NULL,
  `M3103` varchar(20) NOT NULL,
  `M3104` varchar(20) NOT NULL,
  `M3104-1` varchar(20) NOT NULL,
  `M3104-2` varchar(20) NOT NULL,
  `M3105` varchar(20) NOT NULL,
  `M3106` varchar(20) NOT NULL,
  `UE31` varchar(20) NOT NULL,
  `M3201` varchar(20) NOT NULL,
  `M3202` varchar(20) NOT NULL,
  `M3203` varchar(20) NOT NULL,
  `M3204` varchar(20) NOT NULL,
  `M3204-1` varchar(20) NOT NULL,
  `M3204-2` varchar(20) NOT NULL,
  `M3205` varchar(20) NOT NULL,
  `M3206` varchar(20) NOT NULL,
  `UE32` varchar(20) NOT NULL,
  `MOY` varchar(20) NOT NULL,
  `PTN` varchar(20) NOT NULL,
  `RANG` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
