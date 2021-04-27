package hotel_management.core.assignable_items.furniture;

import hotel_management.core.User;
import hotel_management.core.assignable_items.abstractions.IAssignableItem;

public abstract class Furniture implements IAssignableItem, Comparable<Furniture> {
  protected String SerialNumber;
  protected String FurnitureModel;
  protected double Cost;

  public Furniture(String serialNumber, String furnitureModel, double cost) {
    this.SerialNumber = serialNumber;
    this.FurnitureModel = furnitureModel;
    this.Cost = cost;
  }

  public String getSerialNumber() {
    return SerialNumber;
  }

  public String getFurnitureModel() {
    return FurnitureModel;
  }

  public double getCost() {
    return Cost;
  }

  @Override
  public int compareTo(Furniture o) {
    return SerialNumber.compareTo(o.SerialNumber);
  }

  @Override
  public void assignToUser(User user) {
    user.assignItem(this);
  }
}
