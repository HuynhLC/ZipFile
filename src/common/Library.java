package common;

import java.util.Scanner;

public class Library {

    public final Scanner in = new Scanner(System.in);
    
    public int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Re-input!!!");
            }

        }
    }

    public String checkString() {
        while (true) {
            try {
                String str = in.nextLine().trim();
                if (str.length() == 0) {
                    throw new NumberFormatException();
                }
                return str;
            } catch (NumberFormatException e) {
                System.err.println("Not empty!!!");
            }
        }
    }
}
