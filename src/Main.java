import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static final String SPACE = " ";
    public static final String SEPARATOR = "-";
    public static final String SIZETEXT = "Kérem a négyzet/piramis méretét: ";
    public static final String CHARACTERTEXT = "Kérem a megjelenítendő karaktert: ";

    public static void main(String[] args) {
        // interaktív négyzet és félpiramis rajzoló
        // kérjük be az adatokat a felhasználótól (négyzet/piramis mérete és a megjelenítendő karakter
        int size = getNumber(scanner);
        String character = getCharacter(scanner);
        drawHorizontalLine(size);
        drawSquare(size, character);
        drawHorizontalLine(size);
        drawHalfPyramidOne(size, character);
        drawHorizontalLine(size);
        drawHalfPyramidTwo(size, character);
        drawHorizontalLine(size);
    }

    public static int getNumber(Scanner scanner) {
        System.out.print(SIZETEXT);
        return scanner.nextInt();
    }

    public static String getCharacter(Scanner scanner) {
        System.out.print(CHARACTERTEXT);
        return scanner.next();
    }

    public static void drawSquare(int size, String character) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }
    }

    public static void drawHalfPyramidOne(int size, String character) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }
    }

    public static void drawHalfPyramidTwo(int size, String character) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }
    }

    public static void drawHorizontalLine(int size) {
        for (int i = 0; i < size * 2; i++) {
            System.out.print(SEPARATOR);
        }
        System.out.println();
    }
}
