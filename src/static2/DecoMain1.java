package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);
        // Due to that it is an instance method, need to create an instance to use a method.

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

        String deco2 = DecoUtil2.deco(s);
        // Due to that it is a class method, no need to create an instance to use a method,
        System.out.println("after2: " + deco2);
    }
}
