import java.util.Scanner;

public class firstjava{
    public static void main(String[] args){
        char gender;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is you name : ");

        String name = keyboard.nextLine();

        System.out.println("How old are you : ");
        
        byte age = keyboard.nextByte();

        System.out.println("What is your Gender (M/F)): ");

        gender = keyboard.next().charAt(0);


        System.out.println("Your name is : " + name + " Your age is : " + age + " your Gender is : " + gender); 
    }
}