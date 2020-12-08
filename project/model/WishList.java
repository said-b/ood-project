package project.model;

public class WishList extends UserItemList {

//    private HashMap<Integer, project.model.Item> map;
//    private project.model.MasterList masterList;

    public WishList(MasterList masterList){
        super(masterList);
//        this.masterList = masterList;
    }

    public void transfer(Item item, ShoppingCart cart){
        cart.add(item);
        this.remove(item);
    }
    public void transfer(int id, ShoppingCart cart){
        cart.add(id);
        this.remove(id);
    }
//    @Override
//    public project.model.Item get(int id) {
//        return map.get(id);
//    }
}
