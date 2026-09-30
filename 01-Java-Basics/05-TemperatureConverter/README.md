# Temperature Converter

## Goal

Convert temperatures between Celsius and Fahrenheit using a Java method.

## Features

* Convert Celsius to Fahrenheit
* Convert Fahrenheit to Celsius
* Read temperature from the user
* Read conversion type from the user
* Use a separate method for temperature conversion
* Handle invalid conversion units

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

## How It Works

The program has two main parts:

### `convertTemperature()`

This method receives:

* Temperature
* Conversion unit

Then it performs the appropriate calculation and returns the result.

```java
double result = convertTemperature(temperature, unit);
```

### `main()`

The `main` method:

1. Gets the temperature from the user.
2. Gets the conversion type.
3. Calls `convertTemperature()`.
4. Displays the result.

## Project Structure

```text
TemperatureConverter/
└── Main.java
```

## How to Run

Compile the program:

```bash
javac Main.java
```

Run the program:

```bash
java Main
```

## Learning Objectives

This project helps practice:

* Java Methods
* Method parameters
* Return values
* `if / else if / else`
* `Scanner`
* Basic mathematical calculations
* Calling a method from `main`

## Technologies

* Java
* Java Methods
* `Scanner`
