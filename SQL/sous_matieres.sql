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
-- Structure de la table `sous_matieres`
--

DROP TABLE IF EXISTS `sous_matieres`;
CREATE TABLE IF NOT EXISTS `sous_matieres` (
  `id_sous_matiere` varchar(20) NOT NULL,
  `nom_sous_matiere` varchar(100) DEFAULT NULL,
  `coeff_sous_matiere` int(10) DEFAULT NULL,
  `id_matiere` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_sous_matiere`),
  KEY `fk_sous_matiere` (`id_matiere`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `sous_matieres`
--

INSERT INTO `sous_matieres` (`id_sous_matiere`, `nom_sous_matiere`, `coeff_sous_matiere`, `id_matiere`) VALUES
('m1101-1', 'architecture', 2, 'm1101'),
('m1101-2', 'initiation windows', 1, 'm1101'),
('m1101-3', 'initiation linux', 1, 'm1101'),
('m1102-1', 'algo1', 2, 'm1102'),
('m1102-2', 'c intro', 2, 'm1102'),
('m1103-1', 'c avancé', 1, 'm1103'),
('m1103-2', 'algo2', 1, 'm1103'),
('m1104-1', 'mdd', 2, 'm1104'),
('m1104-2', 'sql', 2, 'm1104'),
('m1105-1', 'web', 2, 'm1105'),
('m1105-2', 'documents numériques', 2, 'm1105'),
('m2103-1', 'sdd', 0, 'm2103'),
('m2103-2', 'java', 0, 'm2103'),
('m2104-1', 'cycle de vie du dev d application', 0, 'm2104'),
('m2104-2', 'uml', 0, 'm2104'),
('m2105-1', 'ergonomie', 0, 'm2104'),
('m2105-2', 'programmation d ihm', 0, 'm2105'),
('m2204-1', 'environnement juridique ', 0, 'm2204'),
('m2204-2', 'environnement juridique ', 0, 'm2204'),
('m3101-1', 'principes des systèmes d exploitation  (se)', 2, 'm3101'),
('m3101-2', 'principes des systèmes d exploitation  (se-tp)', 1, 'm3101'),
('m3104-1', 'programmation web côté serveur (php)', 2, 'm3104'),
('m3104-2', 'programmation web côté serveur (java)', 1, 'm3104'),
('m3204-1', 'gestion des systèmes d information (partie 1)', 0, 'm3204'),
('m3204-2', 'gestion des systèmes d information (partie 2)', 0, 'm3204'),
('m3301-1', 'méthodologie de la production d’applications (modélisation des processus)', 0, 'm3301'),
('m3301-2', 'méthodologie de la production d’applications (partie ego)', 0, 'm3301');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
