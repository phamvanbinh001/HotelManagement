CREATE DATABASE BookingManagement;
GO

USE BookingManagement;
GO

CREATE TABLE Hotels (
    hotelId INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone VARCHAR(20),
	image VARCHAR(2048),
    email VARCHAR(100)
);
GO

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

CREATE TABLE Users (
    userId INT PRIMARY KEY IDENTITY(1,1),
	password VARCHAR(60) NOT NULL,
    fullName VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);
GO

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
