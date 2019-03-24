import java.util.Scanner;

public class ConsoleInputProvider implements UserInputProvider {

    private final Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        return scanner.nextLine();
    }



}
