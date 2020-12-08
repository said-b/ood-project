package project.model;

import java.io.Serializable;
import java.util.Objects;

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


    User(String username, String password, MasterList masterList){
        this.username = username;
        this.password = password;
        cart = new ShoppingCart(masterList);
        wishList = new WishList(masterList);
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public WishList getWishList() {
        return wishList;
    }


}
