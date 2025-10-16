import java.util.Random;

public class BiggestSmallestSaad {
    public static void main(String[] args) {

        Random random = new Random();
        int count = 1;

        int number = random.nextInt(100) + 1;
        int min = number;
        int max = number;

        while (count < 10) {
            number = random.nextInt(100) + 1;

            if (number < min)
                min = number;
            if (number > max)
                max = number;

            count++;
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Biggest number: " + max);
    }
}
