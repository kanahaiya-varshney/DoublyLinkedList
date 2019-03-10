package MainPackage;

import DoublyList.List;

public class DoublyDemo {
    public static void main(String[] args) {
        List obj=new List();
        obj.insertFirst(100);
        obj.insertFirst(101);
        obj.insertFirst(102);
        obj.insertFirst(103);
        obj.insertFirst(104);
        obj.insertFirst(105);
        obj.insertFirst(106);
        //obj.displayFirst();
        //obj.insertlast(444);
        //obj.displayFirst();
        obj.insertFirst(555);
        //obj.displayFirst();
        //obj.displayLast();

        obj.insertFirst(458);
        obj.displayFirst();
        obj.deleteFirst();
        obj.displayFirst();
    }
}
