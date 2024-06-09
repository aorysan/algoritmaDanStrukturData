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
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " dihapus");
                break;
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

    public boolean cekTetangga(int asal, int tujuan) throws Exception {
        for(int i = 0; i < list[asal].size(); i++) {
            if(list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
        boolean cek = false;
        for(int i = 0; i < list[asal].size(); i++) {
            if(list[asal].get(i) == tujuan) {
                cek = true;
            }
        }
        if (cek == true) {
            list[asal].updateJarak(tujuan, jarakBaru);
            System.out.println("Jarak Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " diperbarui menjadi " + jarakBaru + " m");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
    }

    public void hitungEdge() {
        int jml = 0;
        for (int i = 0; i < vertex; i++) {
            jml += list[i].size();
        }
        System.out.println("Jumlah Edge dari Graph: " + jml);
    }
}
