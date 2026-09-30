# Multi-Number Calculator

A simple Java calculator that allows the user to add or subtract multiple numbers.

## Description

This project is a basic Java console calculator.

The program:

* Gets the first number from the user.
* Gets an operator (`+` or `-`).
* Asks how many more numbers the user wants to enter.
* Performs addition or subtraction.
* Displays the final result.
* Repeats the process continuously.

## Concepts Used

This project demonstrates:

* `Scanner`
* `while` loop
* `for` loop
* `if / else if / else`
* `double`
* `int`
* `char`
* Variables
* Arithmetic operators
* User input
* Updating variable values

## How It Works

First, the program gets the first number:

```java
double result = scanner.nextDouble();
```

Then it gets the operator:

```java
char operator = scanner.next().charAt(0);
```

The user then chooses how many additional numbers they want to enter:

```java
int count = scanner.nextInt();
```

The `for` loop processes the additional numbers:

```java
for (int i = 1; i <= count; i++) {
    ...
}
```

If the operator is `+`, the number is added to `result`:

```java
result = result + number;
```

If the operator is `-`, the number is subtracted:

```java
result = result - number;
```

## Example

```text
Enter your first number: 10
Choose your operator (+ or -): +
How many more numbers do you want to enter? 3

Enter number 2: 20
Enter number 3: 30
Enter number 4: 40

Result: 100.0
```

Calculation:

```text
10 + 20 + 30 + 40 = 100
```

## Requirements

* Java JDK
* A Java-compatible IDE or text editor
* Terminal / Command Prompt

## Run

Compile:

```bash
javac Main.java
```

Run:

```bash
java Main
```

## Learning Goal

The goal of this project is to practice Java variables, user input, loops, conditions, and basic arithmetic operations.
