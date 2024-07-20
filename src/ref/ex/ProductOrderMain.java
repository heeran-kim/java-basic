package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("Tofu", 2000,2);
        orders[1] = createOrder("Kimchi", 5000, 1);
        orders[2] = createOrder("Coke", 1500, 2);

        printOrder(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("Total Amount: " + totalAmount);
    }

    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("order. = " + order.productName);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
}
