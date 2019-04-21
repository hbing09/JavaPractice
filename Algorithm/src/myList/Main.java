package myList;

import myList.impl.ArrayListImpl;

public class Main {

    public static void main(String[] args) {
        ArrayListImpl arrayList = new ArrayListImpl();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(0,0);
//        arrayList.remove(1);
//        arrayList.removeElement(2);
//        arrayList.print();
//        arrayList.set(0,1);
//        arrayList.print();
        //System.out.println(arrayList.get(0));
        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }
        arrayList.remove(1);
        arrayList.remove(1);
        arrayList.remove(1);
        arrayList.remove(1);
        arrayList.remove(1);
        //arrayList.remove(1);
        arrayList.print();
    }
}
