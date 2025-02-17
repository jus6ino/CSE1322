package assignment3Contents;

class DigitalGood extends Item{
    private String description;
    DigitalGood(String name, double price, String description){
        super(name, price);
        this.description = description;
    }
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + getPrice() + "\n"
                + "\t" + "Description: " + getDescription();
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

