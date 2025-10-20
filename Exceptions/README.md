# Banking System with Custom Exceptions

A simple Java banking application that demonstrates the implementation and usage of custom exceptions in a real-world banking scenario.


## Overview

This project implements a basic banking system in Java that showcases:
- Custom exception handling
- Object-oriented programming principles
- Real-world banking operations (deposit, withdraw, transfer)
- Proper error handling and validation

## Features

- **Account Creation**: Create bank accounts with initial balance validation
- **Deposit**: Add money to accounts with positive amount validation
- **Withdrawal**: Withdraw money with balance and amount checks
- **Transfer**: Transfer money between accounts
- **Balance Inquiry**: Check current account balance
- **Account Information**: Display detailed account information
- **Custom Exception Handling**: Comprehensive error handling for various scenarios


### Descriptions

- **exceptions/**: Package containing all custom exception classes
    - `InvalidAmountException.java`: Thrown for invalid transaction amounts (negative or zero)
    - `InsufficientBalanceException.java`: Thrown when withdrawal/transfer exceeds available balance
    - `AccountNotFoundException.java`: Thrown when an account cannot be found

## Custom Exceptions

### InvalidAmountException
Handles cases where transaction amounts are invalid:
- Negative amounts
- Zero amounts
- Invalid initial balance

### InsufficientBalanceException
Handles cases where operations exceed available funds:
- Withdrawals exceeding balance
- Transfers exceeding balance

### AccountNotFoundException
Handles cases where an account cannot be located in the system (extensible for future use).

All exceptions are handled internally by the methods, so you can call them directly without try-catch blocks in your main code:

```java
// These will handle errors gracefully
account.withdraw(999999.0);  // Insufficient balance
account.deposit(-500.0);      // Invalid amount
```

## Learning Objectives

This project demonstrates:

1. **Custom Exception Creation**: How to create and use custom exception classes
2. **Exception Handling**: Proper try-catch block usage and error management
3. **Encapsulation**: Private fields with public methods
4. **Input Validation**: Checking user inputs before processing
5. **Error Messages**: Providing meaningful feedback to users


##  Project Structure

```
banking-system/
│
├── exceptions/
│   ├── InvalidAmountException.java
│   ├── InsufficientBalanceException.java
│   └── AccountNotFoundException.java
│
├── BankAccount.java
├── Main.java
└── README.md
```