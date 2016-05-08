//First challenge

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println(input);
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(in.nextLine());

    }
}
