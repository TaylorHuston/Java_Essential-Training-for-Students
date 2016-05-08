//Second challenge

import java.util.Scanner;

public class CollegeCost {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        System.out.print("What is your name? ");
        name = in.nextLine();

        calculateTotal(name);
    }

    private static void calculateTotal(String name) {
        double total = 0.0;
        if (onCampus()) {
            total += livingExpenses();
        }

        total += tuition();
        total += booksAndSupplies();

        System.out.printf("The total college cost will be: $%7.2f ", total);
    }

    private static boolean onCampus() {
        while (true) {
            System.out.print("Will you be living on campus? y/n ");
            String answer = in.nextLine();
            if (answer.equals("y") || answer.equals("Y")) {
                return true;
            } else if (answer.equals("n") || answer.equals("N")) {
                return false;
            }
        }
    }

    private static double livingExpenses() {
        double total = 0.0;
        System.out.print("What is the cost of Room and Board for ONE year of on campus housing? ");
        total = in.nextDouble();
        total *= 4;
        return total;
    }

    private static double tuition() {
        double total = 0.0, creditCost = 0.0;
        int numCredits = 0;
        System.out.print("What is the cost per credit hour ");
        creditCost = in.nextDouble();
        System.out.print("How many credits will you need to finish your degree? ");
        numCredits =  in.nextInt();
        total = creditCost * numCredits;
        return total;
    }

    private static double booksAndSupplies() {
        double total = 0.0;
        System.out.print("What is the estimated cost of books and supplies for ONE year? ");
        total = in.nextDouble();
        total *= 4;
        return total;
    }

}
