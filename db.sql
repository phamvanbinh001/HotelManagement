-- Xóa cơ sở dữ liệu nếu tồn tại
USE master;
IF EXISTS (SELECT * FROM sys.databases WHERE name = 'HotelManagement')
BEGIN
    DROP DATABASE HotelManagement;
END
GO

-- Tạo lại cơ sở dữ liệu
CREATE DATABASE HotelManagement;
GO

USE HotelManagement;
GO

-- Bảng Người dùng
CREATE TABLE Users (
    userId INT PRIMARY KEY IDENTITY(1,1),
	username VARCHAR(50) NOT NULL UNIQUE,
    password CHAR(60) NOT NULL, --Bcrypt luôn cho ra 1 chuỗi độ dài 60
    fullName NVARCHAR(100) NOT NULL,
    email VARCHAR(254) NOT NULL UNIQUE, --Theo tiêu chuẩn RFC 5321
    role VARCHAR(10) NOT NULL CHECK (role IN ('user', 'admin')),
	isAvailable BIT DEFAULT 1
);
GO

-- Bảng Phòng
CREATE TABLE Rooms (
    roomId INT PRIMARY KEY IDENTITY(1,1),
    roomNumber VARCHAR(10) NOT NULL UNIQUE,
    doubleBeds INT NOT NULL DEFAULT 0,
    singleBeds INT NOT NULL DEFAULT 0,
    pricePerDay DECIMAL(10, 2) NOT NULL,
	type VARCHAR(10) NOT NULL CHECK (type IN ('Luxury', 'Standard')),
	amenitiesDescription NVARCHAR(255),
    imageUrl VARCHAR(2048),
    isAvailable BIT DEFAULT 1
);
GO

-- Bảng Đặt phòng
CREATE TABLE Bookings (
    bookingId INT PRIMARY KEY IDENTITY(1,1),
    userId INT,
    roomId INT,
    checkinDate DATE NOT NULL,
    checkoutDate DATE NOT NULL,
    totalPrice DECIMAL(10, 2) NOT NULL,
    bookingDate DATETIME DEFAULT CURRENT_TIMESTAMP,
	message NVARCHAR (500),
    status VARCHAR(50) DEFAULT 'pending' CHECK (status IN ('pending', 'canceled', 'completed')),
    FOREIGN KEY (userId) REFERENCES Users(userId),
    FOREIGN KEY (roomId) REFERENCES Rooms(roomId)
);
GO

-- Bảng Thanh toán
CREATE TABLE Payments (
    paymentId INT PRIMARY KEY IDENTITY(1,1),
    bookingId INT,
    amount DECIMAL(10, 2) NOT NULL,
    paymentDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    paymentMethod VARCHAR(50) NOT NULL,
    status VARCHAR(50) DEFAULT 'completed' CHECK (status IN ('pending', 'completed', 'failed')),
    FOREIGN KEY (bookingId) REFERENCES Bookings(bookingId)
);
GO

-- Thêm một số dữ liệu mẫu

INSERT INTO Users (username, password, fullName, email, role) VALUES
('user', '$2a$10$gXzRbDVDARA4ERtjP/s9g.WrExj3RcNrwNGKjrqOamxvLdJa15AQm', 'John Doe', 'john@example.com', 'user'),
('admin', '$2a$10$gXzRbDVDARA4ERtjP/s9g.WrExj3RcNrwNGKjrqOamxvLdJa15AQm', 'Admin User', 'admin@example.com', 'admin');
GO
--Password mặc định: 12345
-- Thêm các phòng mẫu vào bảng Rooms
INSERT INTO Rooms (roomNumber, doubleBeds, singleBeds, pricePerDay, type, amenitiesDescription, imageUrl, isAvailable)
VALUES
('101', 1, 0, 100.00, 'Luxury', 'Spacious room with city view', 'img/room-default.jpg', 1),
('102', 1, 2, 120.00, 'Standard', 'Cozy room with basic amenities', 'img/room-default.jpg', 1),
('103', 2, 1, 150.00, 'Luxury', 'Suite with Jacuzzi and ocean view', 'img/room-default.jpg', 1),
('104', 0, 3, 110.00, 'Standard', 'Family room with bunk beds', 'img/room-default.jpg', 1);
GO

SELECT * FROM Users
SELECT * FROM Rooms

-- Thêm các booking mẫu vào bảng Bookings cho userId = 1
INSERT INTO Bookings (userId, roomId, checkinDate, checkoutDate, totalPrice, status)
VALUES
(1, 4, '2024-05-30', '2024-06-02', 500.00, 'completed'),
(1, 2, '2024-08-01', '2024-08-05', 480.00, 'completed'),
(1, 3, '2024-09-10', '2024-09-15', 750.00, 'pending'),
(1, 4, '2024-10-05', '2024-10-10', 550.00, 'canceled');
GO
