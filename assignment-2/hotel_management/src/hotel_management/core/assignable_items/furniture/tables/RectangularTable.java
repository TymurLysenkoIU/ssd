package hotel_management.core.assignable_items.furniture.tables;

public class RectangularTable extends Table {
  public RectangularTable(String serialNumber, String furnitureModel, double cost, int numberOfLegs) {
    super(serialNumber, furnitureModel, cost, numberOfLegs);
  }

  @Override
  public String toString() {
    return "Rectangular table of model " + FurnitureModel + ", serial #: " + SerialNumber + " with " + NumberOfLegs + " legs. Cost: " + Cost;
  }
}
