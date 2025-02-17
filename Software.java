package assignment3Contents;

class Software extends Item{
    private String publisher = "Unknown";
    Software(String name, double price, String publisher){
        super(name, price);
        this.publisher = publisher;
    }
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + getPrice() + "\n"
                + "\t" + "Publisher: " + publisher;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        if (publisher.isBlank()){
            publisher = "Unknown";
        }else{
            this.publisher = publisher;
        }
    }
}