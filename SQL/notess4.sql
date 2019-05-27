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
-- Structure de la table `notess4`
--

DROP TABLE IF EXISTS `notess4`;
CREATE TABLE IF NOT EXISTS `notess4` (
  `NE` varchar(20) NOT NULL,
  `Res` varchar(10) NOT NULL,
  `M4102` varchar(20) NOT NULL,
  `M4103` varchar(20) NOT NULL,
  `M4106` varchar(20) NOT NULL,
  `ParChoix` varchar(20) NOT NULL,
  `M41L01C` varchar(20) NOT NULL,
  `M4101C` varchar(20) NOT NULL,
  `M4104C` varchar(20) NOT NULL,
  `M41L04C` varchar(20) NOT NULL,
  `M41L02C` varchar(20) NOT NULL,
  `M41L03C` varchar(20) NOT NULL,
  `M41L05C` varchar(20) NOT NULL,
  `M42L02C` varchar(20) NOT NULL,
  `UE41` varchar(20) NOT NULL,
  `M4203` varchar(20) NOT NULL,
  `M4204` varchar(20) NOT NULL,
  `ParChoix2` varchar(20) NOT NULL,
  `M42L01C` varchar(20) NOT NULL,
  `M42L03C` varchar(20) NOT NULL,
  `M4202C` varchar(20) NOT NULL,
  `M42L04C` varchar(20) NOT NULL,
  `UE42` varchar(20) NOT NULL,
  `M4301` varchar(20) NOT NULL,
  `UE43` varchar(20) NOT NULL,
  `MOY` varchar(20) NOT NULL,
  `PTN` varchar(20) NOT NULL,
  `RANG` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
