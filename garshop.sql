-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jan 2022 pada 03.10
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `garshop`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `no_plat` varchar(10) NOT NULL,
  `merk` varchar(30) NOT NULL,
  `tipe` enum('Toyota','Mitsubishi','','') NOT NULL,
  `tahun` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `cc` int(11) NOT NULL,
  `kondisi` text NOT NULL,
  `jenis` enum('Baru','Bekas','','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`no_plat`, `merk`, `tipe`, `tahun`, `harga`, `cc`, `kondisi`, `jenis`) VALUES
('A 1234 AA', 'Toyota Avanza', 'Toyota', 2010, 200000000, 200, 'Bagus', 'Baru'),
('B 1234 BB', 'Mitsubishi X', 'Mitsubishi', 2020, 500000000, 100, 'Baru', '');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`no_plat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
