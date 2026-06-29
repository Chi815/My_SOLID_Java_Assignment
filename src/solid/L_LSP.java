package solid;

class Bird { void eat() { System.out.println("This bird is eating food."); } }
class FlyingBird extends Bird { void fly() { System.out.println("This bird is flying high!"); } }
class Ostrich extends Bird {}

public class L_LSP {
    public static void main(String[] args) {
        Bird secureOstrich = new Ostrich();
        secureOstrich.eat();
        FlyingBird eagle = new FlyingBird();
        eagle.fly();
    }
}