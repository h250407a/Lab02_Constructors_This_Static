# Lab 02: Constructors, this Keyword, and static Members

**Student Details:**
- **Name:** Anesu B Kahanda
- **Registration Number:** H250407A
- **Department:** Computer Science
- **Course:** Object-Oriented Programming in Java

---

## Overview
This laboratory examines how Java classes initialize their state and manage shared class-level resources:
1. Object initialization via parameterized and default constructors.
2. Constructor chaining using `this(...)` as the first statement.
3. Distinguishing parameters from instance variables using `this.field`.
4. Difference between instance members (one per object) and `static` members (shared by all instances).
5. Static and instance initializer blocks and their precise execution sequence.
6. The copy constructor pattern and static factory method pattern.

---

## Files in this Directory

| File Name | Description |
|---|---|
| `Book.java` | Program 2.1: Demonstrates constructors, constructor chaining `this(...)`, static `count`, and static/instance initializers. |
| `InitOrder.java` | Program 2.2: Traces the precise execution order of static fields, blocks, instance blocks, and constructors. |
| `Point.java` | Program 2.3: Implements a copy constructor creating an independent object clone rather than an alias. |
| `CircleDemo.java` | Exercises 1 & 2: Overloaded constructors, default radius, and static counter tracking total circle count. |
| `EmployeeDemo.java` | Exercise 3: Auto-incrementing static `employeeId`, three overloaded constructors, and copy constructor. |
| `BlockOrderDemo.java` | Exercise 4: Demonstrates that multiple static blocks run in source order at class-loading, and multiple instance blocks run before constructors. |
| `TemperatureDemo.java` | Exercise 5: Static factory methods (`fromCelsius`, `fromFahrenheit`) with a private constructor to resolve ambiguous signatures. |

---

## How to Compile and Run

To compile all files:
```bash
javac *.java
```

To run individual programs:
```bash
java Book
java InitOrder
java Point
java CircleDemo
java EmployeeDemo
java BlockOrderDemo
java TemperatureDemo
```

---

## Expected Output Samples

### `Book.java`
```
Book class loaded
#1 Clean Code by Robert Martin ($39.99)
#2 Effective Java by Joshua Bloch ($0.00)
#3 Untitled by Unknown ($0.00)
Total books created: 3
```

### `TemperatureDemo.java`
```
--- Static Factory Methods Demo ---
Temperature: 25.00 °C | 77.00 °F
Temperature: 37.00 °C | 98.60 °F

Why static factories are clearer than constructors:
1. Both Celsius and Fahrenheit take a single double parameter, which Java constructors cannot overload due to identical signatures.
2. The factory method names 'fromCelsius' and 'fromFahrenheit' clearly document the units being provided.
```
