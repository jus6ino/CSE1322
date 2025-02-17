package assignment3Contents;

class Collectable extends DigitalGood {
    private String type = "";

    Collectable(String name, double price, String description, String type){
        super(name, price, description);
        this.type = type;
    }
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + getPrice() + "\n"
                + "\t" + "Description: " + getDescription() + "\n" + "\tcan be used as " + type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("emoticon") || type.equalsIgnoreCase("avatar") || type.equalsIgnoreCase("background") || type.equalsIgnoreCase("nothing")){
            this.type = type;
        }else{
            this.type = "nothing";
        }
    }
}
