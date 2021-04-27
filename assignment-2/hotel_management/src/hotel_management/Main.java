package hotel_management;

import hotel_management.core.Hotel;
import hotel_management.core.User;
import hotel_management.core.assignable_items.Apartment;
import hotel_management.core.assignable_items.furniture.Furniture;
import hotel_management.core.assignable_items.furniture.beds.DoubleBed;
import hotel_management.core.assignable_items.furniture.beds.SingleBed;
import hotel_management.core.assignable_items.furniture.lamps.DeskLamp;
import hotel_management.core.assignable_items.furniture.lamps.FloorLamp;
import hotel_management.core.assignable_items.furniture.lamps.WallLamp;
import hotel_management.core.assignable_items.furniture.tables.RoundTable;
import hotel_management.core.assignable_items.furniture.tables.SquareTable;

public class Main {
  public static void main(String[] args) {
    Apartment ap1 = new Apartment("1", 100, 2, new Furniture[] {
        new SingleBed("00000-B", "bed-00000", 50.0),
        new WallLamp("00000-WL", "wall-lamp-00000", 10.0, 100),
        new FloorLamp("00000-FL", "floor-lamp-00000", 5.0, 100),
        new DeskLamp("00000-DL", "desk-lamp-00000", 5.0, 100),
        new SquareTable("00000-ST", "square-table-00000", 15.0, 4),
    });

    Apartment ap2 = new Apartment("2", 150, 3, new Furniture[] {
        new DoubleBed("00001-B", "bed-00001", 70.0),
        new WallLamp("00001-WL", "wall-lamp-00001", 12.0, 100),
        new FloorLamp("00001-FL", "floor-lamp-00001", 8.0, 100),
        new DeskLamp("00001-DL", "desk-lamp-00001", 6.0, 100),
        new RoundTable("00001-RT", "round-table-00001", 12.0, 3),
    });

    Hotel hotel = new Hotel(new Apartment[] { ap1, ap2 });

    User tymur = new User(1, "Tymur");
    User max = new User(2, "Max");

    ap1.assignToUser(tymur);
    ap2.assignToUser(max);

    System.out.println(tymur);
    System.out.println("\n");
    System.out.println(max);
  }
}
