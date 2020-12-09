package project.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Top of class hierarchy for container classes that hold items
 */
public class ItemList implements Serializable {

    protected HashMap<Integer, Item> map;
    public ItemList(){
        map = new HashMap<>();
    }


    void add(Item item){
        map.put(item.getId(), item);
    }

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
