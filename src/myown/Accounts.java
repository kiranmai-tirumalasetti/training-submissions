package myown;

public class Accounts {
    int a = 10;  // instance variable
    int b = 20;  // instance variable
String d = "Raj";
Double  e =  (double) 77;
    public static void main(String[] args) {
        Accounts obj = new Accounts();  // create object to access instance variables
        int c = obj.a + obj.b;          // perform addition
        System.out.println("Sum: " + c);
    }
}

