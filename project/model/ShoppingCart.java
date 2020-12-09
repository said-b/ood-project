package project.model;

import java.util.HashMap;

public class ShoppingCart extends UserItemList {
    private HashMap<Integer,Integer> quantities;

    public ShoppingCart(MasterList iL) {
        super(iL);
    }

    public void add(Item item, int amount){
        map.put(item.getId(), item);
        quantities.put(item.getId(), amount);
    }
    public void add(int id, int amount){
        map.put(id, masterList.get(id));
        quantities.put(id, amount);
    }
    public void purchase(){

        for(Integer i: quantities.keySet()){
            try{
                map.get(i).changeQuantity(-quantities.get(i));
                map.remove(i);
            }catch(RuntimeException e){
                //if item in shopping cart is not in masterlist
            }
        }
    }
//    @Override
//    public project.model.Item get(int id) {
//        return null;
//    }
}
