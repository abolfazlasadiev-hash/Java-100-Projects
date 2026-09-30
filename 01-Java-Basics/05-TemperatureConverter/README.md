# Temperature Converter

## Goal

Build a simple temperature converter using **Object-Oriented Programming (OOP)** in Java.

The program converts temperatures between Celsius and Fahrenheit and separates the conversion logic from the `main` method.

## Features

* Convert Celsius to Fahrenheit
* Convert Fahrenheit to Celsius
* Read temperature from the user
* Read the conversion type from the user
* Handle invalid conversion units
* Use a separate class for temperature conversion
* Use methods to organize the conversion logic

## OOP Concepts

This project demonstrates:

* **Class** — `TemperatureConverter`
* **Object** — An instance of `TemperatureConverter`
* **Methods** — Separate methods for each conversion
* **Encapsulation of Logic** — Conversion logic is separated from `Main`
* **Exception Handling** — Invalid conversion units are handled with `IllegalArgumentException`

## Project Structure

```text
TemperatureConverter/
├── Main.java
└── TemperatureConverter.java
```

## Formulas

### Celsius to Fahrenheit

```text
°F = (°C × 9/5) + 32
```

### Fahrenheit to Celsius

```text
°C = (°F - 32) × 5/9
```

## Example

```text
Enter temperature: 100
Convert to (C/F): F
Temperature in Fahrenheit: 212.0°F
```

Another example:

```text
Enter temperature: 32
Convert to (C/F): C
Temperature in Celsius: 0.0°C
```

## How It Works

The `Main` class is responsible for:

1. Reading input from the user
2. Creating a `TemperatureConverter` object
3. Calling the appropriate conversion method
4. Displaying the result

The `TemperatureConverter` class is responsible for:

* Celsius-to-Fahrenheit conversion
* Fahrenheit-to-Celsius conversion
* Validating the conversion unit

Example:

```java
TemperatureConverter converter = new TemperatureConverter();

double result = converter.convert(100, 'F');
```

## How to Run

Compile both Java files:

```bash
javac Main.java TemperatureConverter.java
```

Run the program:

```bash
java Main
```

## Learning Objectives

After completing this project, you should understand:

* How to create a Java class
* How to create an object
* How to define and call methods
* How to pass parameters to methods
* How to return values from methods
* How to separate program responsibilities
* How to handle invalid input with exceptions

## Technologies

* Java
* Object-Oriented Programming (OOP)
* `Scanner`
* Exception Handling
