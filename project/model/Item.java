package project.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *  Class holds data that represents items in the store.
 */
public class Item implements Serializable {
    private int id;
    private double price;
    private String name;
    private int quantity;
    private String descText;
    private String img;

    /**
     *
     * @param id
     * @param price
     * @param name
     * @param quantity
     * @param descText
     * @param img
     */
    public Item(int id, double price, String name, int quantity, String descText, String img) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.descText = descText;
        this.img = img;
    }


    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity){
        this.quantity += quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescText() {
        return descText;
    }

    public void setDescText(String descText) {
        this.descText = descText;
    }

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

    public String getImg() {
        return img;
    }
}
