package hotel_management.core.assignable_items.furniture.lamps;

public class DeskLamp extends Lamp {
  public DeskLamp(String serialNumber, String furnitureModel, double cost, double wattage) {
    super(serialNumber, furnitureModel, cost, wattage);
  }

  @Override
  public String toString() {
    return "Desk lamp of model " + FurnitureModel + ", serial #: " + SerialNumber + " of wattage " + Wattage + " W. Cost: " + Cost;
  }
}
