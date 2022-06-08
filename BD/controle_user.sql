-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 08-Jun-2022 às 05:37
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `controle_user`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administracao`
--

DROP TABLE IF EXISTS `administracao`;
CREATE TABLE IF NOT EXISTS `administracao` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `nome_admin` varchar(50) DEFAULT NULL,
  `senha_admin` text,
  `data_Nascimento` text,
  PRIMARY KEY (`id_admin`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `administracao`
--

INSERT INTO `administracao` (`id_admin`, `nome_admin`, `senha_admin`, `data_Nascimento`) VALUES
(24, 'admin', 'admin', '07/06/2022'),
(28, 'admin', 'admuin', '08/02/2003'),
(32, 'PEDRO', '2003', '29/03/8308');

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

DROP TABLE IF EXISTS `alunos`;
CREATE TABLE IF NOT EXISTS `alunos` (
  `id_aluno` int(11) NOT NULL AUTO_INCREMENT,
  `nome_aluno` varchar(255) NOT NULL,
  `matricula` int(7) NOT NULL,
  `turma` varchar(20) NOT NULL,
  `ano_inscricao` int(4) NOT NULL,
  `biometria` blob,
  `foto` blob,
  `data` varchar(4) NOT NULL,
  PRIMARY KEY (`id_aluno`)
) ENGINE=MyISAM AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `alunos`
--

INSERT INTO `alunos` (`id_aluno`, `nome_aluno`, `matricula`, `turma`, `ano_inscricao`, `biometria`, `foto`, `data`) VALUES
(41, 'PEDRO LUCAS SILVA BARBOSA', 2308902, 'Informática', 2020, 0x30, 0x30, '2022'),
(37, 'PEDRO LUCAS SILVA BARBOSA', 8340934, 'Informática', 2019, 0x30, 0x30, '2022'),
(39, 'PEDRO LUCAS', 239980, 'Administração', 2024, 0x30, 0x30, '2022'),
(40, 'OPIREIPO', 2038293, 'Informática', 2023, 0x30, 0x30, '2022');

-- --------------------------------------------------------

--
-- Estrutura da tabela `frequencia`
--

DROP TABLE IF EXISTS `frequencia`;
CREATE TABLE IF NOT EXISTS `frequencia` (
  `id_aluno` int(11) NOT NULL AUTO_INCREMENT,
  `nome_aluno` varchar(255) NOT NULL,
  `matricula` int(7) NOT NULL,
  `turma` varchar(20) NOT NULL,
  `ano_inscricao` int(4) NOT NULL,
  `data` varchar(10) NOT NULL,
  PRIMARY KEY (`id_aluno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
