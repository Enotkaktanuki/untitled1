public class Main {
    public static void main(String[] args) {

        Phone mi = new Phone("999999440","Redmi", 1.2);
        Phone lin = new Phone("9465649440","Lin", 3.2);
        Phone mem = new Phone("564546540","Mem", 2.2);

        //lin.receiveCall("Kara");
       // mem.receiveCall("Gigi");
       mi.receiveCall("Julia",mem.getNumber());
        System.out.println(mem +" "+ mem.getNumber());
        System.out.println(lin +" "+ lin.getNumber());




    }
}