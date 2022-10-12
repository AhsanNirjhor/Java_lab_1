import java.util.Random;
public class RandomArray
{
    public static void evenIndex(int[] randomNumbers)
    {
        System.out.print("Even index elements: ");

        for (int i = 0; i < randomNumbers.length; i++)
        {
            if (i % 2 == 0)

            {
                System.out.print(randomNumbers[i] + " ");
            }
        }
        System.out.println();
    }

    public static void evenElement(int[] randomNumbers)
    {
        System.out.print("Even element: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] % 2 == 0)
            {
                System.out.print(randomNumbers[i] + " ");
            }
        }
        System.out.println();
    }

    public static void reverseOrder(int[] randomNumbers)
    {
        System.out.print("Reverse order: ");
        for (int i = randomNumbers.length - 1; i >= 0; i--) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
    }
    public static void firstLast(int[] randomNumbers) {
        System.out.print("First and last element: ");
        System.out.print(randomNumbers[0] + " " + randomNumbers[randomNumbers.length - 1]);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Random rn = new Random();
        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rn.nextInt(50);

            System.out.print(randomNumbers[i] + " ");
        }

        System.out.println();
        evenIndex(randomNumbers);
        evenElement(randomNumbers);
        reverseOrder(randomNumbers);
        firstLast(randomNumbers);
    }
}
