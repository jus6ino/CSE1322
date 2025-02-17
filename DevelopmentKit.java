package assignment3Contents;

import java.util.ArrayList;

class DevelopmentKit extends Software{
    private ArrayList<String> targetPlatforms = new ArrayList<>();

    DevelopmentKit(String name, double price, String publisher, ArrayList<String> targetPlatforms){
        super(name, price, publisher);
        this.targetPlatforms = targetPlatforms;
    }
    public String toString(){
        String platforms = "";
        if (targetPlatforms.isEmpty()){
            platforms += "\t\tNone";
        }else{
            for(String currentPlatform: targetPlatforms){
                platforms += "\t\t" + currentPlatform + "\n";
            }
        }

        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + getPrice() + "\n"
                + "\t" + "Publisher: " + getPublisher() + "\n"
                + "\t" + "Target platforms:" + "\n" + platforms;
    }

    public ArrayList<String> getTargetPlatforms() {
        return targetPlatforms;
    }
    public void setTargetPlatforms(ArrayList<String> targetPlatforms) {
        if (targetPlatforms.isEmpty()){
            targetPlatforms.add("None");
        }
        this.targetPlatforms = targetPlatforms;
    }
}