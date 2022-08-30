package dictionary;

public class MyDictionary <T> {

    T firstList[] = (T[]) new Object[10];
    T secondList[] = (T[]) new Object[10];
    int index = 0;

    MyDictionary() {

    }


    void addValue(T valueFirstList, T valueSecondList) {

        if (index == this.firstList.length - 1) {
            resizeList();
        }

        this.firstList[index] = valueFirstList;
        this.secondList[index] = valueSecondList;
        index++;
    }


    void resizeList() {
        T newList[] = (T[]) new Object[firstList.length + 10];
        T newSecondList[] = (T[]) new Object[firstList.length + 10];

        for (int i = 0; i < firstList.length; i++) {
            newList[i] = firstList[i];
            newSecondList[i] = secondList[i];
        }
        firstList = newList;
        secondList = newSecondList;
    }

    public void getValue(int index) {
        if (index < firstList.length) {
            System.out.println(firstList[index] + " - " + secondList[index]);
        } else {
            throw new IndexOutOfBoundsException("Out of array");
        }
    }

    int length() {
        return index;
    }


    public void getTranslate(String word) {
        int counter = 0;
        for (int i = 0; i < this.length(); i++) {
            if (word.equals(firstList[i])) {
                System.out.println(firstList[i] + " - " + secondList[i]);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There is no such word in my database");
        }
    }


}

