package src;

public class AdvancedPatterns {
    public static void main(String[] args) {
        // Pattern 1: Butterfly Pattern
        int n1 = 5;
        System.out.println("Pattern 1: Butterfly");

        // Upper half of the butterfly
        for (int i = 1; i <= n1; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces between the wings
            int spaces = 2 * (n1 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n1; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces between the wings
            int spaces = 2 * (n1 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Expected Output :
        // *                 * 
        // * *             * * 
        // * * *         * * * 
        // * * * *     * * * * 
        // * * * * * * * * * * 
        // * * * * * * * * * * 
        // * * * *     * * * * 
        // * * *         * * * 
        // * *             * * 
        // *                 * 

        // Pattern 2: Solid Rectangle with Space Padding
        int n2 = 4; // Height of the rectangle
        System.out.println("\nPattern 2: Solid Rectangle with Space Padding");

        for (int i = 1; i <= n2; i++) {
            int spaces = (n2 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n2; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Expected Output :
        /*
              * * * *
            * * * *
          * * * *
        * * * *
        */

        // Pattern 3: Numbered Right-Aligned Triangle
        int n3 = 5; // Height of the triangle
        System.out.println("\nPattern 3: Numbered Right-Aligned Triangle");

        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= n3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Expected Output :
        /*
            1
          2 2
        3 3 3
      4 4 4 4
    5 5 5 5 5
        */

        // Pattern 4: Pyramid with Numbers
        System.out.println("\nPattern 4: Pyramid with Numbers");
        int n4 = 5;
        for(int i=1; i<=n4; i++) {
            //spaces
            for(int j=1; j<=n4-i; j++) {
                System.out.print(" ");
            }
 
 
            //first part
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
 
 
            //second part
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
 

        // Expected Output :
        /*
              1
            2 1 2
          3 2 1 2 3
        4 3 2 1 2 3 4
      5 4 3 2 1 2 3 4 5
        */

        // Pattern 5: Star Pyramid
        int n5 = 5; // Height of the pyramid
        System.out.println("\nPattern 5: Star Pyramid");

        for (int i = 1; i <= n5; i++) {
            for (int j = 1; j <= n5 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Expected Output :
        /*
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
        */

        // Pattern 6: Inverted Star Pyramid
        int n6 = 4;
        System.out.println("\nPattern 6: Inverted Star Pyramid");

        for (int i = n6; i >= 1; i--) {
            for (int j = 1; j <= n6 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Expected Output :
        /*
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
        */
    }
}
