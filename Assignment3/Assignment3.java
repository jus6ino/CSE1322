
package assignment3Contents;
import java.util.Scanner;
import java.util.ArrayList;
public class Assignment3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        ArrayList<Item> Items = new ArrayList<>();
        System.out.println("[VaporStore Item System]");

        while (run){
            System.out.println("");
            System.out.println("1. Add Video Game\n" +
                    "2. Add Development Kit\n" +
                    "3. Add Tradable\n" +
                    "4. Add Collectable\n" +
                    "5. List all items\n" +
                    "6. Update price\n" +
                    "7. Quit");
            System.out.println("Enter option:");
            int option = Integer.parseInt(sc.nextLine());
            System.out.println("");

            switch (option){
                case 1:
                    System.out.println("Enter name of item:");
                    String gameName = sc.nextLine();
                    System.out.println("Enter price of item:");
                    double gamePrice = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter name of publisher:");
                    String gamePublisher = sc.nextLine();
                    System.out.println("Does this game have multiplayer support?");
                    String gameSupport = sc.nextLine();


                    if (gameSupport.equalsIgnoreCase("yes")) {
                        VideoGame newGame = new VideoGame(gameName, gamePrice, gamePublisher, true);
                        Items.add(newGame);
                        System.out.println("Item added");
                    } else if (gameSupport.equalsIgnoreCase("no")) {
                        VideoGame newGame = new VideoGame(gameName, gamePrice, gamePublisher, false);
                        newGame.setPrice(gamePrice);
                        Items.add(newGame);
                        System.out.println("Item added");
                    } else {
                        System.out.println("Invalid response to multisupport");
                    }
                    break;
                case 2:
                    System.out.println("Enter name of item:");
                    String sdkName = sc.nextLine();
                    System.out.println("Enter price of item:");
                    double sdkPrice = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter name of publisher:");
                    String sdkPublisher = sc.nextLine();
                    System.out.println("Enter the name of each supported platform, one per line. Enter an empty line when done.");
                    ArrayList<String> targetPlatforms = new ArrayList<>();

                    boolean runPlatforms = true;
                    do {
                        String inputTarget = sc.nextLine();
                        if (inputTarget.isBlank()){
                            runPlatforms = false;
                        }else {
                            targetPlatforms.add(inputTarget);
                        }
                    }while (runPlatforms);
                    DevelopmentKit newSdk = new DevelopmentKit(sdkName, sdkPrice, sdkPublisher,targetPlatforms);
                    newSdk.setPrice(sdkPrice);
                    Items.add(newSdk);
                    System.out.println("Item added");

                    break;
                case 3:
                    System.out.println("Enter name of item:");
                    String tradeName = sc.nextLine();
                    System.out.println("Enter price of item:");
                    double tradePrice = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter item description");
                    String tradeDescription = sc.nextLine();
                    System.out.println("How many days before item can be resold?");
                    int tradeDays = Integer.parseInt(sc.nextLine());


                    Tradeable newTradeable = new Tradeable(tradeName, tradePrice, tradeDescription, tradeDays);
                    newTradeable.setPrice(tradePrice);
                    newTradeable.setSaleDelay(tradeDays);
                    Items.add(newTradeable);
                    System.out.println("Item added");

                    break;
                case 4:
                    System.out.println("Enter name of item:");
                    String collectName = sc.nextLine();
                    System.out.println("Enter price of item:");
                    double collectPrice = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter item description");
                    String collectDescription = sc.nextLine();
                    System.out.println("Where can this collectable be used? (emoticon, avatar, background, nothing");
                    String used = sc.nextLine();

                    Collectable newCollect = new Collectable(collectName,collectPrice,collectDescription,used);
                    newCollect.setPrice(collectPrice);
                    newCollect.setType(used);
                    Items.add(newCollect);
                    System.out.println("Item added");

                    break;
                case 5:
                    for (Item currentItem: Items){
                        System.out.println(currentItem);
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.println("Please enter the Id");
                    int itemId = Integer.parseInt(sc.nextLine());

                    boolean itemFound = false;
                    for (Item currentItem: Items){
                        if (currentItem.getId() == itemId){
                            System.out.println("Enter items new price");
                            double newPrice = Double.parseDouble(sc.nextLine());
                            currentItem.setPrice(newPrice);
                            itemFound =true;
                            System.out.println("Price updated");
                        }
                    }
                    if (!itemFound){
                        System.out.println("Item was not found");
                    }
                    break;
                case 0:
                    System.out.println("Shutting down...");
                    run = false;
                    break;
            }
        }
    }
}









