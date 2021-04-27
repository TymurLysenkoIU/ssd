package hotel_management.core.assignable_items;

import hotel_management.core.User;
import hotel_management.core.assignable_items.abstractions.IAssignableItem;
import hotel_management.core.assignable_items.furniture.Furniture;

public class Apartment implements IAssignableItem {
  protected String ApartmentNumber;
  protected double Area;
  protected int NumRooms;
  protected Furniture[] FurnitureList;

  public Apartment(String apartmentNumber, double area, int numRooms, Furniture[] furniture) {
    ApartmentNumber = apartmentNumber;
    Area = area;
    NumRooms = numRooms;
    FurnitureList = furniture;
  }

  @Override
  public void assignToUser(User user) {
    user.assignItem(this);
    for (Furniture furniture : FurnitureList) {
      furniture.assignToUser(user);
    }
  }

  @Override
  public String toString() {
    return "Apartment #" + ApartmentNumber + " with " + NumRooms + " rooms of total area " + Area + " sq. m.";
  }
}
