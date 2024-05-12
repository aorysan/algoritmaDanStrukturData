package tugas;

public class Main {
    public static void main(String[] args) {
        SLL mhs = new SLL();

        mhs.print();

        mhs.addFirst(111, "bambang");
        mhs.print();
        
        mhs.addLast(112, "coki");
        mhs.print();

        mhs.addFirst(113, "adrian");
        mhs.print();
        
        mhs.insertAfter(112, 114, "eko");
        mhs.print();
        
        mhs.insertAt(3, 115, "dewi");
        mhs.print();
    }
}
