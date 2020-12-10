package project.model;

import java.util.Objects;

/**
 * A special {@link project.model.User User} with access to an {@link project.model.InventoryList Inventory List} and can create {@link project.model.Item Items}.
 * @author Saïd, Shiloh
 */
public class Seller extends User {
    private InventoryList inventoryList;
    /**
     * Creates a Seller with the specified username, password, and the {@link project.model.MasterList Master List}
     * @param username the identification of the Seller
     * @param password the string to allow access to specified user
     * @param masterList the singleton containing all available items
     */
    Seller(String username, String password, MasterList masterList) {
        super(username,password,masterList);
        this.inventoryList = new InventoryList(masterList);
    }
/**
 * 
 * @return the Seller's {@link project.model.InventoryList Inventory List}
 */
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
