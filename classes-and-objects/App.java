class App {
  
  public static void main(String[] args) { 
    
    Person[] people = new Person[100];
    people[0] = new Employee("Joe", "Rogan", 0000, 3500000);
    people[1] = new Employee("Gordon", "Ramsay", 0001, 20000000);
    
    System.out.println(((Employee)people[0]).getFirstName() + " " + ((Employee)people[0]).getLastName() + ", ID " + ((Employee)people[0]).getID() + ", $" + ((Employee)people[0]).getSalary());
    
    //((Employee)people[0]).setSalary(5);
    
    System.out.println(((Employee)people[1]).getFirstName() + " " + ((Employee)people[1]).getLastName() + ", ID " + ((Employee)people[1]).getID() + ", $" + ((Employee)people[1]).getSalary());
    
    int totalPay = salarySum(people);
    
    System.out.println("We will pay out " + totalPay);
  }
  
  /* Assuming you have a company that can have up to 100 persons working at it, create a method that can determine
   * the total amount to be paid to Employees (the sum of all the salaries). The method will take in an array of Persons
   * size 100 and will return the total amount to be paid to Employees for the year.
   */
  
  public static int salarySum (Person[] people) {
    
    int salarySum = 0;
    
    for (int i=0; i<people.length; i++) {
      if (people[i] instanceof Employee) {
        salarySum += ((Employee)people[i]).getSalary();
      }
    }
    
    return salarySum;
  }
  
}
