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
-- Structure de la table `matieres`
--

DROP TABLE IF EXISTS `matieres`;
CREATE TABLE IF NOT EXISTS `matieres` (
  `id_matiere` varchar(20) NOT NULL,
  `nom_matiere` varchar(100) DEFAULT NULL,
  `coeff_matiere` double(10,2) DEFAULT NULL,
  `id_UE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_matiere`),
  KEY `fk_matiere` (`id_UE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `matieres`
--

INSERT INTO `matieres` (`id_matiere`, `nom_matiere`, `coeff_matiere`, `id_UE`) VALUES
('m1101', 'introduction aux systemes informatiques', 3.50, 'ue11'),
('m1102', 'introduction a l’algorithmique et a la programmation', 3.50, 'ue11'),
('m1103', 'structure de donnees et algorithmes fondamentaux', 2.50, 'ue11'),
('m1104', 'introduction aux bases de donnees', 3.50, 'ue11'),
('m1105', 'conception de documents et d’interfaces numeriques', 2.50, 'ue11'),
('m1106', 'projet tutore', 1.50, 'ue11'),
('m1201', 'mathematiques discretes', 2.50, 'ue12'),
('m1202', 'algebre lineaire', 2.00, 'ue12'),
('m1203', 'environnement economique', 1.50, 'ue12'),
('m1204', 'fonctionnement des organisations', 2.50, 'ue12'),
('m1205', 'anglais et informatique', 2.00, 'ue12'),
('m1206', 'anglais et informatique', 1.50, 'ue12'),
('m1207', 'connaitre le monde professionnel', 1.00, 'ue12'),
('m2101', 'architecture et programmation des mecanismes de base d’un systeme informatique', 1.50, 'ue21'),
('m2102', 'architecture des reseaux', 1.50, 'ue21'),
('m2103', 'bases de la programmation orientee objet', 3.50, 'ue21'),
('m2104', 'bases de la conception orientee objet', 2.50, 'ue21'),
('m2105', 'introduction aux interfaces homme-machine', 2.50, 'ue21'),
('m2106', 'programmation et administration des bases de donnees', 2.50, 'ue21'),
('m2107', 'projet tutore : description et planification de projet', 2.00, 'ue21'),
('m2201', 'graphes et langages', 2.50, 'ue22'),
('m2202', 'analyse et methodes numeriques', 2.00, 'ue22'),
('m2203', 'environnement comptable, financier, juridique et social', 3.00, 'ue22'),
('m2204', 'gestion de projet informatique', 1.50, 'ue22'),
('m2205', 'communication, information et argumentation', 1.50, 'ue22'),
('m2206', 'communiquer en anglais', 2.50, 'ue22'),
('m2207', 'ppp - identifier ses competences', 1.00, 'ue22'),
('m3101', 'principes des systemes d’exploitation', 2.50, 'ue31'),
('m3102', 'services reseaux', 1.50, 'ue31'),
('m3103', 'algorithmique avancee', 1.50, 'ue31'),
('m3104', 'programmation web cote serveur', 2.50, 'ue31'),
('m3105', 'conception et programmation objet avancees', 2.50, 'ue31'),
('m3106', 'bases de donnees avancees', 1.50, 'ue31'),
('m3201', 'probabilites et statistique', 2.50, 'ue32'),
('m3202', 'modelisations mathematiques', 1.50, 'ue32'),
('m3203', 'droit des technologies de l’information et de la communication', 1.50, 'ue32'),
('m3204', 'gestion des systemes d’information', 2.50, 'ue32'),
('m3205', 'expression communication professionnel', 1.50, 'ue32'),
('m3206', 'collaborer en anglais', 2.50, 'ue32'),
('m3301', 'methodologie de la production d’applications', 3.00, 'ue33'),
('m3302', 'projet tutore - mise en situation professionnelle', 2.00, 'ue33'),
('m3303', 'ppp - preciser son projet', 1.00, 'ue33'),

('M4101C', 'administration systeme et reseau', 1.50, 'ue41'),
('m4102', 'programmation repartie', 1.50, 'ue41'),
('m4103', 'programmation web – client riche', 1.50, 'ue41'),
('M4104C', 'conception et developpement d’applications mobiles', 1.50, 'ue41'),
('m4106', 'projet tutoré', 2.50, 'ue41'),
('m4301', 'stage professionnel', 12.00, 'ue43'),
('ParChoix', 'parcours a choix', 0.00, 'ue41'),
('m4201', 'ateliers de création d’entreprise', 2.00, 'ue42'),
('m4202', 'introduction à la recherche opérationnelle et aide à la décision', 2.00, 'ue42'),
('m4203', 'communication dans les organisations', 2.00, 'ue42'),
('m4204', 'travailler en anglais', 0.00, 'ue42'),
('ParChoix2', 'parcours a choix 2', 0.00, 'ue42');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
