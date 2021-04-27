package hotel_management.core;

import hotel_management.core.assignable_items.Apartment;
import hotel_management.core.assignable_items.furniture.Furniture;

public class Hotel {
  Apartment[] Apartments;

  public Hotel(Apartment[] apartments) {
    Apartments = apartments;
  }

  public Apartment[] getApartments() {
    return Apartments;
  }
}
