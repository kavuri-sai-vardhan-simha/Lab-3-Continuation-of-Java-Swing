# Lab 3 – User Profile Form (Java Swing)

**Course:** CSYE 6200 – Concepts of Object-Oriented Design  
**Student:** Sai Vardhan Simha Kavuri  
**University:** Northeastern University, Toronto

## Overview
A Java Swing desktop application built in NetBeans that collects a user's profile details through a form, validates every field, and displays the completed profile with the uploaded photo in a popup.

## Features
- Input fields: First Name, Last Name, Gender, Age, Email, Phone Number, Continent, Experience and Photo
- Photo upload using `JFileChooser` (JPG, JPEG, PNG)
- Field-by-field validation with a separate error message for each field:
  - First Name and Last Name are required and must contain letters only
  - Age must be between 1 and 120
  - Email must be in a valid format
  - Phone Number must have 10 digits (`123-456-7890`)
  - Experience and Photo are required
- Profile popup showing all details with a 120×120 preview of the uploaded photo

## Project Structure
```
Lab_3/
├── src/
│   ├── model/
│   │   └── User.java          # User class: fields, constructor, getters/setters, toString()
│   └── ui/
│       ├── user_Iframe.java   # Swing form (JFrame), validation and event handling
│       └── user_Iframe.form   # NetBeans GUI Builder layout
├── output-screenshots/        # Screenshots of the running application
├── nbproject/                 # NetBeans project configuration
├── build.xml
└── manifest.mf
```

## Concepts Used
- Encapsulation (private fields with getters and setters in `User`)
- Separation of model (`model.User`) and UI (`ui.user_Iframe`)
- Java Swing components: `JFrame`, `JTextField`, `JFormattedTextField`, `JComboBox`, `JSpinner`, `JTextArea`, `JFileChooser`, `JOptionPane`
- Event handling with `ActionListener`
- Input validation with regular expressions

## How to Run
1. Clone the repository and open the `Lab_3` folder in Apache NetBeans.
2. Make sure a JDK is configured (Project Properties → Libraries).
3. Run `ui.user_Iframe` (or press **F6**).
4. Fill in all fields, click **Upload** to choose a photo, then click **Submit**.

## Screenshots
![Form](output-screenshots/Screenshot%202026-10-01%20111136.png)
![Profile popup](output-screenshots/Screenshot%202026-10-01%20111214.png)
