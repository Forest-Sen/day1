public class Test7 {
    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();
        remain();
    }

    public static void add() {
        int x = 100;
        int y = 200;
        int h = x + y;
        System.out.println("x,y的和为：" + h);
    }

    public static void sub() {
        int x = 100;
        int y = 200;
        int h = x - y;
        System.out.println("x,y的差为：" + h);
    }

    public static void mul() {
        short x = 100;
        char y = 200;
        long h = x * y;
        System.out.println("x,y的积为：" + h);
    }

    public static void div() {
        int x = 100;
        int y = 200;
        int h = x / y;
        System.out.println("x,y的商为：" + h);
    }

    public static void remain() {
        int x = 100;
        int y = 200;
        int h = x % y;
        System.out.println("x,y的余数为：" + h);
    }

}
