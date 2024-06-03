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
}
