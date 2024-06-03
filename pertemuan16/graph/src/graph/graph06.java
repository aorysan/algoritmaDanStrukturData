package graph;

import node.doubleLinkedList06;

public class graph06 {
    int vertex;
    doubleLinkedList06 list[];

    public graph06(int v) {
        vertex = v;
        list = new doubleLinkedList06[v];

        for (int i = 0; i < v; i++) {
            list[i] = new doubleLinkedList06();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, allIn = 0, allOut = 0;

        for(int i = 0; i < vertex; i++) {
            // indegree
            for (int j = 0; j < list[i].size; j++) {
                if(list[i].getJarak(j) == asal) {
                    ++allIn;
                }
            }

            // outdegree
            for (k = 0; k < list[asal].size; k++) {
                list[asal].getJarak(k);
            }
            allOut = k;
        }

        System.out.println("InDegree dari gedung " + (char) ('A' + asal) + ": " + allIn);
        System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + ": " + allOut);
        System.out.println("Degree dari gedung (directed) " + (char) ('A' + asal) + ": " + (allIn + allOut)); //directed
        // System.out.println("Degree dari gedung (undirected) " + (char) ('A' + asal) + ": " + list[asal].size()); //undirected
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if(i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }

        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if(list[i].size() > 0) {
                System.out.println("Gedung " + (char)('A' + i) + " terhubung dengan gedung : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }

                System.out.println();
            }
        }

        System.out.println();
    }    
}
