import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Customer> customers = CustomerManagementMenu.getInstance().customers;

       for (Customer customer : customers) {
           System.out.println(customer);
       }

    }
}