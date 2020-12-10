package project.model;

//Singleton pattern

/**
 * Singleton master list for items. This list will hold references to all items that exist.
 * @author Saïd, Shiloh
 */
public class MasterList extends ItemList {

//    private HashMap<Integer, project.model.Item> map;
    private static MasterList list = new MasterList();
    private int idCounter = 0;
    /**
     * Creates a new Master List
     */
    private MasterList(){
        super();
    }
    /**
     * 
     * @return the Master List instance
     */
    public static MasterList getInstance(){
        return list;
    }
    @Override
    public void add(Item i) {
        map.put(i.getId(), i);
        idCounter++;
    }

    @Override
    public Item get(int id) {
        return map.get(id);
    }
    /**
     * 
     * @return the total number of {@link project.model.Item Items} in the Master List
     */
    public int getIdCounter() {
        return idCounter;
    }

}
