# 문제
H자동차 공장에서 자동차를 생산합니다. 자동차가 새로 생산되면 자동차마다 새로운 번호가 부여됩니다.
H자동차 공장은 이 세상에 하나만이 존재합니다. 생산되는 자동차들은 각 식별 번호를 가집니다.
다음 코드가 실행될 수 있도록 자동차와 자동차 공장을 구현하세요
```java
public class CarTest {

    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();
		
        System.out.println("첫번째 차 번호는" +myCar.showCarNumber());
        System.out.println("두번째 차 번호는" +yourCar.showCarNumber());
    }
}
```

![img.png](carNum-img.png)