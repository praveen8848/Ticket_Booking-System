# 🚆 Train Ticket Booking System

A **console-based Train Ticket Booking System** built in Java using Gradle, designed to allow users to sign up, log in, 
search for trains, view available seats, book/cancel tickets, and view their booking history. This project uses local JSON files for user and train data persistence.

## 🧑‍💻 Features

- User Sign-Up and Login (with password hashing)
- Search Trains by Source and Destination
- View Available Seats for a Train
- Book a Seat
- Cancel Booked Seats *(assumed to be part of service layer)*
- View All Bookings
- JSON-based local database
- Follows modular structure using packages like `entities`, `services`, and `utill`

---

## 🏗️ Project Structure

org.booking/
│
├── App.java # Main class with console UI
│
├── entities/
│ ├── Train.java # Train model
│ └── User.java # User model
│
├── services/
│ └── UserBookingServices.java # Core business logic
│
└── utill/
└── UserServiceUtill.java # Utility functions like hashing


## 📦 Technologies Used

- Java (JDK 21)
- Gradle (Build tool)
- Jackson (for reading/writing JSON files)
- JSON (used as a mock database)
- IntelliJ IDEA (Recommended IDE)

---

### ✅ Prerequisites

- Java (JDK 17 or later)
- Gradle
- IntelliJ IDEA or any preferred IDE
