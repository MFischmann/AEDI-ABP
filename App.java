
public class App {
    public static void main(String[] args) {
        BinarySearchTreeOfInteger b = new BinarySearchTreeOfInteger();
        b.add(15);
        b.add(23);
        b.add(9);
        b.add(11);
        b.add(2);
        b.add(20);
        b.add(38);
        System.out.println(b.positionsCentral().toString());
        BinarySearchTreeOfInteger clone = b.clone();
        //b.add(40);
        System.out.println(b.positionsCentral().toString());
        //clone.add(41);
        System.out.println(clone.positionsCentral().toString());

    }   
}
