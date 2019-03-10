package DoublyList;

import LinkPackage.Link;

public class List {
    private Link first = null;
    private Link last = null;

    public void insertlast(int data) {
        Link newLink = new Link(data);
        if (first == null) {
            first = newLink;
        } else {
            last.setNext(newLink);
            newLink.setPrevious(last);
        }
        last = newLink;

    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        if (first == null) {
            last = newLink;
        } else {
            first.setPrevious(newLink);
            newLink.setNext(first);
        }
        first = newLink;
    }

    public void displayFirst() {
        Link temp = first;
        System.out.print("First<-->Last ::");
        while (temp != null) {
            System.out.print(temp.getData() + "<-->");
            temp = temp.getNext();
        }
        System.out.print("null");
        System.out.println();

    }

    public void displayLast() {
        Link temp = last;
        System.out.println("Last<-->First ::");
        while (temp != null) {
            System.out.print(temp.getData() + "<-->");
            temp = temp.getPrevious();
        }
        System.out.print("null");
        System.out.println();
    }

    public void deleteFirst() {
        if(first==null){
            System.out.println("No data");
            return ;
        }
        System.out.println("Deleted data:"+first.getData()+"");
        if (first.getNext() == null) {
            last = null;
            first=null;
        }
        else {
            first=first.getNext();
            first.setPrevious(null);
        }

    }
    public void deleteLast(){
        if(first==null){
            System.out.println("No data");
            return;
        }
        System.out.println("Deleted Data:"+last.getData()+"");
        if(first.getNext()==null){
            last=null;
            first=null;
        }
        else{
            last=last.getPrevious();
            last.setNext(null);
        }
    }
}
