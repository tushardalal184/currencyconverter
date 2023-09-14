import java.util.*;

public class StudentCalculator {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the marks obtained in physics(out of 100)");
        int physics = scn.nextInt();

        System.out.println("enter marks obtained in chemistry(out of 100)");
        int chemistry = scn.nextInt();

        System.out.println("enter  marks obtained in mathematics(out of 100)");
        int mathematics = scn.nextInt();

        System.out.println("enter marks obtained in  computer science(out of 100)");
        int cscience = scn.nextInt();

        int totalmarks = physics + chemistry + mathematics + cscience;
        float percentage=totalmarks/4;

        System.out.println(" total marks obtained are "   + totalmarks);
        System.out.println("percentage obtained is "      +percentage);


        if(percentage>=91&& percentage<=100) {
            System.out.println("grade = A");

        }
        if(percentage>=81&&percentage<=90) {
            System.out.println("grade = B");

        }
        if(percentage>=71&&percentage<=80) {
            System.out.println("grade = C");

        }
        if(percentage>=61&&percentage<=70) {
            System.out.println("grade = D");
        }
        else if(percentage<=60){
            System.out.println("fail");
        }

    }
}
