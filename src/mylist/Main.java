package mylist;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.addValue(00);
        myList.addValue(11);
        myList.addValue(22);
        myList.addValue(33);
        myList.addValue(44);
        myList.addValue(55);
        myList.addValue(66);
        myList.addValue(77);
        myList.addValue(88);
        myList.addValue(99);

        myList.addValue(1);
        myList.addValue(2);
        myList.addValue(3);

        System.out.println(myList.getValue(1));
        System.out.println(myList.getValue(10));
        System.out.println("Length of list: "+ myList.length());

        MyList <String> arrayString = new MyList<>();
        arrayString.addValue("Some String");
        System.out.println(arrayString.getValue(0));


    }


}


