# Java OOP Calculator

A simple calculator built in **Java** using **Object-Oriented Programming (OOP)** concepts.

## 📁 Project Structure

```text
Calculator/
├── Main.java
├── BasicCalculator.java
└── README.md
```

## 🧮 Features

The calculator supports:

* Addition `+`
* Subtraction `-`
* Multiplication `*`
* Division `/`
* Division-by-zero checking
* Invalid operator checking

## 🏗️ OOP Structure

The project contains two classes:

### `Main`

The `Main` class:

* Starts the program
* Gets input from the user
* Creates a `BasicCalculator` object
* Calls the `calculate()` method
* Displays the result

### `BasicCalculator`

The `BasicCalculator` class contains the calculation logic.

The main method is:

```java
public double calculate(double firstNumber, char operator, double secondNumber)
```

It receives:

```text
firstNumber
operator
secondNumber
```

and returns the calculation result.

## 🔗 How the Classes Work Together

```text
Main
 │
 │ creates object
 ▼
BasicCalculator calculator
 │
 │ calls
 ▼
calculator.calculate(firstNumber, operator, secondNumber)
 │
 │ performs calculation
 ▼
returns result
 │
 ▼
Main prints result
```

## ▶️ How to Run

Make sure Java is installed.

Compile both files:

```bash
javac Main.java BasicCalculator.java
```

Then run:

```bash
java Main
```

## 💻 Example

```text
Enter first number: 10
Enter an operator (+, -, *, /): *
Enter second number: 5

Result: 50.0
```

Another example:

```text
Enter first number: 20
Enter an operator (+, -, *, /): -
Enter second number: 8

Result: 12.0
```

## 🎯 What I Learned

This project demonstrates basic Java OOP concepts:

* Classes
* Objects
* Methods
* Method parameters
* Return values
* Encapsulation of calculation logic
* `switch` statements
* User input with `Scanner`

## 👨‍💻 Author

Created as a beginner Java OOP practice project.
