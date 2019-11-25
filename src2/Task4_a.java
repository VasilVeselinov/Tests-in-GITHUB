import java.util.Scanner;

public class Task4_a {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int numberN;
        // Проверка за коректен вход, интервал [1...100]
        do {
            System.out.print("Въведете число N от интервала [1...100]: ");
            while (!inputUser.hasNextInt()) {
                inputUser.next();
                System.out.print("Въведете само полжително число N от интервала [1...100]: ");
            }
            numberN = inputUser.nextInt();

        } while (numberN < 1 || numberN > 100);

        // Печат на фигурата
        for (int i = numberN; i > 0; i--) {
            for (int j = i; j <= numberN; j++) {
                if (j != numberN) {
                    System.out.print("# ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}