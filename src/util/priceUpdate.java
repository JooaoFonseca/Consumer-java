package util;

import entities.product;

import java.util.function.Consumer;

public class priceUpdate implements Consumer<product> {

    @Override
    public void accept(product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
