import java.util.Scanner;

//The Scanner class is used to get user input, and it is found in the java.util package

public class Main {

    public static void main (String [] args){

        Scanner Sc = new Scanner(System.in);

        System.out.println("What is Your Favourite Programing Language ?");
        String language = Sc.nextLine();

        System.out.println("You'r favourite Language is "+language);

    }
}
