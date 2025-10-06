# Working-with-Generics
# Task 1

This project demonstrates how to use **Java Generics** to perform conditional checks on a collection of integers.

I defined reusable "checker" classes (`CheckOdd`, `CheckPrime`, `CheckPalindrome`) that implement a common interface(`Check`), 
and then apply them with a generic counter (`CountElement`) to count and print numbers matching each condition.

---

## Features

1. **Odd Number Check**
    - Counts how many odd numbers(integers that are not divisible by 2) are in a collection.
    - Prints all odd numbers.

2. **Prime Number Check**
    - Counts how many prime numbers(integers greater than 1 that have exactly two distinct positive divisors: 1 and themselves) are in a collection.
    - Prints all prime numbers.

3. **Palindrome Number Check**
    - Counts how many palindrome numbers(integers that remain the same when their digits are reversed) are in a collection.
    - Prints all palindrome numbers.

---

## Project Structure
```text
├── src/
│     ├── checkers/
│     │    ├── Check.java
│     │    ├── CheckOdd.java
│     │    ├── CheckPrime.java
│     │    ├── CheckPalindrome.java
│     ├── CountElement.java
│     ├── Main.java
└── README.md

