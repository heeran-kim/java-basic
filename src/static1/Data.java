package static1;

public class Data {
    public String name;
    public static int count;

    public Data(String name) {
        this.name = name;
        count++;
    }
}
