package Lab6;

public class Calculator {
    public int calculateHowMuchBottlesCanGetInTheVan(Wallet wallet, Bottle_of_coffee[] bottle_of_coffees) {
        int count = 0;
        int counter = 0;
        for (Bottle_of_coffee bottle : bottle_of_coffees) {
            if (bottle == null) break;
            else {
                count ++;
                counter += bottle.getPriceForBottle();
                System.out.println("You take one " + bottle.getType() + " " + bottle.getSize() + " coffee");
                System.out.println("You take one " + bottle.getType() + " " + bottle.getSize() + " coffee");
                if (counter > wallet.getMoney()) {
                    count--;
                    break;
                }
            }
        }
        System.out.println("You can take " + count + " bottles that I counted earlier");
        return count;
    }
    public Bottle_of_coffee[] findAllElementsWithCertainType(Bottle_of_coffee[] bottle_of_coffees, int quantity, Coffee.TYPE type) {
        Bottle_of_coffee[] bottle_of_coffees_modified = new Bottle_of_coffee[quantity];
        for (int i = 0; i < quantity; i++) {
            if (bottle_of_coffees[i].getType() == type) bottle_of_coffees_modified[i] = bottle_of_coffees[i];
        }
        return bottle_of_coffees_modified;
    }
}
