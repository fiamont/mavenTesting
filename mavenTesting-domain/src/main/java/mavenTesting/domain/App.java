package mavenTesting.domain;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    app();
    }

    //main method
    public static void app() {
        Pinetree pinetree = createPinetree();
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to see the forest? (yes = 1 or no = 0)");

            try {
                while(true){
                    int answer = s.nextInt();
                    if (answer==1) {
                        forest(pinetree);
                        int answer2 = s.nextInt();
                        if (answer2==1) {
                            somethingIsHappening(pinetree);
                            break;
                        } else if (answer2==0) {
                            System.out.println("Ok, bye!");
                            break;
                        }else {
                            System.out.println("type 1 for yes or 0 for no!");
                            answer2=s.nextInt();
                        }
                    } else if (answer==0) {
                        System.out.println("Ok, bye!");
                        break;
                    } else {
                        System.out.println("type 1 for yes or 0 for no!");
                        answer=s.nextInt();
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("type 1 for yes or 0 for no!");
                s.nextLine();
                int answer=s.nextInt();
            }

    }

    //creating objects-methods
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


    //"Story-methods"
    public static void forest(Pinetree pinetree){
        System.out.println(pinetree);
        System.out.println("\n" + pinetree.getSquirrels().get(0));
        System.out.println(pinetree.getSquirrels().get(1));
        System.out.println(pinetree.getSquirrels().get(2));
        System.out.println("\n" + pinetree.getOwl());
        System.out.println("\nSomething is happening in the forest, do you wanna see? (yes=1 or no=0)");
    }

    public static void somethingIsHappening(Pinetree pinetree){
        System.out.println("\nDid the tree fall?: " + pinetree.fall(0, 103));
        System.out.println("Did the squirrel Tintin eat?: " + pinetree.getSquirrels().get(0).eat(true, 9));
        System.out.println("Did the squirrel Jumper eat?: " + pinetree.getSquirrels().get(1).eat(false, 11));
        System.out.println("Did the squirrel Kukui eat?: " + pinetree.getSquirrels().get(2).eat(new Pinetree.PineCone()));
        System.out.println("Did the owl Hedvig eat?: " + pinetree.getOwl().eat(true, true));
    }

}