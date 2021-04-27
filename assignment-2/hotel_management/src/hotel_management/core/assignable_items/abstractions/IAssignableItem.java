package hotel_management.core.assignable_items.abstractions;

import hotel_management.core.User;

/**
 * Interface that enables to assign object of an implementing class to a person in hotel.
 */
public interface IAssignableItem {
  void assignToUser(User user);
}
