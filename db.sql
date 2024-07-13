-- Xóa cơ sở dữ liệu nếu tồn tại
IF EXISTS (SELECT * FROM sys.databases WHERE name = 'BookingManagement')
BEGIN
    DROP DATABASE BookingManagement;
END
GO

-- Tạo lại cơ sở dữ liệu
CREATE DATABASE BookingManagement;
GO

USE BookingManagement;
GO

-- Bảng Khách sạn
CREATE TABLE Hotels (
    hotelId INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone VARCHAR(20),
	image VARCHAR(2048),
    email VARCHAR(100)
);
GO

-- Bảng Phòng
CREATE TABLE Rooms (
    roomId INT PRIMARY KEY IDENTITY(1,1),
    hotelId INT,
    roomNumber VARCHAR(10) NOT NULL,
    type VARCHAR(50) NOT NULL,
    price FLOAT NOT NULL,
	image VARCHAR(2048),
    isAvailable BIT,
    FOREIGN KEY (hotelId) REFERENCES Hotels(hotelId)
);
GO

-- Bảng Khách hàng với cột role
CREATE TABLE Users (
    userId INT PRIMARY KEY IDENTITY(1,1),
	password VARCHAR(100) NOT NULL,
    fullName VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    role VARCHAR(10) NOT NULL
);
GO

-- Bảng Đặt phòng
CREATE TABLE Bookings (
    bookingId INT PRIMARY KEY IDENTITY(1,1),
    userId INT,
    roomId INT,
    checkin DATETIME NOT NULL,
    checkout DATETIME NOT NULL,
    totalPrice DECIMAL(10, 2) NOT NULL,
    bookingDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50) DEFAULT 'pending',
    FOREIGN KEY (userId) REFERENCES Users(userId),
    FOREIGN KEY (roomId) REFERENCES Rooms(roomId)
);
GO

-- Bảng Thanh toán
CREATE TABLE Payments (
    id VARCHAR(7) PRIMARY KEY,
    bookingId INT,
    amount FLOAT NOT NULL,
    paymentDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    paymentMethod VARCHAR(50) NOT NULL,
    status VARCHAR(50) DEFAULT 'completed',
    FOREIGN KEY (bookingId) REFERENCES Bookings(bookingId)
);
GO

-- Thêm 10 mẫu vào bảng Users
INSERT INTO Users (password, fullName, email, role) VALUES
('1', 'User', 'user@gmail.com', 'user'),
('1', 'Admin', 'admin@gmail.com', 'admin'),
('password3', 'Michael Johnson', 'michael.johnson@example.com', 'user'),
('password4', 'Emily Davis', 'emily.davis@example.com', 'user'),
('password5', 'Christopher Brown', 'christopher.brown@example.com', 'admin'),
('password6', 'Patricia Garcia', 'patricia.garcia@example.com', 'user'),
('password7', 'Linda Martinez', 'linda.martinez@example.com', 'user'),
('password8', 'David Hernandez', 'david.hernandez@example.com', 'admin'),
('password9', 'Barbara Wilson', 'barbara.wilson@example.com', 'user'),
('password10', 'James Clark', 'james.clark@example.com', 'user');
GO
