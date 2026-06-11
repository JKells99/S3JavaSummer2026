package musicstore;

import musicstore.inventory.Product;
import musicstore.usermanagnment.Customer;
import musicstore.usermanagnment.Employee;
import musicstore.usermanagnment.Person;

import java.util.ArrayList;
import java.util.List;

// Each store will have a list of employees and customers, as well as an inventory of items for sale. The store will also have a name and an address.
public class Store {

    private int storeId;
    private String storeName;
    private String storeAddress;
    private List<Employee> employees;
    private List<Customer> customers;
    private List<Product> inventory;

    public Store(int storeId, String storeName, String storeAddress) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }


    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public void setInventory(List<Product> inventory) {
        this.inventory = inventory;


    }
    public void addPersonToStore(Person person) {
        if (person instanceof Employee) {
            printMessageToConsole("Adding Employee: " + person.getName());
            employees.add((Employee) person);
        } else if (person instanceof Customer) {
            printMessageToConsole("Adding Customer: " + person.getName());
            customers.add((Customer) person);
        }
    }
    public void removePersonFromStore(Person person) {
        if (person instanceof Employee) {
            printMessageToConsole("Removing Employee: " + person.getName());
            employees.remove(person);
        } else if (person instanceof Customer) {
            printMessageToConsole("Removing Customer: " + person.getName());
            customers.remove(person);
        }
    }

    public List<Person> searchForPersonInSystemByPhoneNumber(String phoneNumber) {
        List<Person> foundPersons = new ArrayList<>();
        printMessageToConsole("Searching for person with phone number: " + phoneNumber);
        for (Person person : employees) {
            if (person.getPhone().equals(phoneNumber)) {
                foundPersons.add(person);
            }
        }
        for (Person person : customers) {
            if (person.getPhone().equals(phoneNumber)) {
                foundPersons.add(person);
            }
        }

        return foundPersons;
    }

    public void printMessageToConsole(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Store{");
        sb.append("storeId=").append(storeId);
        sb.append(", storeName='").append(storeName).append('\'');
        sb.append(", storeAddress='").append(storeAddress).append('\'');
        sb.append(", employees=").append(employees);
        sb.append(", customers=").append(customers);
        sb.append(", inventory=").append(inventory);
        sb.append('}');
        return sb.toString();
    }
}
