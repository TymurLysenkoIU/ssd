package hotel_management.core.assignable_items.furniture.beds;

import hotel_management.core.assignable_items.furniture.Furniture;

public abstract class Bed extends Furniture {
  public Bed(String serialNumber, String furnitureModel, double cost) {
    super(serialNumber, furnitureModel, cost);
  }
}
