package solid;

interface Worker { void work(); }
interface Eater { void eat(); }

class Robot implements Worker {
    public void work() { System.out.println("Robot working continuously."); }
}
class Human implements Worker, Eater {
    public void work() { System.out.println("Human working."); }
    public void eat() { System.out.println("Human taking a lunch break."); }
}

public class I_ISP {
    public static void main(String[] args) {
        Robot bot = new Robot();
        bot.work();
    }
}