public class Main {
    public static void main (String [] arggs){

        Phone ph1 = new Phone();
        ph1.name = "Apple 13 pro";
        ph1.color = "Gold color";

        Phone ph2 = new Phone();
        ph2.name = "Apple 14 pro";
        ph2.color = "Sky Blue color";

        ph1.call();
        ph2.call();
    }
}
