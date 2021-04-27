package hotel_management.core.assignable_items.furniture.lamps;

import hotel_management.core.assignable_items.furniture.Furniture;

public abstract class Lamp extends Furniture {
  protected double Wattage;

  public Lamp(String serialNumber, String furnitureModel, double cost, double wattage) {
    super(serialNumber, furnitureModel, cost);
    Wattage = wattage;
  }

  public double getWattage() {
    return Wattage;
  }
}
