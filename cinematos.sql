-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 31-Maio-2019 às 20:00
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinematos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `filmes`
--

CREATE TABLE `filmes` (
  `nome` varchar(40) NOT NULL,
  `sala` varchar(40) DEFAULT NULL,
  `A1` varchar(3) DEFAULT NULL,
  `A2` varchar(3) DEFAULT NULL,
  `A3` varchar(3) DEFAULT NULL,
  `A4` varchar(3) DEFAULT NULL,
  `A5` varchar(3) DEFAULT NULL,
  `A6` varchar(3) DEFAULT NULL,
  `A7` varchar(3) DEFAULT NULL,
  `A8` varchar(3) DEFAULT NULL,
  `A9` varchar(3) DEFAULT NULL,
  `A10` varchar(3) DEFAULT NULL,
  `B1` varchar(3) DEFAULT NULL,
  `B2` varchar(3) DEFAULT NULL,
  `B3` varchar(3) DEFAULT NULL,
  `B4` varchar(3) DEFAULT NULL,
  `B5` varchar(3) DEFAULT NULL,
  `B6` varchar(3) DEFAULT NULL,
  `B7` varchar(3) DEFAULT NULL,
  `B8` varchar(3) DEFAULT NULL,
  `B9` varchar(3) DEFAULT NULL,
  `B10` varchar(3) DEFAULT NULL,
  `C1` varchar(3) DEFAULT NULL,
  `C2` varchar(3) DEFAULT NULL,
  `C3` varchar(3) DEFAULT NULL,
  `C4` varchar(3) DEFAULT NULL,
  `C5` varchar(3) DEFAULT NULL,
  `C6` varchar(3) DEFAULT NULL,
  `C7` varchar(3) DEFAULT NULL,
  `C8` varchar(3) DEFAULT NULL,
  `C9` varchar(3) DEFAULT NULL,
  `C10` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `filmes`
--

INSERT INTO `filmes` (`nome`, `sala`, `A1`, `A2`, `A3`, `A4`, `A5`, `A6`, `A7`, `A8`, `A9`, `A10`, `B1`, `B2`, `B3`, `B4`, `B5`, `B6`, `B7`, `B8`, `B9`, `B10`, `C1`, `C2`, `C3`, `C4`, `C5`, `C6`, `C7`, `C8`, `C9`, `C10`) VALUES
('Vingadores-Ultimato', '16:45 SALA 1 3D', '1', '1', '1', '1', '1', '1', '0', '0', '1', '1', '0', '0', '0', '1', '1', '1', '0', '0', '1', '0', '0', '1', '0', '0', '0', '0', '0', '0', '1', '0'),
('Vingadores-Ultimato', '18:30 SALA 3', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1'),
('Vingadores-Ultimato', '20:00 SALA 3', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Vingadores-Ultimato', '22:00 SALA 1 3D', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Vingadores-Ultimato', '23:15 SALA 1 3D', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1'),
('Vingadores-Ultimato', '21:00 SALA 3', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Vingadores-Ultimato', '21:15 SALA 3', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1'),
('Homem Aranha-Longe de Casa', '12:30 SALA 2 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0'),
('Homem Aranha-Longe de Casa', '20:00 SALA 2 3D', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Homem Aranha-Longe de Casa', '21:00 SALA 2 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '0'),
('Homem Aranha-Longe de Casa', '14:45 SALA 4', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Homem Aranha-Longe de Casa', '17:15 SALA 4', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Homem Aranha-Longe de Casa', '23:45 SALA 4', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Rei Leao', '13:30 SALA 1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Rei Leao', '16:00 SALA 1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Rei Leao', '18:45 SALA 1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '1', '1', '1', '1'),
('Rei Leao', '13:45 SALA 3 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Rei Leao', '16:30 SALA 3 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Rei Leao', '21:45 SALA 3 3D', '1', '1', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1'),
('Aladdin', '10:15 SALA 2 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Aladdin', '14:30 SALA 2 3D', '1', '1', '1', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Aladdin', '17:45 SALA 2 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Aladdin', '12:00 SALA 4', '1', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Aladdin', '19:30 SALA 4', '1', '1', '1', '1', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Aladdin', '21:45 SALA 4', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Capita Marvel', '12:30 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Capita Marvel', '15:00 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Capita Marvel', '17:45 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Capita Marvel', '12:00 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Capita Marvel', '14:45 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Capita Marvel', '15:45 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '18:45 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '21:00 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '00:00 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '19:00 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '22:00 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '23:45 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Capita Marvel', '18:45 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '15:45 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '15:45 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '19:00 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '23:45 SALA 6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '21:00 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '22:00 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('Toy Story 4', '00:00 SALA 5 3D', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('oba', 'oba', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('Lanchonete', ' ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `infos`
--

CREATE TABLE `infos` (
  `npedido` varchar(40) DEFAULT NULL,
  `filme` varchar(40) DEFAULT NULL,
  `sala` varchar(40) DEFAULT NULL,
  `cadeiras` varchar(40) DEFAULT NULL,
  `entrada` varchar(40) DEFAULT NULL,
  `inteira` varchar(5) DEFAULT NULL,
  `meia` varchar(5) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `pipoca` varchar(40) DEFAULT NULL,
  `bebida` varchar(40) DEFAULT NULL,
  `doce` varchar(40) DEFAULT NULL,
  `doce2` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `infos`
--

INSERT INTO `infos` (`npedido`, `filme`, `sala`, `cadeiras`, `entrada`, `inteira`, `meia`, `preco`, `pipoca`, `bebida`, `doce`, `doce2`) VALUES
('20159', 'Homem Aranha-Longe de Casa', '20:00 SALA 2 3D', ' A5 ', '22', '1', '0', 22, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('71203', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' B7 ', '20', '1', '0', 20, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('49048', 'Lanchonete', ' ', NULL, '', '0', '0', 20, 'Pequena (R$ 10)', 'Soda (R$ 10)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('17950', 'Lanchonete', ' ', ' ', '', '0', '0', 20, 'Grande (R$ 20)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('17845', 'Lanchonete', ' ', ' ', '', '0', '0', 10, 'Pequena (R$ 10)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('58926', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' B10 ', '20', '1', '0', 40, 'Pequena (R$ 10)', 'Guaraná (R$ 10)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('21366', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' C10 ', '20', '0', '1', 57, 'Grande (R$ 20)', 'Pepsi (R$ 10)', 'Chocolate (R$ 10)', 'Balas Fini (R$ 7)'),
('08854', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' ', '20', '0', '0', 40, 'Média (R$ 15)', 'Pepsi (R$ 10)', 'Twix (R$ 5)', 'Chocolate (R$ 10)'),
('72222', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' C1 B1 ', '20', '1', '1', 73, 'Grande (R$ 20)', 'Pepsi (R$ 10)', 'Balas Fini (R$ 7)', 'Churros (R$ 6)'),
('11019', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' B2 ', '20', '1', '0', 20, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('52290', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' C4 ', '20', '1', '0', 20, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('11268', 'Lanchonete', ' ', ' ', '', '0', '0', 10, 'Pequena (R$ 10)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('37900', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' A3 A8 ', '20', '1', '1', 88, 'Mega (R$ 30)', 'Energético (R$ 15)', 'Balas Fini (R$ 7)', 'M&M\'S (R$ 6)'),
('99809', 'Vingadores-Ultimato', '16:45 SALA 1 3D', ' C7 ', '20', '1', '0', 78, 'Mega (R$ 30)', 'Energético (R$ 15)', 'Balas Fini (R$ 7)', 'M&M\'S (R$ 6)'),
('18096', 'Lanchonete', ' ', ' ', '', '0', '0', 40, 'Grande (R$ 20)', 'Fanta Uva (R$ 10)', 'Twix (R$ 5)', 'Snickers (R$ 5)'),
('17234', 'Vingadores-Ultimato', '18:30 SALA 3', ' C8 ', '20', '0', '1', 10, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('44570', 'Aladdin', '14:30 SALA 2 3D', ' A4 A5 ', '20', '1', '1', 82, 'Mega (R$ 30)', 'Coca-Cola (R$ 10)', 'M&M\'S (R$ 6)', 'Churros (R$ 6)'),
('68088', 'Rei Leao', '21:45 SALA 3 3D', ' B6 B7 ', '18', '1', '1', 77, 'Mega (R$ 30)', 'Soda (R$ 10)', 'Twix (R$ 5)', 'Snickers (R$ 5)'),
('14863', 'Rei Leao', '21:45 SALA 3 3D', ' C9 ', '18', '0', '1', 9, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('85445', 'Capita Marvel', '17:45 SALA 5 3D', ' B5 B6 ', '26', '2', '0', 52, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('14838', 'Vingadores-Ultimato', '23:15 SALA 1 3D', ' C8 ', '20', '0', '1', 10, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('23193', 'Homem Aranha-Longe de Casa', '21:00 SALA 2 3D', ' C7 ', '22', '1', '0', 22, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('67629', 'Vingadores-Ultimato', '21:15 SALA 3', ' C3 ', '20', '1', '0', 20, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('62125', 'Aladdin', '19:30 SALA 4', ' A5 A6 ', '20', '1', '1', 70, 'Mega (R$ 30)', 'Guaraná (R$ 10)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)'),
('03179', 'Rei Leao', '18:45 SALA 1', ' C5 C6 ', '18', '1', '1', 27, 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)', 'Nenhum (R$ 0)');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
