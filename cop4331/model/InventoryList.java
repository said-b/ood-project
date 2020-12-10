package cop4331.model;

public class InventoryList extends UserItemList{

    public InventoryList(MasterList masterList){
        super(masterList);
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

    public void createItem(double price, String name, int quantity, String descText, String img){

        Item item = new Item(masterList.getIdCounter(),price, name, quantity, descText, img);
        this.add(item);
    }


}
