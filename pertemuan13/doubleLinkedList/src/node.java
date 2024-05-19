

class node {
    int data;
    node next, prev;

    node(node prev, int data, node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}