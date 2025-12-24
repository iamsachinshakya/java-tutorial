package classAndObject;

public class ClassAndObject {
    public static void main(String[] args) {

        Greeting g1 = new Greeting();
        g1.printGreet();

        Greeting g2 = new Greeting("Good evening");
        g2.printGreet("Soham");

    }
}

class Greeting {
    String greet;

    public Greeting() {
        this.greet = "good morning!";
    }

    public Greeting(String greet) {
        this.greet = greet;
    }

    void printGreet() {
        System.out.println(this.greet);
    }

    void printGreet(String name) {
        System.out.println(name + " " + this.greet);
    }
}