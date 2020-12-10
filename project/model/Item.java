package project.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *  Class holds data that represents items in the store.
 * @author Saïd, Shiloh
 */
public class Item implements Serializable {
    private int id;
    private double price;
    private String name;
    private int quantity;
    private String descText;
    private String img;

    /**
     * Creates a new Item with the specified parameters
     * @param id the id of the Item
     * @param price the price of the Item
     * @param name the name of the Item
     * @param quantity the quantity of the Item available
     * @param descText the description of the Item
     * @param img an image of the Item
     */
    public Item(int id, double price, String name, int quantity, String descText, String img) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.descText = descText;
        this.img = img;
    }
    /**
     * 
     * @return the id of this Item
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @return the price of this item
     */
    public double getPrice() {
        return price;
    }
    /**
     * Sets the price of this Item to the specified value
     * @param price the new price of this Item
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * 
     * @return the quantity available of this Item
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Modifies the quantity available of this Item by adding the parameter
     * @param quantity the quantity to be added
     * @precondition quantity >= this.quantity * -1
     */
    public void changeQuantity(int quantity){
        this.quantity += quantity;
    }
    /**
     * Sets the quantity available of this Item to the specified value
     * @param quantity the new quantity of this Item
     * @precondition quantity > 0
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**
     * 
     * @return the description of the Item
     */
    public String getDescText() {
        return descText;
    }
    /**
     * Sets the description of this Item
     * @param descText the new description of this Item
     * @precondition descText != null
     */
    public void setDescText(String descText) {
        this.descText = descText;
    }
    /**
     * 
     * @return the name of this Item
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Double.compare(item.price, price) == 0 &&
                quantity == item.quantity &&
                name.equals(item.name) &&
                descText.equals(item.descText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, name, quantity, descText);
    }
    /**
     * 
     * @return the image of this Item
     */
    public String getImg() {
        return img;
    }
}
