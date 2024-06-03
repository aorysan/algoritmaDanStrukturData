package node;

public class node06 {
    int data, jarak;
    node06 prev, next;

    public node06(node06 prev, int data, int jarak, node06 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}