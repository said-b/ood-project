package project.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Stores the account information, {@link project.model.ShoppingCart Shopping Cart}, and {@link project.model.WishList Wish List} of a User.
 * @author Saïd, Shiloh
 */
public class User implements Serializable {
    private ShoppingCart cart;
    private WishList wishList;
    protected String username;
    protected String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return cart.equals(user.cart) &&
                wishList.equals(user.wishList) &&
                username.equals(user.username) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cart, wishList, username, password);
    }

    /**
     * Creates a User with the specified username, password, and the {@link project.model.MasterList Master List} 
     * @param username the identification of the User
     * @param password the string to allow access to specified User
     * @param masterList the singleton containing all available items
     */
    User(String username, String password, MasterList masterList){
        this.username = username;
        this.password = password;
        cart = new ShoppingCart(masterList);
        wishList = new WishList(masterList);
    }
    /**
     * 
     * @return the {@link project.model.ShoppingCart Shopping Cart} of the User
     */
    public ShoppingCart getCart() {
        return cart;
    }
    /**
     * 
     * @return the {@link project.model.WishList Wish List} of the User
     */
    public WishList getWishList() {
        return wishList;
    }


}
