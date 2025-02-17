package assignment3Contents;

class VideoGame extends Software{
    private boolean multiplayerSupport;
    VideoGame(String name, double price, String publisher, boolean multiplayerSupport){
        super(name, price, publisher);
        this.multiplayerSupport = multiplayerSupport;
    }
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + getPrice() + "\n"
                + "\t" + "Publisher: " + getPublisher() + "\n"
                + "\t\t" + "Multiplayer support: " + multiplayerSupport;
    }
    public boolean isMultiplayerSupport() {
        return multiplayerSupport;
    }

    public void setMultiplayerSupport(boolean multiplayerSupport) {
        this.multiplayerSupport = multiplayerSupport;
    }
}