package musicstore;

import musicstore.usermanagnment.Customer;
import musicstore.usermanagnment.Employee;
import musicstore.usermanagnment.Person;

import java.util.List;

public class StoreTest {

    static void main() {

        // Check Customer and Employee Create Work

        Store store = new Store(1, "Main Store", "123 Main St");
        Customer customer = new Customer(1, "John", "123 Main St", "525-555-5555");
        Customer customer2 = new Customer(2, "Jane", "456 Elm St", "545-555-5556");
        Employee employee = new Employee(3, "Jane2", "456 Elm St", "535-555-5556", 50000, "Manager", "Sales");
        Employee employee2 = new Employee(4, "John2", "123 Main St", "555-555-5555", 50000, "Manager", "Sales");

        store.addPersonToStore(customer);
        store.addPersonToStore(employee);
        store.addPersonToStore(customer2);
        store.addPersonToStore(employee2);

        System.out.println();
        System.out.println();

        System.out.println(store.searchForPersonInSystemByPhoneNumber("525-555-5555"));


        System.out.println();
        System.out.println();

        System.out.println(employee.toString());
        System.out.println(customer.toString());

    }
}
