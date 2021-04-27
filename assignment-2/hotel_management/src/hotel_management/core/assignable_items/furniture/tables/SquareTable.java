package hotel_management.core.assignable_items.furniture.tables;

public class SquareTable extends Table {
  public SquareTable(String serialNumber, String furnitureModel, double cost, int numberOfLegs) {
    super(serialNumber, furnitureModel, cost, numberOfLegs);
  }

  @Override
  public String toString() {
    return "Square table of model " + FurnitureModel + ", serial #: " + SerialNumber + " with " + NumberOfLegs + " legs. Cost: " + Cost;
  }
}
