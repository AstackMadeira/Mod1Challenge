package madeira.cs;

import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {

        //Problem I
        String myString1 = "Annabelle Mary Stack";
        String myString2 = "Annabelle";
        String myString3 = "Mary";
        String myString4 = "Stack";

        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString3);
        System.out.println(myString4);

        //Problem II
        String myString5 = "Hello";
        String myString6 = "World";

        System.out.print(myString5);
        System.out.print(myString6);

        //Problem III
        int age = 17;
        System.out.println(age);

        //Problem IV

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: Annabelle");
        String FirstName = input.nextLine();
        System.out.println("This is my first name" + FirstName);

        System.out.println("Enter name: Stack");
        String LastName = input.nextLine();
        System.out.println("This is my last name" + LastName);

        //Problem V

        int i = 3;
        int x = 1;
        int j = 2;
        boolean b = false;
        b = j % x == i;
        System.out.print(b);

    }
}