-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2026 at 01:18 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventorydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `asset`
--

CREATE TABLE `asset` (
  `id` bigint(20) NOT NULL,
  `asset_code` varchar(255) DEFAULT NULL,
  `assigned_to` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `condition_status` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `device_type` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `serial_number` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `asset`
--

INSERT INTO `asset` (`id`, `asset_code`, `assigned_to`, `brand`, `condition_status`, `department`, `device_type`, `model`, `serial_number`, `status`) VALUES
(1, '1', 'mutoni', 'lenovo', NULL, NULL, 'desktop', NULL, NULL, 'Available'),
(3, '7', 'pacifique', 'positivo', NULL, NULL, 'laptop', NULL, NULL, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `asset_assignment`
--

CREATE TABLE `asset_assignment` (
  `id` bigint(20) NOT NULL,
  `asset_id` bigint(20) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  `issue_date` datetime DEFAULT NULL,
  `return_date` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `asset_assignment`
--

INSERT INTO `asset_assignment` (`id`, `asset_id`, `department`, `employee_name`, `issue_date`, `return_date`, `status`) VALUES
(1, 1, 'ICT', 'pacifique', '2026-04-25 12:00:06', NULL, 'Issued'),
(2, 2, 'RET', 'MUTONI', '2026-04-25 12:45:52', NULL, 'Issued');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asset`
--
ALTER TABLE `asset`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `asset_assignment`
--
ALTER TABLE `asset_assignment`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asset`
--
ALTER TABLE `asset`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `asset_assignment`
--
ALTER TABLE `asset_assignment`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
