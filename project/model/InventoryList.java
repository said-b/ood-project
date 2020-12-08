package project.model;

public class InventoryList extends UserItemList{

//    private HashMap<Integer, project.model.Item> map;
//    private project.model.MasterList masterList;


    public InventoryList(MasterList masterList){
        super(masterList);
//        this.masterList =  masterList;
    }
    @Override
    public void add(Item i) {
        masterList.add(i);
        map.put(i.getId(), i);
    }

    public void add(Item i, int amount){
        if(map.containsKey(i.getId())){
            i.changeQuantity(amount);
        }
    }
//    @Override
//    public project.model.Item get(int id) {
//        return map.get(id);
//    }

    public void createItem(double price, String name, int quantity, String descText, String img){

        Item item = new Item(masterList.getIdCounter(),price, name, quantity, descText, img);
        this.add(item);
    }


}
