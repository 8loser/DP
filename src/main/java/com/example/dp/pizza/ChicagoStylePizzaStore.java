package com.example.dp.pizza;

/**
 * 芝加哥風味 pizza 店
 * 要繼承抽象 pizza 店
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
//        } else if (type.equals("pepperoni")) {
//            return new ChicagoStylePepperoniPizza();
//        } else if (type.equals("clam")) {
//            return new ChicagoStyleClamPizza();
//        } else if (type.equals("veggie")) {
//            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
