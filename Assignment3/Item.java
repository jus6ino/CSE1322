package assignment3Contents;

class Item{
    private int id;
    private static int nextId = 0;
    private double price = 0.00;
    private String name;

    Item(String name, double price){
        id = nextId;
        nextId++;
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "Item: " + name + " (#" + getId() + ") | Price: $" + price;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}