package project.model;

/**
 * The subclass of {@link project.model.UserItemList UserItemList} that contains a {@link project.model.Seller Sellers} available {@link project.model.Item Items}.
 * @author Saïd, Shiloh
 */
public class InventoryList extends UserItemList{

    /**
     * Creates a new InventoryList with the specified {@link project.model.MasterList Master List}
     * @param masterList the singleton containing all available items
     */
    public InventoryList(MasterList masterList){
        super(masterList);
    }
    @Override
    public void add(Item i) {
        masterList.add(i);
        map.put(i.getId(), i);
    }
    /**
     * Adds an {@link project.model.Item Item} and the quantity desired
     * @param i the item to be added
     * @param amount the quantity of the item to be added
     * @precondition i != null && amount > 0
     */
    public void add(Item i, int amount){
        if(map.containsKey(i.getId())){
            i.changeQuantity(amount);
        }
    }
    /**
     * Creates a new {@link project.model.Item Item} and adds it to this list and the {@link project.model.MasterList Master List}
     * @param price the price of the item
     * @param name the name of the item
     * @param quantity the quantity of the item available
     * @param descText the description of the item
     * @param img an image of the item
     */
    public void createItem(double price, String name, int quantity, String descText, String img){

        Item item = new Item(masterList.getIdCounter(),price, name, quantity, descText, img);
        this.add(item);
    }


}
