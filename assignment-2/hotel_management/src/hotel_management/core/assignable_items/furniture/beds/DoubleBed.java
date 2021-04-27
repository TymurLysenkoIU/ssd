package hotel_management.core.assignable_items.furniture.beds;

public class DoubleBed extends Bed {
  public DoubleBed(String serialNumber, String furnitureModel, double cost) {
    super(serialNumber, furnitureModel, cost);
  }

  @Override
  public String toString() {
    return "Double bed of model " + FurnitureModel + ", serial #: " + SerialNumber + ". Cost: " + Cost;
  }
}
