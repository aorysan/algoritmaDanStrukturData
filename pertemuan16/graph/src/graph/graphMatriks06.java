package graph;
public class graphMatriks06 {
    int vertex;
    int matriks[][];

    public graphMatriks06(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char)('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if(matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char)('A' + j) + " (" + matriks[i][j] + " m), ");
                } else {
                    System.out.print("Gedung " + (char)('A' + j) + " (" + 0 + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //indegree
            if (matriks[i][asal] != 0) {
                totalIn++;
            }
            //outdegree
            if (matriks[asal][i] != 0) {
                totalOut++;   
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + "    : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + "   : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + "      : " + (totalIn + totalOut));
    }
}
