import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Squirrel> squirrelList = new ArrayList<Squirrel>();
        Squirrel tintin = new Squirrel(401,9, true, 4, "Tintin");
        Squirrel jumper = new Squirrel(439, 11, false,3, "Jumper");
        Squirrel kukui = new Squirrel(354, 5, true, 2, "Kukui");
        squirrelList.add(tintin);
        squirrelList.add(jumper);
        squirrelList.add(kukui);

        Owl hedvig = new Owl(91, true,7,456, "Hedvig");

        Pinetree pinetree = new Pinetree(38, 103, 0, hedvig, squirrelList);

        Scanner s = new Scanner(System.in);

        System.out.println("Do you want to see the forrest? (yes or no)");
        String answer= s.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println(pinetree);
            System.out.println("\n" + tintin);
            System.out.println(jumper);
            System.out.println(kukui);
            System.out.println("\n" + hedvig);

            System.out.println("\nSomething is happening in the forrest, do you wanna see? (yes or no)");
            String answer2= s.nextLine();

            if(answer2.equalsIgnoreCase("yes")){
                System.out.println("\nDid the tree fall?: " + pinetree.fall(0,103));
                System.out.println("Did the squirrel Tintin eat?: " + tintin.eat(true,9));
                System.out.println("Did the squirrel Jumper eat?: " + jumper.eat(false,11));
                System.out.println("Did the squirrel Kukui eat?: " + kukui.eat(new Pinetree.PineCone()));
                System.out.println("Did the owl Hedvig eat?: " + hedvig.eat(true,true));
            }else if(answer2.equalsIgnoreCase("no")){
                System.out.println("Ok, bye!");
            }

        }else if(answer.equalsIgnoreCase("no")){
            System.out.println("Ok, bye!");
        }

    }
}