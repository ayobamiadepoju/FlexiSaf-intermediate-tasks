# Iterator Example – Java

This is a simple **Java project** that shows how to use the **`Iterator` interface** to loop through a list of words and perform actions such as:

- Removing short words
- Removing certain characters (like `"a"`) from each word

It’s a small project to help you learn **safe list iteration** in Java.

---

## What is an Iterator?
In Java, an **Iterator** is a tool that lets you loop through a collection (like a `List`) **one item at a time**.  
It also allows you to **safely remove items** while looping.  
This is better than a normal `for` loop, because removing items in a normal loop can cause errors.

---

## How the Program Works
1. A list of words is created:
   [apple, banana, grape, orange, pear, kiwi]

2. The program uses an **Iterator** to loop through the list.
   - If a word is shorter than 5 letters → it is removed.
   - Example: `pear` and `kiwi` will be removed.
3. Then, a new list is created where every word has the letter `"a"` removed.

---
## 📂 Project Structure
```text
Working-with-java-collections-framework/
├── src/
│ └── Main.java
└── README.md