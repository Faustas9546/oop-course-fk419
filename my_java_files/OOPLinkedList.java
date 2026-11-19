public class OOPLinkedList {
    protected OOPLinkedListElement head;

    public OOPLinkedList() {
        this.head = null;
    }

    public void add(int x) {
        OOPLinkedListElement a = new OOPLinkedListElement(x);
        a.setNext(head);
        head = a;
    }

    public void remove() {
        if(head != null) {
            head = head.getNext();
        }
    }

    public int getHeadValue() {
        return head.getValue();
    }

    public int obtainNthElement(int n) {
        OOPLinkedListElement temp = head;
        while(n > 1) {
            if(temp == null) {
                return -1; // doesnt exist
            }
            temp = temp.getNext();
            n--;
        }
        if(temp == null) {
            return -1; // doesnt exist
        }
        return temp.getValue();
    }

    public int length() {
        int sum = 0;
        OOPLinkedListElement temp = head;
        while(temp != null)
        {
            sum++;
            temp = temp.getNext();
        }
        return sum;
    }
}
