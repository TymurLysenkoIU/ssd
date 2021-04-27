package hotel_management.core.assignable_items.furniture.lamps;

public class WallLamp extends Lamp {
  public WallLamp(String serialNumber, String furnitureModel, double cost, double wattage) {
    super(serialNumber, furnitureModel, cost, wattage);
  }

  @Override
  public String toString() {
    return "Wall lamp of model " + FurnitureModel + ", serial #: " + SerialNumber + " of wattage " + Wattage + " W. Cost: " + Cost;
  }
}
