package extends1.ex;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected void print() {
        System.out.print("name : " + name + " , price : " + price);
    }

    public int getPrice() {
        return price;
    }
}
