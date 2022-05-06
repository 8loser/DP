package com.example.dp.pizza;

/**
 * 紐約風味 pizza 店
 * 要繼承抽象 pizza 店
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
//        } else if (type.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
//        } else if (type.equals("clam")) {
//            return new NYStyleClamPizza();
//        } else if (type.equals("veggie")) {
//            return new NYStyleVeggiePizza();
        } else return null;
    }
}
