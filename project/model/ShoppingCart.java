package project.model;

import java.util.HashMap;
/**
 * The subclass of {@link project.model.UserItemList UserItemList} that contains the {@link project.model.Item Items} a {@link project.model.User User} intends to purchase.
 * @author Saïd, Shiloh
 */
public class ShoppingCart extends UserItemList {
    private HashMap<Integer,Integer> quantities;
    /**
     * Creates a ShoppingCart with the specified {@link project.model.MasterList Master List} 
     * @param iL 
     */
    public ShoppingCart(MasterList iL) {
        super(iL);
    }
    /**
     * Adds an {@link project.model.Item Item} and the quantity desired to the cart
     * @param item the item to be added
     * @param amount the quantity of the item desired
     * @precondition item != null && amount > 0
     */
    public void add(Item item, int amount){
        map.put(item.getId(), item);
        quantities.put(item.getId(), amount);
    }
    /**
     * Adds an {@link project.model.Item Item} by its id in the {@link project.model.MasterList Master List} and the quantity desired to the cart
     * @param id the identifying number in the MasterList
     * @param amount the quantity of the Item to be added
     * @precondition masterList.containKey(id) && amount > 0
     */
    public void add(int id, int amount){
        map.put(id, masterList.get(id));
        quantities.put(id, amount);
    }
    /**
     * Simulates the process of purchasing items from the cart
     */
    public void purchase(){

        for(Integer i: quantities.keySet()){
            try{
                map.get(i).changeQuantity(-quantities.get(i));
                map.remove(i);
            }catch(RuntimeException e){
                //if item in shopping cart is not in masterlist
            }
        }
    }
//    @Override
//    public project.model.Item get(int id) {
//        return null;
//    }
}
