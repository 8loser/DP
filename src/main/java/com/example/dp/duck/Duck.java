package com.example.dp.duck;

/**
 * 抽象鴨子
 * <p>
 * 獨立出會更動的程式碼
 * 會更動:
 * 有些會飛 FlyBehavior
 * 有些會呱呱叫 QuackBehavior
 * <p>
 * 不會更動:
 * 所有鴨子都會游泳 swim()
 */
public abstract class Duck {

    /**
     * 變動的行為
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        // 為什麼要空的建構式
    }

    /**
     * display() 顯示每種鴨子的描述
     * 加上 abstract 表示繼承 Duck 的子類別，必須 implementation 該方法
     * 子類別使用 override 且 parameter 跟 return 結構要相同
     */
    public abstract void display();

    /**
     * 鴨子的行為
     */
    public void swim() {
        System.out.println("所有的鴨子都會游泳");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    /**
     * 動態設定行為，依賴注入
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
