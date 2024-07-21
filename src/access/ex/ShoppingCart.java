package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (isFull()) {
            System.out.println("Full");
            return;
        }

        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("Printing Cart Items");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("Name: " + item.getName() + ", Total: " + item.getTotal());
        }
        System.out.println("Total price: " + calcTotalPrice());
    }

    private boolean isFull() {
        return (itemCount >= items.length);
    }

    private int calcTotalPrice() {
        int result = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            result += item.getTotal();
        }
        return result;
    }
}
