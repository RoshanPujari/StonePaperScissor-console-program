import java.util.Scanner;

public class Reader {
    public static String read(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose(Stone, Paper, Scissor): ");
        String text = scan.nextLine();

        return text;
    }
}
