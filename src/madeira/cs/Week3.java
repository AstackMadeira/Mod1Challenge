
package madeira.cs;

import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {

        //Problem I
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        int firstNumber = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a different number:");
        int secondNumber = input1.nextInt();

        if (firstNumber < secondNumber)
            System.out.print("The second number is greater");
        if (firstNumber > secondNumber) // you need curly braces here
            System.out.print("The first number is greater");
        // you should put an else if the numbers are equal


        //Problem II
        Scanner input2 = new Scanner(System.in);
        System.out.println("What is your favorite music genre?:");
        String favorite = input2.nextLine();
        boolean aa = false;

        if (favorite.equals("Alternative")) {
            System.out.println("Same!");
            // So here you'll just need a plan else!
            // This won't print Lame b/c what you're comparing is the string to a boolean
            // which will always be false 
        } else if (favorite.equals( aa || aa)) {
            System.out.println("Lame");
        }

        // Problem III
        Scanner input3 = new Scanner(System.in);

        int a = 21;
        int guess = 10;
        int count = 0;

        System.out.println("Try to guess my number!:");

        while (true) { // it would be best to say (count <= guess) so that it will run 10 times
            guess = input3.nextInt();
            count++;

            if (guess == a) {
                System.out.println("Your guess is correct. Congratulations!");
            } else if (count < 9) {
                // so this will print even if the user has only guessed once
                System.out.println("Wow no you're just wrong. I gave you 10 tries too. Oh well, better luck next time= oh wait you don't have another chance, do you? That's what I thought.");
            }

        }


        // // Problem IV
        // String repeat = new String(new char[5]).replace("*");

        // // Problem V
        // String repeated = new String(new char[2]).repeated.replace("*");

    }
}
