package cn.meetdevelop.lesson_1;

/**
 * @author zgy
 * @DATE 2019/12/4 - 20:39
 */
public class LambdaDemo {


    public static void main(String[] args) {
        Action action = () -> {
            System.out.println("Execute");
        };
        //System.out.println(Action.doExecute());

        Action action1 = LambdaDemo::sayHello;
        action1.execute();
    }
    public interface Action {

        void execute();

        static String doExecute() {
            return "hello World";
        }
        boolean equals(Object o);

    }

    static void sayHello() {
        System.out.println("Hello World");
    }

}