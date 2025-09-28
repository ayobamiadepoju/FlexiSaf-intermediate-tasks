# Java Custom Annotation Example

This project demonstrates how to **create and use a custom annotation** in Java and how to **access annotation details at runtime** using reflection.  
The example includes class-level and method-level annotations and prints all applied annotations dynamically.

---

## **Features**

- Define a custom annotation `@EnhancementRequest`
- **Assign default values to some annotation fields** (`engineer = "unassigned"`, `date = "unknown"`)
- Apply annotations to both **classes** and **methods**
- Use **Java Reflection** to retrieve and print annotation details
- Example demonstrates both default values and explicitly set values

---

## **Project Structure**

```text
├── src/
│   └── com/
│       └── example/
│           └── annotations/
│               ├── EnhancementRequest.java
│               ├── Main.java
│               └── RequestImpl.java
├── README.md
└── build/