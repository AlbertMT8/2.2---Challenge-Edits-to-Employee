# Employee Class in Java

This Java program is part of **Unit 2, Lesson 2**, focusing on creating inheritance relationships in Java. It demonstrates how to create a subclass, `Employee`, which extends a `Person` superclass. An `Employee` inherits properties from `Person` and includes additional features specific to employees, such as an ID number.

## Class Overview

### Employee
The `Employee` class is a subclass of `Person` and represents an employee with a unique ID number. An `Employee` inherits the `name` and `address` attributes from `Person`, and includes additional functionality.

#### Attributes
- `id` (int): A unique identifier for the employee.

#### Constructors
1. **Employee(String name, String address, int id)**
   - A parameterized constructor that initializes the `name`, `address`, and `id` of the `Employee`.
   
2. **Employee(int id)**
   - A constructor that initializes only the `id`, with `name` and `address` set to default values (handled by the `Person` superclass).
   
3. **Employee(String name, int id)**
   - A constructor that initializes the `name` and `id` with a default address (handled by the `Person` superclass).

#### Methods

- **getID()**: Returns the `id` of the `Employee`.
  
- **toString()**: Returns a string representation of the `Employee`, including `name`, `address`, and `id`.

## Code Example

The `main` method in the `Employee` class provides a way to test the functionality of the class. Here is an example of how to create and use an `Employee` object:

```java
public static void main(String[] args) {
    System.out.println("Running the Employee class...");
    Employee e = new Employee("Willy Wonka", "Chocolate Factory", 123456);
    System.out.println(e);

    // ASPIRE TO DO
    Employee e2 = new Employee("Oompa Loompa", 3674);
    System.out.println(e2);
}
