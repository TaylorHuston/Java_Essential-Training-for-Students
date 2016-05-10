import java.util.Random;
import java.util.Stack;

//Fifth challenge
public class MonteCarlo {
    public static void main(String[] agrs) {
        System.out.println("The success rate is "+ simulation());

    }

    private static double simulation() {
        double attempts = 0.0;
        double success = 0.0;
        Random rand = new Random();

        for (int i = 0; i < 100000; i++) {
            int bowl[] = {1, 1, 1, 2, 2, 2};
            Stack<Integer> hand = new Stack();
            while (hand.size() < 3) {
                int x = rand.nextInt(6);
                if (bowl[x] != 0) {
                    hand.push(bowl[x]);
                    bowl[x] = 0;
                }
            }
            int a = hand.pop();
            int b = hand.pop();
            int c = hand.pop();
            if (a == b && b == c) {
                success +=1;
            }

        }

        return success / 100000;
    }

}
