package com.example.dp.duck;

/**
 * 玩具鴨，會叫，不會飛
 */
public class RubberDuck extends Duck {

    /**
     * 建構式
     * new MallardDuck() 的時候會執行
     */
    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    /**
     * 要加 @override 讓編譯器知道這個是覆寫父類別方法
     * 且 parameter 跟 return 結構要跟父類別定義的 abstract 相同
     */
    @Override
    public void display() {
        System.out.println("這是一隻綠頭鴨");
    }
}
