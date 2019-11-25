import java.util.Scanner;

public class Task4_i {
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
        for (int i = 0; i < numberN; i++) {
            System.out.print("# ");
            if (i == 0 || i == numberN - 1) {
                for (int j = 1; j < numberN - 1; j++) {
                    System.out.print("# ");
                }
            } else {
                for (int j = 1; j < numberN - 1; j++) {
                    if (j == i || j == numberN - (i + 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("#");
        }
    }
}
