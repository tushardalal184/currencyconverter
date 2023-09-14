import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int numberoftries=0;
        int randnumber = rand.nextInt(100)+1;


        System.out.println("enter your guess(1-100)");
        int playerguess = scn.nextInt();
        numberoftries++;

            if (playerguess == randnumber) {
                System.out.println("correct option choose");

            } else if (randnumber > playerguess) {
                System.out.println(" the number is higher");


            } else {
                System.out.println(" the number is lower");

            }
    }
}
