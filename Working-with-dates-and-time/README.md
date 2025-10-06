# Date and Time Operations Project

A comprehensive Java project demonstrating advanced date and time manipulation using Java's `java.time` API.
This project implements three distinct date and time operations:

1. **Month Length Checker** - Reports the length of each month for any given year (handles leap years)
2. **Monday Checker** - Lists all Mondays in a specified month of the current year
3. **Friday 13th Checker** - Determines if a given date falls on Friday the 13th using TemporalQuery



## Features

### 1. MonthLengthReporter
Reports the number of days in each month for a given year.
- `reportMonthLengths(int year)` - Displays all month lengths for the specified year
- Automatically handles leap years (e.g., February has 29 days in leap years)

### 2. MondayLister

Lists all Mondays in a specified month of the current year.
- `listMondays(int month)` - Displays all Mondays for the given month (1-12)
- Uses `TemporalAdjusters` for efficient date navigation
- Works with the current year automatically
- Handles months with 4 or 5 Mondays correctly

### 3. Friday13thChecker

Checks if a given date is Friday the 13th using the `TemporalQuery` interface.

- `queryFrom(TemporalAccessor date)` - TemporalQuery implementation
- Reusable query object
- Can find all Friday 13ths in any year

## Project Structure

```
├── src/
│   └── dateTimeFunc/
│       ├── MonthLengthChecker.java
│       ├── MondayChecker.java
│       └── Friday13thChecker.java
│   └── Main.java
└── README.md