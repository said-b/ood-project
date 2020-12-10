package project.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Top of class hierarchy for container classes that hold {@link project.model.Item Items}.
 * @author Saïd, Shiloh
 */
public class ItemList implements Serializable {

    protected HashMap<Integer, Item> map;
    /**
     * Creates a new Item List
     */
    public ItemList(){
        map = new HashMap<>();
    }

    /**
     * Adds an {@link project.model.Item Item} to the list
     * @param item the item to be added
     * @precondition item != null
     */
    public void add(Item item){
        map.put(item.getId(), item);
    }
    /**
     * 
     * @param id the identifying number of the item
     * @return the {@link project.model.Item Item} of the specified id
     * @precondition this.containKey(item)
     */
    public Item get(int id){
        Item item = map.get(id);
        if(item != null ){
            return item;
        }
        else{
            throw new RuntimeException("Item does not exist");
        }

    };
}
