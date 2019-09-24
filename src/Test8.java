import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test8 {
    public static void main(String[] args) {
        char ch = 'J';
        char a = (char) (ch + 32);
        System.out.println(a);

        char ch2 = 'a';
        ch2 -= 32;
        System.out.println(ch2);

        double d3 = 3.5;
        int i3 = 100;
        double sum3 = d3 + i3;
//        int sum= (int) sum3;
        System.out.println("sum3的值：" + sum3);
        System.out.println("sum3的整数部分：" +(int)sum3);

        int d4 = 50;
        int i4 = (int) 7.5;
        int mul4 = d4 * i4;
        System.out.println("mul4的整数部分："+mul4);

    }

}
