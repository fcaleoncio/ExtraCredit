import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index <= itemList.size()) {
        itemList.get(index);
        this.earnings += itemList.get(index).getCost();
        System.out.println(this.name + " sold " + itemList.get(index).getName() + " for " + itemList.get(index).getCost());
    }
    else {
        System.out.println("There are only " + itemList.size() + " items in " + this.name);
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    for(int i=0; i<itemList.size(); i++) {
        if (name.equals(itemList.get(i).getName())){
            itemList.get(i);
            this.earnings += itemList.get(i).getCost();
            System.out.println(this.name + " sold " + itemList.get(i).getName() + " for " + itemList.get(i).getCost());
        }
        else {
            System.out.println(this.name + " doesn't sell " + name);
        }
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (itemList.contains(i)) {
        this.earnings += i.getCost();
        System.out.println(this.name + " sold " + i.getName() + " for " + i.getCost());
    }
    else {
        System.out.println(this.name + " doesn't sell " + i.getName());
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(int i=0; i<itemList.size(); i++) {
        if(type.equals(itemList.get(i).getType())) {
            System.out.println(itemList.get(i).getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(int i=0; i<itemList.size(); i++) {
        if(itemList.get(i).getCost() <= maxCost) {
            System.out.println(itemList.get(i).getName());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(int i=0; i<itemList.size(); i++) {
        if(itemList.get(i).getCost() >= minCost) {
            System.out.println(itemList.get(i).getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (int i=0; i<storeList.size(); i++) {
        System.out.println("Earnings of " + storeList.get(i).getName() + ": " + storeList.get(i).getEarnings());
    }
  }
}
