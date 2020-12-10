package project.model;

/**
 * The subclass of {@link project.model.UserItemList UserItemList} that contains the {@link project.model.Item Items} a {@link project.model.User User} intends to purchase.    
 * @author Saïd, Shiloh
 */
public class WishList extends UserItemList {

//    private HashMap<Integer, project.model.Item> map;
//    private project.model.MasterList masterList;
    
/**
 * Creates a Wish List with the specified {@link project.model.MasterList MasterList} 
 * @param masterList the singleton containing all available items
 */
    public WishList(MasterList masterList){
        super(masterList);
//        this.masterList = masterList;
    }
    /**
     * Removes the specified {@link project.model.Item Item} from this Wish List and adds it to a {@link project.model.ShoppingCart Shopping Cart} 
     * @param item the Item to be transferred
     * @param cart the Shopping Cart the Item will be transferred to
     * @custom.precondition cart.containKey(item.getId())
     */
    public void transfer(Item item, ShoppingCart cart){
        cart.add(item);
        this.remove(item);
    }
    /**
     * Removes an {@link project.model.Item Item} from this Wish List by its id and adds it to a {@link project.model.ShoppingCart Shopping Cart} 
     * @param id the identifying number of the item in the {@link project.model.MasterList Master List}
     * @param cart the Shopping Cart the Item will be transferred to
     * @custom.precondition cart.containKey(masterList.get(id))
     */
    public void transfer(int id, ShoppingCart cart){
        cart.add(id);
        this.remove(id);
    }
//    @Override
//    public project.model.Item get(int id) {
//        return map.get(id);
//    }
}
