package percobaan2;

class binaryTreeArrayMain06 {
    public static void main(String[] args) {
        binaryTreeArray06 bta = new binaryTreeArray06();
        
        int data[] = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;

        bta.populateData(data, idxLast);

        System.out.println("Preorder traversal: ");
        bta.traversePreOrder(0);
        System.out.println("\n");

        System.out.println("Inorder traversal: ");
        bta.traverseInOrder(0);
        System.out.println("\n");
        
        bta.add(2);
        System.out.println();
        
        System.out.println("Postorder traversal: ");
        bta.traversePostOrder(0);
        System.out.println("\n");
    }
}