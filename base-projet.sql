-- phpMyAdmin SQL Dump
-- version 4.2.5
-- http://www.phpmyadmin.net
--
-- Client :  localhost:8889
-- Généré le :  Dim 22 Février 2015 à 16:10
-- Version du serveur :  5.5.38
-- Version de PHP :  5.5.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `base-projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE `admin` (
`idAdmin` int(11) NOT NULL,
  `nomAdmin` int(11) NOT NULL,
  `mdpAdmin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `bar`
--

CREATE TABLE `bar` (
`idBar` int(11) NOT NULL,
  `nomBar` varchar(30) NOT NULL,
  `heureOuverture` int(11) NOT NULL,
  `heureFermeture` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `bar`
--

INSERT INTO `bar` (`idBar`, `nomBar`, `heureOuverture`, `heureFermeture`) VALUES
(1, 'La Faluche', 9, 23),
(2, 'Le Berkeley', 10, 22);

-- --------------------------------------------------------

--
-- Structure de la table `biere`
--

CREATE TABLE `biere` (
`idBiere` int(11) NOT NULL,
  `nomBiere` varchar(30) NOT NULL,
  `prixBiere` double NOT NULL,
  `degresBieres` double NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `biere`
--

INSERT INTO `biere` (`idBiere`, `nomBiere`, `prixBiere`, `degresBieres`) VALUES
(1, 'Cuvée des Trolls', 5, 6.9),
(2, 'Rince Cochon', 5.5, 8),
(3, 'Desperados', 4.5, 7.8);

-- --------------------------------------------------------

--
-- Structure de la table `gerant`
--

CREATE TABLE `gerant` (
`idGerant` int(11) NOT NULL,
  `nomGerant` varchar(30) NOT NULL,
  `mdpGerant` varchar(30) NOT NULL,
  `idBar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `tableBarBiere`
--

CREATE TABLE `tableBarBiere` (
`idCorrespondance` int(11) NOT NULL,
  `idBar` int(11) NOT NULL,
  `idBiere` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `tableBarBiere`
--

INSERT INTO `tableBarBiere` (`idCorrespondance`, `idBar`, `idBiere`) VALUES
(1, 1, 3),
(2, 1, 2),
(3, 2, 1),
(4, 2, 3);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`idAdmin`);

--
-- Index pour la table `bar`
--
ALTER TABLE `bar`
 ADD PRIMARY KEY (`idBar`);

--
-- Index pour la table `biere`
--
ALTER TABLE `biere`
 ADD PRIMARY KEY (`idBiere`);

--
-- Index pour la table `gerant`
--
ALTER TABLE `gerant`
 ADD PRIMARY KEY (`idGerant`);

--
-- Index pour la table `tableBarBiere`
--
ALTER TABLE `tableBarBiere`
 ADD PRIMARY KEY (`idCorrespondance`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `admin`
--
ALTER TABLE `admin`
MODIFY `idAdmin` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `bar`
--
ALTER TABLE `bar`
MODIFY `idBar` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `biere`
--
ALTER TABLE `biere`
MODIFY `idBiere` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `gerant`
--
ALTER TABLE `gerant`
MODIFY `idGerant` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `tableBarBiere`
--
ALTER TABLE `tableBarBiere`
MODIFY `idCorrespondance` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
