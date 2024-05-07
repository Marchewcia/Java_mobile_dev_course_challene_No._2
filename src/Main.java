import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i  = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(20);
        boolean bl = false;
        boolean win = false;
        System.out.println("Welcome to the game guess the number!");
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Should we start the game?");
        String input = sc.nextLine();
        if (Objects.equals(input, "yes")){
            while (!bl){
                i++;
                System.out.print("Input your number: ");
                int inp = sc.nextInt();
                System.out.print("\n");
                if(inp == number){
                    bl = true;
                    win = true;
                }
                if(inp != number && i == 5){
                    bl = true;
                }
                if(inp > number){
                    System.out.println("Number is lower than your number");
                }
                if(inp < number){
                    System.out.println("Number is higher than your number");
                }
            }
            if(win){
                System.out.println("Congratulations, you've guessed the number and won the game");
            }
            else{
                System.out.println("You didn't managed to guess the name and lost the game. The number was: " + number);
            }
        }
    }
}