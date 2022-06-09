import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number ");

        int num = s.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++){
            count += i;
        }
        System.out.printf("The sum of 1 to %d is %d", num, count);

        s.close();
    }
}
