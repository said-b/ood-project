package cop4331.model;

public class UserItemList extends ItemList {

    protected MasterList masterList;
    public UserItemList(MasterList iL){
        super();
        this.masterList = iL;
    }
    public void add(int id){
        map.put(id, masterList.get(id));
    }
    public void remove(int id){
        map.remove(id);
    }
    public void remove(Item item){
        map.remove(item.getId());
    }
}
