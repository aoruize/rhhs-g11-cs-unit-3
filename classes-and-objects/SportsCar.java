class SportsCar{
  
  String manufacturer;
  String model;
  double fuelTankSize;
  double topSpeed;
  double cost;
  double mpg;
  double range;
  

  SportsCar(String manufacturer, String model, double fuelTankSize, double topSpeed, double cost, double mpg){
    this.manufacturer = manufacturer;
    this.model = model;
    this.fuelTankSize = fuelTankSize;
    this.topSpeed = topSpeed;
    this.cost = cost;
    this.mpg = mpg;
  }
  
  public double range(){
    this.range = this.mpg * this.fuelTankSize;
    return this.range;
  }
}