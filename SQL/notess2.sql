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
-- Structure de la table `notess2`
--

DROP TABLE IF EXISTS `notess2`;
CREATE TABLE IF NOT EXISTS `notess2` (
  `NE` varchar(20) NOT NULL,
  `Res` varchar(20) NOT NULL,
  `M2101` varchar(20) NOT NULL,
  `M2102` varchar(20) NOT NULL,
  `M2103` varchar(20) NOT NULL,
  `M2103-1` varchar(20) NOT NULL,
  `M2103-2` varchar(20) NOT NULL,
  `M2104` varchar(20) NOT NULL,
  `M2104-1` varchar(20) NOT NULL,
  `M2104-2` varchar(20) NOT NULL,
  `M2105` varchar(20) NOT NULL,
  `M2105-1` varchar(20) NOT NULL,
  `M2105-2` varchar(20) NOT NULL,
  `M2106` varchar(20) NOT NULL,
  `M2107` varchar(20) NOT NULL,
  `UE21` varchar(20) NOT NULL,
  `M2201` varchar(20) NOT NULL,
  `M2202` varchar(20) NOT NULL,
  `M2203` varchar(20) NOT NULL,
  `M2204` varchar(20) NOT NULL,
  `M2204-1` varchar(20) NOT NULL,
  `M2204-2` varchar(20) NOT NULL,
  `M2205` varchar(20) NOT NULL,
  `M2206` varchar(20) NOT NULL,
  `M2207` varchar(20) NOT NULL,
  `UE22` varchar(20) NOT NULL,
  `MOY` varchar(20) NOT NULL,
  `PTN` varchar(20) NOT NULL,
  `RG` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
