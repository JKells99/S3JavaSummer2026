package musicstore.usermanagnment;

import musicstore.inventory.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private List<Product> purchaseHistory;

    public Customer(int id, String name, String address, String phone) {
        super(id, name, address, phone);
        this.purchaseHistory = new ArrayList<>();
    }

    public List<Product> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(List<Product> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("purchaseHistory=").append(purchaseHistory).append(", ")
                .append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
