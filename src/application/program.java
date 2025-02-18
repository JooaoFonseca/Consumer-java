package application;

import entities.product;
import util.priceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<product> list = new ArrayList<>();

        list.add(new product("TV", 900.00));
        list.add(new product("Mouse", 50.00));
        list.add(new product("Tablet", 350.50));
        list.add(new product("HD Case", 80.90));

        list.forEach(new priceUpdate());

        list.forEach(System.out::println);

    }

}
