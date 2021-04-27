package hotel_management.core.assignable_items.furniture.lamps;

public class FloorLamp extends Lamp {
  public FloorLamp(String serialNumber, String furnitureModel, double cost, double wattage) {
    super(serialNumber, furnitureModel, cost, wattage);
  }

  @Override
  public String toString() {
    return "Floor lamp of model " + FurnitureModel + ", serial #: " + SerialNumber + " of wattage " + Wattage + " W. Cost: " + Cost;
  }
}
