-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 27 mai 2019 à 19:18
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
-- Structure de la table `ue`
--

DROP TABLE IF EXISTS `ue`;
CREATE TABLE IF NOT EXISTS `ue` (
  `id_UE` varchar(20) NOT NULL,
  `nom_ue` varchar(100) DEFAULT NULL,
  `id_semestre` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_UE`),
  KEY `fk_UE` (`id_semestre`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `ue`
--

INSERT INTO `ue` (`id_UE`, `nom_ue`, `id_semestre`) VALUES
('UE11', 'Base de linformatique', 'S1'),
('UE12', 'Bases de culture scientifique sociale et humaine', 'S1'),
('UE21', 'Approfondissements en informatique', 'S2'),
('UE22', 'Approfondissement culture scientifique sociale humaine', 'S2'),
('UE31', 'Informatique avancée', 'S3'),
('UE32', 'Culture scientifique, sociale et humaine avancées', 'S3'),
('UE33', 'Méthodologie et projets', 'S3'),
('UE41', 'Compléments dinformatique', 'S4'),
('UE42', 'Compléments culture scientifique, sociale et humaine', 'S4'),
('UE43', 'Mise en situation professionnelle', 'S4');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
