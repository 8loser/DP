package com.example.dp.pizza;

/**
 * 抽象 Pizza 商店 (工廠)
 * 每間 pizza 店都要繼承該類別
 * 並且實踐 createPizza() 決定產生的 pizza (產品)
 * 封裝部會變動的方法 prepare(), bake(), cut(), box()
 * 開放擴充變動的方法 createPizza()
 */
public abstract class PizzaStore {

    /**
     * 每個繼承的 pizza 商店，必須實踐抽象 createPizza()
     * protected 只有子類別可以存取
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

    /**
     * 告知工廠要哪種口味的 pizza 跟工廠取得 pizza
     *
     * @param type pizza 種類
     * @return Pizza
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        // 會變更的; pizza 口味
        pizza = createPizza(type);

        // 不會變更的動作
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
