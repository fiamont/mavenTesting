package mavenTesting.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    }

    public static void app() {
        Pinetree pinetree = createPinetree();

        Scanner s = new Scanner(System.in);

        System.out.println("Do you want to see the forest? (yes or no)");
        String answer = s.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            forest(pinetree);
            String answer2 = s.nextLine();

            if (answer2.equalsIgnoreCase("yes")) {
                somethingIsHappening(pinetree);

            } else if (answer2.equalsIgnoreCase("no")) {
                System.out.println("Ok, bye!");
            }

        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Ok, bye!");
        }
    }
    public static ArrayList<Squirrel> createSquirrels (){
        ArrayList<Squirrel> squirrelList = new ArrayList<Squirrel>();
        Squirrel tintin = new Squirrel(401, 9, true, 4, "Tintin");
        Squirrel jumper = new Squirrel(439, 11, false, 3, "Jumper");
        Squirrel kukui = new Squirrel(354, 5, true, 2, "Kukui");
        squirrelList.add(tintin);
        squirrelList.add(jumper);
        squirrelList.add(kukui);

        return squirrelList;
    }
    public static Owl createOwl(){
        return new Owl(91, true, 7, 456, "Hedvig");
    }
    public static Pinetree createPinetree(){
        return new Pinetree(38, 103, 0, createOwl(), createSquirrels());
    }

    public static void forest(Pinetree pinetree){
        System.out.println(pinetree);
        System.out.println("\n" + pinetree.getSquirrels().get(0).getName());
        System.out.println(pinetree.getSquirrels().get(1).getName());
        System.out.println(pinetree.getSquirrels().get(2).getName());
        System.out.println("\n" + pinetree.getOwl().getName());
        System.out.println("\nSomething is happening in the forest, do you wanna see? (yes or no)");
    }

    public static void somethingIsHappening(Pinetree pinetree){
        System.out.println("\nDid the tree fall?: " + pinetree.fall(0, 103));
        System.out.println("Did the squirrel Tintin eat?: " + pinetree.getSquirrels().get(0).eat(true, 9));
        System.out.println("Did the squirrel Jumper eat?: " + pinetree.getSquirrels().get(1).eat(false, 11));
        System.out.println("Did the squirrel Kukui eat?: " + pinetree.getSquirrels().get(2).eat(new Pinetree.PineCone()));
        System.out.println("Did the owl Hedvig eat?: " + pinetree.getOwl().eat(true, true));
    }

}