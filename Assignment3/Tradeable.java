package assignment3Contents;

class Tradeable extends DigitalGood{
    private int saleDelay = 0;

    Tradeable(String name, double price, String description, int saleDelay){
        super(name, price, description);
        this.saleDelay = saleDelay;
    }
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + getPrice() + "\n"
                + "\t" + "Description: " + getDescription() + "\n"
                + "Item can only be sold after being owned for " + saleDelay + " days";
    }
    public int getSaleDelay(){
        return saleDelay;
    }
    public void setSaleDelay(int saleDelay){
        if (saleDelay > 0){
            this.saleDelay = saleDelay;
        }
    }
}
