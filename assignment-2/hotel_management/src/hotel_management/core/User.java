package hotel_management.core;

import hotel_management.core.assignable_items.abstractions.IAssignableItem;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class User implements Comparable<User> {
  int Id;
  String Name;
  List<IAssignableItem> AssignedItems;

  public User(int id, String name) {
    Id = id;
    Name = name;
    AssignedItems = new LinkedList<>();
  }

  public void assignItem(IAssignableItem item) {
    if (!AssignedItems.contains(item)) {
      AssignedItems.add(item);
    }
  }

  public List<IAssignableItem> getAssignedItems() {
    return Collections.unmodifiableList(AssignedItems);
  }

  @Override
  public int compareTo(User o) {
    return Integer.compare(Id, o.Id);
  }

  @Override
  public String toString() {
    StringBuilder assignedItemsStrBuilder = new StringBuilder();

    for (IAssignableItem item : AssignedItems) {
      assignedItemsStrBuilder.append("\n\t").append(item.toString());
    }

    return "User " + Name + " (id = " + Id + ") has the following at their disposal:\n" +
      assignedItemsStrBuilder
    ;
  }
}
