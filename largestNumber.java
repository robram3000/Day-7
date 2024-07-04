import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
              System.out.println("All numbers are equal");
         }
        else
        {
            int largest = numbers[0];
            for(int i = 1 ; i < 3 ; i++ )
                 if(numbers[i] > largest)
                           largest = numbers[i];

            System.out.println("The largest number is " + largest);
        }
    }
}
