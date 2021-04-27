package hotel_management.core.assignable_items.furniture.beds;

public class SingleBed extends Bed {
  public SingleBed(String serialNumber, String furnitureModel, double cost) {
    super(serialNumber, furnitureModel, cost);
  }

  @Override
  public String toString() {
    return "Single bed of model " + FurnitureModel + ", serial #: " + SerialNumber + ". Cost: " + Cost;
  }
}
