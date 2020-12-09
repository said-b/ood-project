package project.model;

//Singleton pattern

import java.io.IOException;

/**
 * Singelton master list for items. This list will hold references to all items that exist.
 */
public class MasterList extends ItemList {

//    private HashMap<Integer, project.model.Item> map;
    private static MasterList list = new MasterList();
    private int idCounter = 0;
    private static boolean exists = false;

    private MasterList(){
        super();
    }
    public static MasterList getInstance(){
//        if(exists){
//            throw new RuntimeException("Violates Singleton.");
//        }
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

//    private void readObject(java.io.ObjectInputStream in)
//            throws IOException, ClassNotFoundException {
//        in.defaultReadObject();
//        this.exists = true;
//
//    }


}
