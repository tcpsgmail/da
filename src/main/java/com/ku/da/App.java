package com.ku.da;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    }

    public boolean confirmations(int[] a) {
        boolean da = true;
        for (int ka : a) {
            if (ka < 6) {
                da = false;
            }
        }
        return da;
    }
}
