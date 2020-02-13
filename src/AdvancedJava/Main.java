package AdvancedJava;

public class Main {
    public static void main(String[] args){
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+ name);
            }
        };

        gm.greet("Avinash");

        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello "+ name);
        };

        gm2.greet("Ankita");
    }
}
