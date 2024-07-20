package com.helloshop.order; // convention ex) com.company.myApp

import com.helloshop.product.Product;
import com.helloshop.user.User;
// automatically imported according to what you use in the code.

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
