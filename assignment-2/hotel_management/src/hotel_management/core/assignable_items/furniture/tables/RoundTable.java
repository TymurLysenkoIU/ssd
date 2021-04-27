package hotel_management.core.assignable_items.furniture.tables;

public class RoundTable extends Table {
  public RoundTable(String serialNumber, String furnitureModel, double cost, int numberOfLegs) {
    super(serialNumber, furnitureModel, cost, numberOfLegs);
  }

  @Override
  public String toString() {
    return "Round table of model " + FurnitureModel + ", serial #: " + SerialNumber + " with " + NumberOfLegs + " legs. Cost: " + Cost;
  }
}
