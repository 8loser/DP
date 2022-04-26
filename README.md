# Design Pattern

## 策略模式 (Strategy Pattern)

code: [Duck](/src/main/java/com/example/dp/duck)

- 行為用合成而來
- 行為可以靈活擴充, 而不影響原有程式碼
- 行為可動態設定, 隨時改變

## 觀察者模式 ()

code: [Weather](/src/main/java/com/example/dp/weather)

- subject, observer 都是 interface
- observer 透過 subject interface 執行註冊, subject 透過 observer interface 觸發更新

## Note

- @override 可寫可不寫, JVM 會自動判斷, 有寫的話 IDE 會協助驗證
- abstract/interface
    - abstract 可以有建構式, interface 沒有
    - is a: 用 abstract
    - has a/like a: 用 interface