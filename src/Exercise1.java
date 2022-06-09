import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Enter the first number ");
        int num1 = s.nextInt();
        
        System.out.print("Enter the last number ");
        int num2 = s.nextInt();

        for(int i = num1; i <= num2; i++){
            System.out.print(num1);
            num1++;

        }

        s.close();
    }
}
