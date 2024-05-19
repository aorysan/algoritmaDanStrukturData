package tugas.film;

public class node {
    film data;
    node next, prev;

    node(node prev, film data, node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
