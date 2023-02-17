-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Servidor: sql3.freemysqlhosting.net
-- Tiempo de generación: 19-05-2022 a las 14:17:52
-- Versión del servidor: 5.5.54-0ubuntu0.12.04.1
-- Versión de PHP: 7.0.33-0ubuntu0.16.04.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `BD_Soundland`
--
CREATE DATABASE IF NOT EXISTS `BD_Soundland` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `BD_Soundland`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `DATOS_USUARIO`
--

CREATE TABLE `DATOS_USUARIO` (
  `ID_Usuario` int(11) NOT NULL,
  `Nombre_Usuario` varchar(45) NOT NULL,
  `A_Paterno_Usuario` varchar(45) NOT NULL,
  `A_Materno_Usuario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `DATOS_USUARIO`
--

INSERT INTO `DATOS_USUARIO` (`ID_Usuario`, `Nombre_Usuario`, `A_Paterno_Usuario`, `A_Materno_Usuario`) VALUES
(12, 'Israel', 'Gutiérrez', 'Rabelo'),
(20, 'Areli', 'Rosas', 'Navarrete'),
(57, 'Usuario', '1', '1'),
(76, 'Usuario', 'Nuevo', 'Uno'),
(77, 'Fulanito', 'De', 'Tal'),
(84, 'Salvador', 'Pérez', 'Morales'),
(87, 'bri', 'vian', 'cla');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `DETALLES_USUARIOS`
--

CREATE TABLE `DETALLES_USUARIOS` (
  `ID_Usuarios` int(11) NOT NULL,
  `User_Name` varchar(45) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `DETALLES_USUARIOS`
--

INSERT INTO `DETALLES_USUARIOS` (`ID_Usuarios`, `User_Name`, `Correo`, `Contraseña`) VALUES
(12, 'Usuario1', 'wrwer@etery.com', '123456'),
(20, 'MissAreli', 'efwerwet@dger.com', '123456'),
(57, 'User11', 'sfse@sfwe.com', '123456'),
(76, 'User', 'sweet@sfe.com', '123456'),
(77, 'Prueba1', 'wetwet@eryryr.com', '123456'),
(84, 'Apsis', 'af010100000101@gmail.com', 'Apsis4Life}'),
(87, 'BR7', 'AAAA@hotmail,com', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `PARTIDA`
--

CREATE TABLE `PARTIDA` (
  `ID_Usuario` int(11) NOT NULL,
  `ID_Partida` varchar(45) NOT NULL,
  `Fecha_Partida` varchar(50) NOT NULL,
  `Tiempo_Partida` varchar(50) NOT NULL,
  `Puntaje` int(11) NOT NULL,
  `Nivel_Dificultad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `PARTIDA`
--

INSERT INTO `PARTIDA` (`ID_Usuario`, `ID_Partida`, `Fecha_Partida`, `Tiempo_Partida`, `Puntaje`, `Nivel_Dificultad`) VALUES
(20, '6866', '2022-05-17', '00:00:35', 500, 'Dificil'),
(57, '7509', '2022-05-09', '00:00:38', 500, 'Fácil'),
(57, '7633', '2022-05-09', '00:00:16', 400, 'Dificil'),
(57, '9741', '2022-05-09', '00:00:15', 200, 'Fácil'),
(77, '7520', '2022-05-15', '00:00:15', 200, 'Fácil'),
(84, '8280', '2022-05-09', '00:00:55', 100, 'Fácil');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `DATOS_USUARIO`
--
ALTER TABLE `DATOS_USUARIO`
  ADD PRIMARY KEY (`ID_Usuario`);

--
-- Indices de la tabla `DETALLES_USUARIOS`
--
ALTER TABLE `DETALLES_USUARIOS`
  ADD PRIMARY KEY (`ID_Usuarios`);

--
-- Indices de la tabla `PARTIDA`
--
ALTER TABLE `PARTIDA`
  ADD PRIMARY KEY (`ID_Usuario`,`ID_Partida`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `DETALLES_USUARIOS`
--
ALTER TABLE `DETALLES_USUARIOS`
  ADD CONSTRAINT `idUsuarios` FOREIGN KEY (`ID_Usuarios`) REFERENCES `DATOS_USUARIO` (`ID_Usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `PARTIDA`
--
ALTER TABLE `PARTIDA`
  ADD CONSTRAINT `IDUsuario` FOREIGN KEY (`ID_Usuario`) REFERENCES `DATOS_USUARIO` (`ID_Usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
