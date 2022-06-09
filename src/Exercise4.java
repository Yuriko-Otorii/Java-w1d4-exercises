import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many integers will be added? ");
        int times = s.nextInt();

        int sum = 0;
        for(int i = 0; i < times; i++){
            System.out.print(" Enter an integer: ");
            int num = s.nextInt();
            sum += num;
        }
        System.out.printf("The sum is %d", sum);
        s.close();
    }
    
}
