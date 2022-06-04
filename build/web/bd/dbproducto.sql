-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-06-2022 a las 19:04:25
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbproducto`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `actEmpleado` (`acodEmp` VARCHAR(5), `anomEmp` VARCHAR(255), `aappEmp` VARCHAR(255), `aapmEmp` VARCHAR(255), `adniEmp` VARCHAR(15), `atelfEmp` VARCHAR(15), `acodArea` INT(6))  update empleado set nomEmp=anomEmp, appEmp=aappEmp, apmEmp=aapmEmp, dniEmp=adniEmp, telfEmp=atelfEmp, codArea=acodArea where codEmp=acodEmp$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `agrEmpleado` (`nomEmp` VARCHAR(255), `appEmp` VARCHAR(255), `apmEmp` VARCHAR(255), `dniEmp` VARCHAR(15), `telfEmp` VARCHAR(15), `codArea` INT(6))  begin
declare id varchar(5);
declare cuenta int;
select right(max(codEmp),4)+1 into cuenta from empleado;
set id=concat('E',Lpad(cuenta,4,'0'));
insert into empleado values(id, nomEmp, appEmp, apmEmp, dniEmp, telfEmp, codArea);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ProdAdicion` (`desProd` VARCHAR(255), `stockProd` INT, `umProd` VARCHAR(20), `fecProd` VARCHAR(15))  begin
declare id varchar(5);
declare cuenta int;
select right(max(codProd),4)+1 into cuenta from producto;
set id=concat('P',Lpad(cuenta,4,'0'));
insert into producto values(id, desProd, stockProd, umProd, fecProd);
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `codEmp` varchar(5) NOT NULL,
  `nomEmp` varchar(255) NOT NULL,
  `appEmp` varchar(255) NOT NULL,
  `apmEmp` varchar(255) NOT NULL,
  `dniEmp` varchar(15) NOT NULL,
  `telfEmp` varchar(15) NOT NULL,
  `codArea` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codEmp`, `nomEmp`, `appEmp`, `apmEmp`, `dniEmp`, `telfEmp`, `codArea`) VALUES
('E0001', 'Roberto', 'Gonzales', 'Lopez', '58254588', '908458255', 1),
('E0002', 'Jordan', 'Mendoza', 'Ñahuis', '70605964', '970673076', 7001),
('E0003', 'Mael', 'Los santos', 'Carnal', '99999999', '994147451', 7777),
('E0004', 'Michael', 'Gonzales', 'Padra', '12345678', '970673076', 7001);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codProd` varchar(5) NOT NULL,
  `desProd` varchar(255) NOT NULL,
  `stockProd` int(11) NOT NULL,
  `umProd` varchar(25) NOT NULL,
  `fecProd` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codProd`, `desProd`, `stockProd`, `umProd`, `fecProd`) VALUES
('P0001', 'Producto A', 100, 'N', '2018-07-22'),
('P0002', 'Producto B', 200, 'P', '2018-07-22'),
('P0003', 'Producto D', 200, 'N', '2022-06-02'),
('P0004', 'Producto D', 200, 'N', '2022-06-02'),
('P0005', 'Producto D', 200, 'N', '2022-06-02'),
('P0011', 'Producto Demo', 1500, 'P', '2022-06-04');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codEmp`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codProd`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
