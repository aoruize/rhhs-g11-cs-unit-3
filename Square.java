class Square extends Shape2D {
  
  private double length;
  
  Square(double length) {
    this.length = length;
  }
  
  public void setLength(double length) {
    this.length = length;
  }
  
  public double getLength() {
    return length;
  }
  
  public double getArea() {
    return length * length;
  }
  
  public double getPerimeter() {
    return 4 * length;
  }
}
    