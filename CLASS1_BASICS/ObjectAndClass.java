package CLASS1_BASICS;

//!注意 'this'的使用
//!第32行，constructor内的parameter 'name'和'nick'; 也需要在前面declare;二者不一样！
//!第34行，this后的name，指的是上面的attribute 'name'
public class ObjectAndClass {
    //*******************************************

    public static void main(String[] args) {

        Car myCar1 = new Car("Benz","Big rabbit");
        Car myCar2 = new Car("BWM", "Dragon");

        System.out.println(myCar1.make);
        System.out.println(myCar2.make);
        //*问：写到这里，car1和car2都会输出相同的attribute,有没有办法specify不同的车？
        //答：constructor, 见下行 myCar.name

        System.out.println(myCar1.name);
        System.out.println(myCar2.name);

        myCar1.drive();
        myCar2.brake();
    }
}
class Car{
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;
    String name, nick;
    Car(String name11, String nick11) {
        this.name = name11;
        this. nick = nick11;
    }

    void drive() {
        System.out.println(this.name + " is moving forward.");
    }
    void brake() {
        System.out.println(this.name + " is stop.");
    }
}

//*******************************************

