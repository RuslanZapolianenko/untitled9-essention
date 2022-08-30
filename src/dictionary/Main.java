package dictionary;

public class Main {
    public static void main(String[] args) {
        MyDictionary slovar = new MyDictionary<>();
        slovar.addValue("me","Я");
        slovar.addValue("you","ви");
        slovar.addValue("they","вони");

        slovar.getValue(2);

        System.out.println(slovar.length());

        slovar.getTranslate("you");
    }
}

