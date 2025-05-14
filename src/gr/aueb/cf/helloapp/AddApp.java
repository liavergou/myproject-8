package gr.aueb.cf.helloapp;

public class AddApp {

    public static void main(String[] args) {
        System.out.println(add(3,5));
<<<<<<< HEAD
        System.out.printf("%4d", add(7,2));
=======
        System.out.printf("%d", add(3,5));
>>>>>>> fix/addapp-print-formated

    }
    public static int add(int a, int b){
        return a+b;
    }
}
