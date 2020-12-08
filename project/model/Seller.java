package project.model;

import java.util.Objects;

public class Seller extends User {
    private InventoryList inventoryList;
    Seller(String username, String password, MasterList masterList) {
        super(username,password,masterList);
        this.inventoryList = new InventoryList(masterList);
    }

    public InventoryList getInventoryList() {
        return inventoryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Seller seller = (Seller) o;
        return inventoryList.equals(seller.inventoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inventoryList);
    }
}
