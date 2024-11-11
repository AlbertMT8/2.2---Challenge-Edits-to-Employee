Employee Class README
Overview
This Java program defines an Employee class that demonstrates inheritance by extending a Person class. The Employee class inherits properties like name and address from Person and introduces a unique id property specific to employees. This code is part of Unit 2, Lesson 2 and focuses on creating inheritance relationships in Java.

Class Structure
The Employee class extends the Person class and includes:

Fields:

id: an integer representing the employee's unique ID.
Constructors:

Employee(String name, String address, int id): Initializes an Employee with a name, address, and ID.
Employee(int id): Initializes an Employee with a given ID, setting name and address to default values from Person.
Employee(String name, int id): Initializes an Employee with a given name and ID, with a default address from Person.
Methods:

getID(): Returns the employee's ID.
toString(): Returns a string representation of the Employee, including the name, address, and ID.
Main Method for Testing:

Demonstrates creating and printing Employee objects with various constructor options.
Getting Started
To use this code:

Ensure that the Person class is defined and accessible in the same package or directory as the Employee class.
Compile and run the Employee class.
Example Usage
In the main method:

java
Copy code
Employee e = new Employee("Willy Wonka", "Chocolate Factory", 123456);
System.out.println(e);

// Uncomment to test the additional constructor
Employee e2 = new Employee("Oompa Loompa", 3674);
System.out.println(e2);
Expected output:

vbnet
Copy code
Running the Employee class...
Name: Willy Wonka
Address: Chocolate Factory
Employee ID Number: 123456

Name: Oompa Loompa
Address: [default address from Person class]
Employee ID Number: 3674
Features
Inheritance: The Employee class inherits from Person, demonstrating basic inheritance in Java.
Multiple Constructors: The class includes multiple constructors, showcasing constructor overloading and the use of default values from a superclass.
toString Method: Provides a readable format for displaying an Employee's information, including inherited and unique properties.
Notes
Aspire To Do: The code includes an "Aspire To Do" section, encouraging you to uncomment and complete the constructor Employee(String name, int i) and test the output.
Default Values: The Employee(int id) constructor uses default values for name and address set by the Person class, illustrating constructor chaining in inheritance.
Requirements
Java Development Kit (JDK) 8 or above.
A Person class with name and address fields and appropriate constructors.
License
This code is part of a learning exercise and is intended for educational use.
