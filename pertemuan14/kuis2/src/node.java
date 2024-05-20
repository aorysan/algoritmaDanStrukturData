public class node {
    racer pembalap;
    node prev, next;

    node(node prev, racer team, node next) {
        this.prev = prev;
        this.pembalap = team;
        this.next = next;
    }
}
