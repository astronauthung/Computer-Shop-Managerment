USE [master]
GO
/****** Object:  Database [Computer]    Script Date: 27/12/2022 11:50:56 SA ******/
CREATE DATABASE [Computer]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Computer', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Computer.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Computer_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Computer_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Computer] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Computer].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Computer] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Computer] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Computer] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Computer] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Computer] SET ARITHABORT OFF 
GO
ALTER DATABASE [Computer] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Computer] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Computer] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Computer] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Computer] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Computer] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Computer] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Computer] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Computer] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Computer] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Computer] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Computer] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Computer] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Computer] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Computer] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Computer] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Computer] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Computer] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Computer] SET  MULTI_USER 
GO
ALTER DATABASE [Computer] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Computer] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Computer] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Computer] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Computer] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Computer] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [Computer] SET QUERY_STORE = OFF
GO
USE [Computer]
GO
/****** Object:  Table [dbo].[AccountNV]    Script Date: 27/12/2022 11:50:56 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AccountNV](
	[username] [nvarchar](50) NOT NULL,
	[pass] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_AccountNV] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[doanhthu]    Script Date: 27/12/2022 11:50:56 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[doanhthu](
	[ngay] [date] NOT NULL,
	[tenhang] [nvarchar](50) NULL,
	[tien] [bigint] NULL,
 CONSTRAINT [PK_doanhthu] PRIMARY KEY CLUSTERED 
(
	[ngay] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[khachhang]    Script Date: 27/12/2022 11:50:56 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khachhang](
	[id_kh] [nvarchar](50) NULL,
	[htkh] [nvarchar](50) NULL,
	[diachikh] [nvarchar](50) NULL,
	[sdtkh] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Login]    Script Date: 27/12/2022 11:50:56 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Login](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Login] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhacungcap]    Script Date: 27/12/2022 11:50:56 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhacungcap](
	[id_ncc] [nvarchar](50) NOT NULL,
	[tenncc] [nvarchar](50) NULL,
	[dcncc] [nvarchar](50) NULL,
	[sdtncc] [nchar](10) NULL,
 CONSTRAINT [PK_nhacungcap] PRIMARY KEY CLUSTERED 
(
	[id_ncc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhanvien]    Script Date: 27/12/2022 11:50:56 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhanvien](
	[id_nv] [nchar](10) NOT NULL,
	[name] [nvarchar](50) NULL,
	[date] [date] NULL,
	[gt] [nvarchar](10) NULL,
	[chucvu] [nvarchar](50) NULL,
	[dc] [nvarchar](50) NULL,
	[sdt] [nchar](10) NULL,
 CONSTRAINT [PK_nhanvien] PRIMARY KEY CLUSTERED 
(
	[id_nv] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[sanpham]    Script Date: 27/12/2022 11:50:56 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sanpham](
	[id_sp] [nvarchar](50) NOT NULL,
	[tensp] [nvarchar](200) NULL,
	[price] [bigint] NULL,
	[sl] [int] NULL,
	[nhacungcap] [nvarchar](100) NULL,
	[xuatxu] [nvarchar](50) NULL,
 CONSTRAINT [PK_sanpham] PRIMARY KEY CLUSTERED 
(
	[id_sp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[AccountNV] ([username], [pass]) VALUES (N'nhanvien001', N'1234568')
INSERT [dbo].[AccountNV] ([username], [pass]) VALUES (N'nhanvien002', N'123123')
INSERT [dbo].[AccountNV] ([username], [pass]) VALUES (N'nhanvien003', N'123123')
GO
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-09-17' AS Date), N'Vỏ Case InWin Z', 7524450000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-09-18' AS Date), N'Quadro GV100 HBM2', 5231800000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-09-19' AS Date), N'CPU AMD Ryzen 12 ', 712045000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-09-20' AS Date), N'Quadro GV100 HBM2', 2615900000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-10-06' AS Date), N'Vỏ Case InWin Z', 251495000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-10-08' AS Date), N'CPU AMD Ryzen 12 ', 2136135000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-10-10' AS Date), N'Quadro RTX8000 GDDR6', 1769512000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-11-22' AS Date), N'CPU AMD Ryzen 12 ', 2278544000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-11-24' AS Date), N'Quadro GV100 HBM2', 1046360000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-11-26' AS Date), N'Quadro RTX8000 GDDR6', 3096646000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-11-28' AS Date), N'Vỏ Case InWin Z', 112532431)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-14' AS Date), N'Quadro GV100 HBM2', 275985000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-16' AS Date), N'Quadro GV100 HBM2', 317268000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-18' AS Date), N'CPU AMD Ryzen 12 ', 174869000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-20' AS Date), N'Bàn Gaming Lian', 3221851000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-22' AS Date), N'CPU AMD Ryzen 12 ', 497724000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-24' AS Date), N'CPU AMD Ryzen 12 ', 4149080000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-26' AS Date), N'Bàn Gaming Lian', 132207000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-28' AS Date), N'Vỏ Case InWin Z', 4835368000)
INSERT [dbo].[doanhthu] ([ngay], [tenhang], [tien]) VALUES (CAST(N'2021-12-30' AS Date), N'Quadro RTX8000 GDDR6', 3841978000)
GO
INSERT [dbo].[khachhang] ([id_kh], [htkh], [diachikh], [sdtkh]) VALUES (N'kh001', N'Nguyễn Huy', N'Đà Nẵng', N'0789190903')
INSERT [dbo].[khachhang] ([id_kh], [htkh], [diachikh], [sdtkh]) VALUES (N'kh002', N'Mai Nhi', N'Huế', N'0788626816')
INSERT [dbo].[khachhang] ([id_kh], [htkh], [diachikh], [sdtkh]) VALUES (N'kh003', N'Lê Khánh', N'Quảng Nam', N'0901901077')
INSERT [dbo].[khachhang] ([id_kh], [htkh], [diachikh], [sdtkh]) VALUES (N'kh004', N'Lê Hoàng', N'Bình Định', N'0789190901')
INSERT [dbo].[khachhang] ([id_kh], [htkh], [diachikh], [sdtkh]) VALUES (N'kh005', N'Nguyễn Đức', N'Đà nẵng', N'0788626816')
GO
INSERT [dbo].[Login] ([username], [password]) VALUES (N'admin', N'123456')
INSERT [dbo].[Login] ([username], [password]) VALUES (N'admin1', N'1234568')
INSERT [dbo].[Login] ([username], [password]) VALUES (N'admin2', N'1234567')
GO
INSERT [dbo].[nhacungcap] ([id_ncc], [tenncc], [dcncc], [sdtncc]) VALUES (N'n001', N'NVIDIA', N'Mỹ', N'0981447204')
INSERT [dbo].[nhacungcap] ([id_ncc], [tenncc], [dcncc], [sdtncc]) VALUES (N'n002', N'INWIN', N'Đài Loan', N'0244908711')
INSERT [dbo].[nhacungcap] ([id_ncc], [tenncc], [dcncc], [sdtncc]) VALUES (N'n003', N'AMD', N'Mỹ', N'0864204375')
INSERT [dbo].[nhacungcap] ([id_ncc], [tenncc], [dcncc], [sdtncc]) VALUES (N'n004', N'LIANLI', N'Đài Loan', N'0917598571')
GO
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'1aa       ', N'1aa', CAST(N'2003-09-19' AS Date), N'1', N'Nhân viên', N'1', N'1         ')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'harem01   ', N'Trần Bo', CAST(N'2000-09-09' AS Date), N'Nam', N'Quản lý', N'Hà Nội', N'0789190912')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'harem02   ', N'Mai Uyển Nhi', CAST(N'1998-08-27' AS Date), N'Nữ', N'Nhân viên', N'Đà Nẵng', N'0788626816')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'harem03   ', N'Lê Minh Kha', CAST(N'2003-02-28' AS Date), N'Nam', N'Nhân viên', N'Quảng Trị', N'0901901077')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'harem04   ', N'Nguyễn Đức', CAST(N'2002-11-11' AS Date), N'Nam', N'Nhân viên', N'Huế', N'0762650365')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'harem05   ', N'Nguyễn Vũ', CAST(N'1997-09-09' AS Date), N'Nam', N'Quản lý', N'Huế', N'0789999982')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'harem069  ', N'Hala', CAST(N'1999-09-09' AS Date), N'Nam', N'Nhân viên', N'Canada', N'0789      ')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'harem09   ', N'Phan Mai', CAST(N'2003-03-12' AS Date), N'Nữ', N'Quản lý', N'Quảng Bình', N'0999999999')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'myname    ', N'a', CAST(N'2003-09-01' AS Date), N'Nam', N'Quản lý', N'huế', N'0876789654')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'myname1   ', N'John Cris', CAST(N'1989-02-28' AS Date), N'Nam', N'Quản lý', N'US', N'0910910011')
INSERT [dbo].[nhanvien] ([id_nv], [name], [date], [gt], [chucvu], [dc], [sdt]) VALUES (N'myname2   ', N'MessCris', CAST(N'1988-02-28' AS Date), N'NamNữ', N'Nhân viên', N'France', N'0762650789')
GO
INSERT [dbo].[sanpham] ([id_sp], [tensp], [price], [sl], [nhacungcap], [xuatxu]) VALUES (N'sp001', N'Quadro GV100 HBM2', 261590000, 100, N'NVIDIA', N'Mỹ')
INSERT [dbo].[sanpham] ([id_sp], [tensp], [price], [sl], [nhacungcap], [xuatxu]) VALUES (N'sp002', N'Quadro RTX8000 GDDR6', 221189000, 52, N'NVIDIA', N'Mỹ')
INSERT [dbo].[sanpham] ([id_sp], [tensp], [price], [sl], [nhacungcap], [xuatxu]) VALUES (N'sp003', N'Vỏ Case InWin Z', 150489000, 20, N'INWIN', N'Đài Loan')
INSERT [dbo].[sanpham] ([id_sp], [tensp], [price], [sl], [nhacungcap], [xuatxu]) VALUES (N'sp004', N'CPU AMD Ryzen 12  ', 142409000, 60, N'AMD', N'Mỹ')
INSERT [dbo].[sanpham] ([id_sp], [tensp], [price], [sl], [nhacungcap], [xuatxu]) VALUES (N'sp005', N'Bàn Gaming Lian', 50299000, 10, N'LIANLI', N'Đài Loan')
GO
USE [master]
GO
ALTER DATABASE [Computer] SET  READ_WRITE 
GO
