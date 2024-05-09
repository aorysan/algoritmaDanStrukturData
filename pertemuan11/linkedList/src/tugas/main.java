package tugas;

public class main {
    public static void main(String[] args) {
        SLL mhs = new SLL();

        mhs.print();

        mhs.addFirst(111, "adrian");
        mhs.print();
        
        mhs.addLast(112, "bambang");
        mhs.print();

        mhs.addFirst(113, "coki");
        mhs.print();
        
        mhs.insertAfter(112, 114, "dewi");
        mhs.print();
        
        mhs.insertAt(3, 115, "eko");
        mhs.print();
    }
}
