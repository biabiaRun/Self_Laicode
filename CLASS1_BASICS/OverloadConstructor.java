package CLASS1_BASICS;

public class OverloadConstructor {
    public static void main(String[] args) {
        MakePizza pizza = new MakePizza("hard", "tomatos", 10);
        System.out.println("Pizza bread: " + pizza.bread);
        System.out.println("Pizza bread: " + pizza.topping);
        System.out.println("Pizza bread: " + pizza.count);

    }

}
class MakePizza{
    String bread;
    String topping;
    int count;
    MakePizza(){
    }
    MakePizza(String bread_1, String topping, int count) { //!这里的bread和14行的bread不一样！
        this.bread = bread_1; //!this.bread才代表上面14行的attribute bread
    }
}
/************** 输出
Pizza bread: hard
        Pizza bread: null
        Pizza bread: 0
 *****************/
//?问：为什么不需要initialize 变量bread, topping and count?
