# 🚆 Train Ticket Booking System (Java CLI Project)

A simple command-line based Train Ticket Booking System built using **Java**, demonstrating user registration, login, train booking, and ticket management functionalities.



## 🛠 Features

- ✅ User Sign-Up & Login
- 🚉 View Available Trains
- 🎫 Book Train Tickets
- 📋 View Bookings
- ❌ Cancel Bookings
- 📄 User Profile Management



## 📂 Project Structure

ticketBooking-main/
├── app/
│ └── src/
│ └── main/
│ └── java/
│ └── ticket/
│ └── booking/
│ ├── App.java
│ ├── entities/
│ ├── service/
│ └── util/
├── localDb/ # JSON file storage (e.g., users.json)
├── build.gradle
└── settings.gradle




## 🚀 How to Run

### 📌 Prerequisites
- Java 17+
- Gradle

### 🔧 Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ticketBooking-main.git
   cd ticketBooking-main
2. Build and run the project:
    ```bash
   ./gradlew run

    ----

1. Sign up
2. Login
3. View Trains
4. Book Ticket
5. View Bookings
6. Cancel Booking
7. Exit

###🧑‍💻 Technologies Used

Java 17

Gradle

JSON File Handling (ObjectMapper)

OOPs Principles

###📁 Data Storage
User and train data is stored in localDb/*.json files using Jackson JSON processor.

###📌 Notes
This is a basic CLI project ideal for learning OOP, file I/O, and user workflows.

You can expand it with:

MySQL or PostgreSQL integration

GUI using JavaFX or Swing

Role-based access (admin vs user)
