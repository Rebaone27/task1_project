import java.util.Scanner;

public class helloWorld {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How do you feel about version control?");
        String answer = input.next();
        System.out.println(answer);
    }
}