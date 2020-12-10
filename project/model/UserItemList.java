package project.model;

/**
 * The subclass of {@link project.model.ItemList ItemList} that container classes that {@link project.model.User Users} interact with.
 * @author Saïd, Shiloh
 */
public class UserItemList extends ItemList {

    protected MasterList masterList;
    /**
     * Creates a UserItemList with the specified {@link project.model.MasterList Master List}
     * @param iL the singleton containing all available items
     * @precondition iL != null
     */
    public UserItemList(MasterList iL){
        super();
        this.masterList = iL;
    }
    /**
     * Adds an {@link project.model.Item Item} from its id in the {@link project.model.MasterList Master List}
     * @param id the identifying number of the item
     * @precondition masterList.containKey(id) 
     */
    public void add(int id){
        map.put(id, masterList.get(id));
    }
    /**
     * Removes an {@link project.model.Item Item} from its id in the {@link project.model.MasterList Master List}
     * @param id the identifying number of the item
     * @precondition map.containKey(item)
     */
    public void remove(int id){
        map.remove(id);
    }
    /**
     * Removes an {@link project.model.Item Item}
     * @param item the item to be removed
     * @precondition map.containKey(item.getId())
     */
    public void remove(Item item){
        map.remove(item.getId());
    }
}
