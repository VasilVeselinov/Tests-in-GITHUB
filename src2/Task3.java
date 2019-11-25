public class Task3 {
    public static void main(String[] args) {

        // Първи ред
        System.out.print("* | ");
        for (int i = 1; i <= 9; i++) {
            if (i != 9) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println();

        // Ред от тирета "-"
        for (int i = 0; i < 21; i++) {
            System.out.print("-");
        }

        System.out.println();

        // Печат на таблицата за умножение
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {

                System.out.print(" " + (i * j));
            }
            System.out.println();
        }
    }
}