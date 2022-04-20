package com.example.dp.duck;

/**
 * 模型壓，不會叫，不會飛
 */
public class ModelDuck extends Duck {

    /**
     * 建構式
     * new ModelDuck() 的時候會執行
     */
    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    /**
     * 要加 @override 讓編譯器知道這個是覆寫父類別方法
     * 且 parameter 跟 return 結構要跟父類別定義的 abstract 相同
     */
    @Override
    public void display() {
        System.out.println("這是一隻模型鴨");
    }
}
