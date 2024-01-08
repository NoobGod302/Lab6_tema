public class Main {
    public static void main(String[] args) {

        System.out.println("Man this nature is so crazy and beautiful");
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();


        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}