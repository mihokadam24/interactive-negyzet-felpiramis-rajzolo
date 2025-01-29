import java.util.Scanner;

public class Main {

    public static final String SPACE = " ";

    public static void main(String[] args) {
        // interaktív négyzet és félpiramis rajzoló
        // kérjük be az adatokat a felhasználótól (négyzet/piramis mérete és a megjelenítendő karakter

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a negyzet/piramis méretét: ");
        int size = scanner.nextInt();
        System.out.print("Kérem a karakter: ");
        String character = scanner.next();
        // Négyzet
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }
        System.out.println();

        // 1. félpiramis
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }
        System.out.println();

        // 2. félpiramis
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }

    }
}