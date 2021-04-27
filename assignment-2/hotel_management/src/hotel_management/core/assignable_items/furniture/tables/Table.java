package hotel_management.core.assignable_items.furniture.tables;

import hotel_management.core.assignable_items.furniture.Furniture;

public abstract class Table extends Furniture {
  protected int NumberOfLegs;

  public Table(String serialNumber, String furnitureModel, double cost, int numberOfLegs) {
    super(serialNumber, furnitureModel, cost);
    NumberOfLegs = numberOfLegs;
  }

  public int getNumberOfLegs() {
    return NumberOfLegs;
  }
}
