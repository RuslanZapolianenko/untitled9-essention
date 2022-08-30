package mylist;

public class MyList <T> {
    T [] arrayList = (T[]) new Object[10];
    int currentIndex = 0;

    MyList () {

    }

    void addValue(T valueInList){

        if(currentIndex == this.arrayList.length-1){
            resizeList();
        }

        this.arrayList[currentIndex] = valueInList;
        currentIndex++;
    }

    void resizeList() {
        T newList [] = (T[]) new Object[arrayList.length+10];
        for (int i = 0; i < arrayList.length; i++) {
            newList[i] = arrayList[i];
        }
        arrayList = newList;
    }

    public T getValue(int index){
        if(index<arrayList.length){
            return arrayList[index];
        } else {
            throw new IndexOutOfBoundsException("Out of array");
        }
    }

    int length() {
        return currentIndex;
    }
}

