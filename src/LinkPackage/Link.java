package LinkPackage;

public class Link{
    private int data;
    private Link next;
    private Link previous;

    public String getData() {
        return data+"";
    }

    public Link(int data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrevious() {
        return previous;
    }

    public void setPrevious(Link previous) {
        this.previous = previous;
    }
}
