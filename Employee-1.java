/***** UNIT 2 LESSON 2 ******
 * This lesson focuses on creating inheritance relationships
 * This class, Employee, is a subclass of Person
 * An Employee is a type of Person that also has an ID number
 * An Employee's name and address are inherited from Person
 */

public class Employee extends Person
{
   private int id;
   
   /**
   * Parameterized constructor
   *
   * @param  n  the name of this Employee
   * @param  a  the address of this Employee
   * @param  i  the id number of this Employee
   */
   public Employee(String name, String address, int i)
   {
      super(name, address);
      id = i;
   }
   
   /**
   * Parameterized constructor
   *
   * name and address are set to default values
   * @param  i  the id number of this Employee
   */
   public Employee(int i)
   {
      id = i;
   }
   
   /*** ASPIRE TO DO ***
   /* Uncomment and complete this constructor 
    * then test by uncommented the Aspire To Do comment in the main method below
    * note that the default address should be set by Person, you should not need to add a default value yourself
   */
   
   public Employee(String name, int i)
   {
      super(name);
      id = i;
   }
   
   
   /**
   * getter method
   *
   * @return   returns the id number of this Employee
   */
   public int getID()
   {
      return id;
   }
   
   /**
   * toString
   *
   * @return   returns a String representation of this Employee
   */
   public String toString()
   {
      return "Name: " + getName() + "\nAddress: " + getAddress() + "\nEmployee ID Number: " + id;
   }
   
   //main method for testing
   public static void main(String[] args)
   {
      System.out.println("Running the Employee class...");
      Employee e = new Employee("Willy Wonka", "Chocolate Factory", 123456);
      System.out.println(e);
      /**** ASPIRE TO DO 2/2 
       * Uncomment the following two lines to test the code you wrote above
      */
      
      Employee e2 = new Employee("Oompa Loompa", 3674);
      System.out.println(e2);
      
   }
}