import java.util.ArrayList;
import java.util.List;

public class CustomerManagementMenu {
    private static CustomerManagementMenu customerManagementMenu = null;

    public List<Customer> customers;

    private CustomerManagementMenu() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Jin"));
        customers.add(new Customer(2,"Bob"));
        customers.add(new Customer(3,"Jax"));
    }

    public static CustomerManagementMenu getInstance() {
        if (customerManagementMenu == null) {
            customerManagementMenu = new CustomerManagementMenu();
        }
        return customerManagementMenu;
    }
}
