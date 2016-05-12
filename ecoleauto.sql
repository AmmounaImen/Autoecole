-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 10 Avril 2016 à 03:33
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `ecoleauto`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `nom_admin` varchar(50) NOT NULL,
  `email_admin` varchar(50) NOT NULL,
  `pseudo` varchar(20) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `etat_admin` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`id_admin`, `nom_admin`, `email_admin`, `pseudo`, `mdp`, `etat_admin`) VALUES
(1, 'Administrateur', 'admin@gc.com', 'admin', 'admin', 1),
(2, 'Utilisateur', 'user.auto@gmail.com', 'user', 'user', 1);

-- --------------------------------------------------------

--
-- Structure de la table `candidat`
--

CREATE TABLE IF NOT EXISTS `candidat` (
  `id_candidat` int(20) NOT NULL AUTO_INCREMENT,
  `reference_candidat` varchar(30) NOT NULL,
  `nom_candidat` varchar(50) NOT NULL,
  `cin_candidat` varchar(8) NOT NULL,
  `dn_candidat` date NOT NULL,
  `adresse_candidat` varchar(255) NOT NULL,
  `ville_candidat` int(20) NOT NULL,
  `gsm_candidat` varchar(13) NOT NULL,
  `email_candidat` varchar(20) NOT NULL,
  `observation_candidat` varchar(255) NOT NULL,
  `date_inscription_candidat` date NOT NULL,
  `categorie_permis_candidat` varchar(20) NOT NULL,
  `montant_candidat` double NOT NULL,
  PRIMARY KEY (`id_candidat`),
  KEY `ville_candidat` (`ville_candidat`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `candidat`
--

INSERT INTO `candidat` (`id_candidat`, `reference_candidat`, `nom_candidat`, `cin_candidat`, `dn_candidat`, `adresse_candidat`, `ville_candidat`, `gsm_candidat`, `email_candidat`, `observation_candidat`, `date_inscription_candidat`, `categorie_permis_candidat`, `montant_candidat`) VALUES
(1, '12016', 'Mohamed Ali Ben Mohamed', '06120120', '1981-04-01', 'cite ennour gafsa', 1, '20120120', 'med@gmail.com', 'rien d''observation', '2016-04-08', 'B', 380),
(2, '22016', 'kamel ben mohamed', '06130130', '1980-01-01', 'cite ennacime mdhilla', 2, '20130130', 'kamel@yahoo.fr', 'rien ', '2016-04-08', 'A', 500),
(3, '32016', 'Samir ben jeddou', '06125125', '1956-04-06', 'cite echabab gafsa', 17, '20139222', 'samir@gmail.com', 'rien ', '2016-04-05', 'C', 1500),
(4, '42016', 'test candidat', '06120120', '1981-08-09', 'cite ennacime gafsa', 7, '98603781', 'khalilo@gmail.com', 'hahahah', '2016-04-08', 'D', 200),
(5, '52016', 'ali ali', '06172005', '1985-02-02', 'cite ennour', 4, '96033333', 'ali@yahoo.fr', 'rien', '2016-02-02', 'B', 360),
(6, '62016', 'Candidat Test', '06125145', '1981-02-03', 'cite cite', 5, '20130120', 'hello@yhoo.fr', 'rien', '2016-04-02', 'B', 160),
(7, '72016', 'Ali belgacem', '01120120', '1981-05-02', 'cite ennacime mdhilla', 16, '20139222', 'ali.bg@gmail.com', 'rien a observer', '2016-04-01', 'C', 200),
(8, '82016', 'ici test', '06120120', '2016-04-01', 'cite ennacime', 17, '98620120', 'ici@yahoo.fr', 'rien', '2016-04-01', 'B', 360);

-- --------------------------------------------------------

--
-- Structure de la table `examen`
--

CREATE TABLE IF NOT EXISTS `examen` (
  `id_examen` int(20) NOT NULL AUTO_INCREMENT,
  `date_examen` date NOT NULL,
  `heure_examen` time NOT NULL,
  `type_examen` varchar(20) NOT NULL,
  `id_candidat` int(20) NOT NULL,
  `note_examen` int(2) NOT NULL,
  `resultat_examen` tinyint(1) NOT NULL,
  `numero_permis` varchar(20) NOT NULL,
  PRIMARY KEY (`id_examen`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `examen`
--

INSERT INTO `examen` (`id_examen`, `date_examen`, `heure_examen`, `type_examen`, `id_candidat`, `note_examen`, `resultat_examen`, `numero_permis`) VALUES
(1, '2016-04-01', '08:00:00', 'Théorique', 7, 30, 1, ''),
(2, '2016-04-01', '08:00:00', 'Théorique', 6, 25, 1, ''),
(3, '2016-04-22', '08:00:00', 'Pratique', 6, 30, 1, '123465789'),
(4, '2016-04-01', '08:00:00', 'Théorique', 1, 30, 1, ''),
(5, '2016-04-01', '08:00:00', 'Théorique', 4, 25, 1, ''),
(6, '2016-04-27', '08:00:00', 'Théorique', 4, 0, 0, 'pas encore');

-- --------------------------------------------------------

--
-- Structure de la table `moniteur`
--

CREATE TABLE IF NOT EXISTS `moniteur` (
  `id_moniteur` int(20) NOT NULL AUTO_INCREMENT,
  `nom_moniteur` varchar(50) NOT NULL,
  `cin_moniteur` varchar(8) NOT NULL,
  `adresse_moniteur` varchar(255) NOT NULL,
  `type_moniteur` varchar(20) NOT NULL,
  `gsm_moniteur` varchar(13) NOT NULL,
  `date_inscription_moniteur` date NOT NULL,
  PRIMARY KEY (`id_moniteur`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `moniteur`
--

INSERT INTO `moniteur` (`id_moniteur`, `nom_moniteur`, `cin_moniteur`, `adresse_moniteur`, `type_moniteur`, `gsm_moniteur`, `date_inscription_moniteur`) VALUES
(1, 'Formateur Test', '06176526', 'cite ennour gafsa', 'Pratique', '98603781', '2016-04-09'),
(2, 'Moniteur Test', '06120120', 'cite ennacime gafsa', 'Théorique', '20139222', '2016-04-09'),
(3, 'Mohamed', '01120120', 'Cite Jeune Gafsa', 'Pratique', '20120120', '2016-04-07');

-- --------------------------------------------------------

--
-- Structure de la table `paiement`
--

CREATE TABLE IF NOT EXISTS `paiement` (
  `id_paiement` int(20) NOT NULL AUTO_INCREMENT,
  `id_candidat` int(20) NOT NULL,
  `date_paiement` date NOT NULL,
  `type_paiement` varchar(20) NOT NULL,
  `numero_cheque` varchar(20) NOT NULL,
  `date_cheque` date NOT NULL,
  `montant_paiement` double NOT NULL,
  `note_paiement` varchar(255) NOT NULL,
  PRIMARY KEY (`id_paiement`),
  KEY `id_candidat` (`id_candidat`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `paiement`
--

INSERT INTO `paiement` (`id_paiement`, `id_candidat`, `date_paiement`, `type_paiement`, `numero_cheque`, `date_cheque`, `montant_paiement`, `note_paiement`) VALUES
(1, 4, '2016-04-09', 'Espèce', '120120', '2016-04-09', 140, 'cheque doit paier le 11/04/2016'),
(2, 7, '2016-04-02', 'Espèce', '12346', '2016-04-02', 120, ''),
(3, 1, '2016-04-02', 'Espèce', '', '2016-04-02', 150, 'dfdsf fsdf sd'),
(4, 1, '2016-04-24', 'Espèce', '', '2016-04-24', 30, 'montant espèce numero recu : 120000'),
(5, 5, '2016-04-09', 'Espèce', '', '2016-04-09', 360, 'tout payé'),
(6, 6, '2016-04-15', 'Espèce', '', '2016-04-15', 30, ''),
(7, 4, '2016-04-01', 'Chèque', '12346', '2016-04-01', 60, ''),
(8, 3, '2016-04-01', 'Chèque', '1233456', '2016-04-16', 950, ''),
(9, 3, '2016-04-07', 'Espèce', '', '2016-04-07', 550, '');

-- --------------------------------------------------------

--
-- Structure de la table `seance`
--

CREATE TABLE IF NOT EXISTS `seance` (
  `id_seance` int(20) NOT NULL AUTO_INCREMENT,
  `date_seance` date NOT NULL,
  `heure_seance` time NOT NULL,
  `duree_seance` int(1) NOT NULL,
  `id_candidat` int(20) NOT NULL,
  `id_moniteur` int(20) NOT NULL,
  `note_seance` varchar(255) NOT NULL,
  `presence_seance` tinyint(1) NOT NULL,
  `type_seance` varchar(20) NOT NULL,
  PRIMARY KEY (`id_seance`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `seance`
--

INSERT INTO `seance` (`id_seance`, `date_seance`, `heure_seance`, `duree_seance`, `id_candidat`, `id_moniteur`, `note_seance`, `presence_seance`, `type_seance`) VALUES
(1, '2016-04-11', '08:00:00', 2, 1, 2, 'seance pour bien pratiquer la conduite ', 1, 'Pratique'),
(2, '2016-04-21', '09:00:00', 3, 2, 2, 'hello all this is test how its work', 0, 'Pratique'),
(3, '2016-04-22', '10:00:00', 2, 3, 3, '', 1, 'Pratique');

-- --------------------------------------------------------

--
-- Structure de la table `societe`
--

CREATE TABLE IF NOT EXISTS `societe` (
  `id_societe` int(11) NOT NULL,
  `nom_societe` varchar(50) NOT NULL,
  `description_societe` varchar(255) NOT NULL,
  `adresse_societe` varchar(255) NOT NULL,
  `ville_societe` varchar(50) NOT NULL,
  `cp_societe` int(4) NOT NULL,
  `tel_societe` int(8) NOT NULL,
  `fax_societe` int(8) NOT NULL,
  `website_societe` varchar(255) NOT NULL,
  `email_societe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_societe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `societe`
--

INSERT INTO `societe` (`id_societe`, `nom_societe`, `description_societe`, `adresse_societe`, `ville_societe`, `cp_societe`, `tel_societe`, `fax_societe`, `website_societe`, `email_societe`) VALUES
(1, 'GAFSA AUTO ECOLE', 'ici description', 'Gafsa', 'Gafsa', 2170, 76266400, 76266401, 'http://www.auto-ecole.com', 'auto.ecole@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

CREATE TABLE IF NOT EXISTS `ville` (
  `id_ville` int(20) NOT NULL AUTO_INCREMENT,
  `nom_ville` varchar(50) NOT NULL,
  PRIMARY KEY (`id_ville`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=20 ;

--
-- Contenu de la table `ville`
--

INSERT INTO `ville` (`id_ville`, `nom_ville`) VALUES
(1, 'Tunis'),
(2, 'Bizerte'),
(3, 'Sfax'),
(4, 'Sousse'),
(5, 'Beja'),
(6, 'Gabes'),
(7, 'Gafsa'),
(8, 'Monastir'),
(9, 'Kairouane'),
(10, 'Seliana'),
(11, 'Ariana'),
(12, 'Ben Arous'),
(13, 'Sidi Bouzid'),
(14, 'Tozeur'),
(15, 'Medenine'),
(16, 'Tataouine'),
(17, 'Kebilli'),
(18, 'Gasserine');

-- --------------------------------------------------------

--
-- Structure de la table `voiture`
--

CREATE TABLE IF NOT EXISTS `voiture` (
  `matricule` varchar(20) NOT NULL,
  `marque` varchar(50) NOT NULL,
  `modele` varchar(50) NOT NULL,
  `date_controle` date NOT NULL,
  `date_vidange` date NOT NULL,
  `en_service` tinyint(1) NOT NULL,
  PRIMARY KEY (`matricule`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `voiture`
--

INSERT INTO `voiture` (`matricule`, `marque`, `modele`, `date_controle`, `date_vidange`, `en_service`) VALUES
('120120 Tunis 139', 'Mazda', 'Mazda 123456', '2016-04-05', '2016-04-07', 0),
('1256 Tunis 179', 'Renault', 'Clio', '2016-11-03', '2016-06-01', 1);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `candidat`
--
ALTER TABLE `candidat`
  ADD CONSTRAINT `candidat_ibfk_1` FOREIGN KEY (`ville_candidat`) REFERENCES `ville` (`id_ville`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
