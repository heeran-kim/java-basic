package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Garlic", 2000, 2);
        Item item2 = new Item("Lettuce", 3000, 4);
        Item item3 = new Item("Garli", 2000, 2);
        Item item4 = new Item("Lettuc", 3000, 4);
        Item item5 = new Item("Garl", 2000, 2);
        Item item6 = new Item("Lettu", 3000, 4);
        Item item7 = new Item("Gar", 2000, 2);
        Item item8 = new Item("Lett", 3000, 4);
        Item item9 = new Item("Ga", 2000, 2);
        Item item10 = new Item("Let", 3000, 4);
        Item item11 = new Item("G", 2000, 2);
        Item item12 = new Item("Le", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);
        cart.addItem(item7);
        cart.addItem(item8);
        cart.addItem(item9);
        cart.addItem(item10);
        cart.addItem(item11);
        cart.addItem(item12);

        cart.displayItems();
    }
}
