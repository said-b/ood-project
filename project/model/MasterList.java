package project.model;

//Singleton pattern

/**
 * Singelton master list for items. This list will hold references to all items that exist.
 */
public class MasterList extends ItemList {

//    private HashMap<Integer, project.model.Item> map;
    private static MasterList list = new MasterList();
    private int idCounter = 0;

    private MasterList(){
        super();
    }
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

    public int getIdCounter() {
        return idCounter;
    }

}
