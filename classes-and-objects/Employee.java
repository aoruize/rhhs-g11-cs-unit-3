class Employee extends Person {
  
  private double salary;
  private final int ID;
  
  Employee(String firstName, String lastName, int ID, double salary) {
    super(firstName, lastName);
    this.ID = ID;
    this.salary = salary;
  }
  
  public double getSalary() {
    return salary;
  }
  
  public void setSalary(double salary) {
    this.salary = salary;
  }
  
  public int getID(){
    return ID;
  }
}
  