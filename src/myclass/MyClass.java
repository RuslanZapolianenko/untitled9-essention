package myclass;

public class MyClass <T>
{
    private T field;
    static String qwerty;

    public MyClass(T qwerty) {
        this.field = qwerty;
        this.qwerty = String.valueOf(field.getClass());
    }

    public static void factoryMethod() {

        System.out.println(qwerty);
    }

}

class Mainn {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(2.0f);
        myClass.factoryMethod();
    }
}

