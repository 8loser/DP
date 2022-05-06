# Design Pattern

# 策略模式 (Strategy Pattern)

code: [Duck](/src/main/java/com/example/dp/duck)

- 行為透過委派 (delegate) 執行
    - [FlyBehavior](/src/main/java/com/example/dp/duck/FlyBehavior.java)
    - [QuackBehavior](/src/main/java/com/example/dp/duck/QuackBehavior.java)
- 行為透過合成 (composition) 定義
    - [MallardDuck](/src/main/java/com/example/dp/duck/MallardDuck.java#L12)
    - [ModelDuck](/src/main/java/com/example/dp/duck/ModelDuck.java#L12)
    - [RubberDuck](/src/main/java/com/example/dp/duck/RubberDuck.java#L12)
- 行為可以靈活擴充, 而不影響原有程式碼
- 行為可動態設定, 隨時改變
    - [setFlyBehavior](/src/main/java/com/example/dp/duck/Duck.java#L52)
    - [setQuackBehavior](/src/main/java/com/example/dp/duck/Duck.java#L56)

# 觀察者模式 (Observer Pattern)

code: [Weather](/src/main/java/com/example/dp/weather)

- subject, observer 都是 interface
- observer 透過 subject interface 執行註冊, subject 透過 observer interface 觸發更新

# 裝飾者模式 (Decorator Pattern)

code: [Weather](/src/main/java/com/example/dp/beverage)

- 使用繼承使型態相符
- java.io 屬於裝飾者模式
- 缺點: 會有大量的類別(裝飾者)

# 工廠模式 (Factory Pattern)

code: [Pizza](/src/main/java/com/example/dp/pizza)

- 確認哪些會改變, 哪些不會改變
    - 會改變: pizza 種類、口味 (開放新增, 不用管加了什麼在 pizza 上)
    - 不會改變: 餅皮製作、烘烤、切片、裝盒 (封閉修改)
- 抽象工廠 [PizzaStore](/src/main/java/com/example/dp/pizza/PizzaStore.java)
- 抽象產品 [Pizza](/src/main/java/com/example/dp/pizza/Pizza.java)
- 透過子類別實體化產品
    - [NYStylePizzaStore](/src/main/java/com/example/dp/pizza/NYStylePizzaStore.java)
    - [ChicagoStylePizzaStore](/src/main/java/com/example/dp/pizza/ChicagoStylePizzaStore.java)
- 選擇了子類別，相當於選擇了產品類型
- 鬆綁 (decouple)
    - 父類別 [PizzaStore](/src/main/java/com/example/dp/pizza/PizzaStore.java)
      與子類別 [NYStylePizzaStore](/src/main/java/com/example/dp/pizza/NYStylePizzaStore.java)
      , [ChicagoStylePizzaStore](/src/main/java/com/example/dp/pizza/ChicagoStylePizzaStore.java) 的關係鬆綁
    - [PizzaStore.orderPizza()](/src/main/java/com/example/dp/pizza/PizzaStore.java#L27) 不用知道在處理哪種 pizza, 只負責執行

## Note

- @override 可寫可不寫, JVM 會自動判斷, 有寫的話 IDE 會協助驗證
- abstract/interface
    - abstract 可以有建構式, interface 沒有
    - is a: 用 abstract
    - has a/like a: 用 interface