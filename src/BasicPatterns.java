package src;

public class BasicPatterns {
    public static void main(String[] args) {
        // Pattern 1: Solid Rectangle
        System.out.println("Pattern 1: Solid Rectangle");
        int n = 4;
        int m = 5; // Dimensions of the rectangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 2: Hollow Rectangle
        System.out.println("Pattern 2: Hollow Rectangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 3: Right-Angled Triangle
        System.out.println("Pattern 3: Right-Angled Triangle");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 4: Inverted Right-Angled Triangle
        System.out.println("Pattern 4: Inverted Right-Angled Triangle");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 5: Right-Aligned Pyramid
        System.out.println("Pattern 5: Right-Aligned Pyramid");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 6: Number Triangle
        System.out.println("Pattern 6: Number Triangle");
        int n2 = 5;
        int number = 1;
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 7: 0-1 Tree
        System.out.println("Pattern 7: 0-1 Tree");
        int rows = 5; // number of levels in the tree
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            // print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // print the pattern for the current level
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 0) ? 1 : 0; // Toggle between 0 and 1
            }
            System.out.println();
        }

    }
}
