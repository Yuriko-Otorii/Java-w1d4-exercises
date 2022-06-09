import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word ");

        String word = s.nextLine();
        for(int i = 0; i < word.length(); i++){
            System.out.printf("%s ", word);
        }
        s.close();
    }
    
}
