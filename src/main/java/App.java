package main.java;

public class App {
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        App obj = new App();

        System.out.println("Reversed = " + obj.reverseString("Hello"));
    }

}
