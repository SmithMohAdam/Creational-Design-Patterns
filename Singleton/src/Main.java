public class Main {
    public static void main(String[] args) {

        Counter objA = Counter.getCounter();
        objA.addCount();
        System.out.println("The counter in object A = "+ objA.count);

        Counter objB = Counter.getCounter();
        System.out.println("The counter in object B before calling addCount method= " + objB.count);
        objB.addCount();
        System.out.println("The counter in object B after calling addCount method= " + objB.count);

        objA.addCount();
        System.out.println("The counter in object A = "+ objA.count);
        System.out.println("The counter in object B = " + objB.count);

    }
}