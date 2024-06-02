package percobaan1;
public class binaryTree06 {
    node06 root;

    binaryTree06() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new node06(data);
        } else {
            node06 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new node06(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new node06(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    void addRecursive(int data) {
        if(isEmpty()) {
            root = new node06(data);
        } else {
            Recursive(root, data);
        }
    }

    void Recursive(node06 current, int data) {
        if(data < current.data) {
            if(current.left != null) {
                Recursive(current.left, data);
            } else {
                current.left = new node06(data);
            }
        } else if(data > current.data) {
            if(current.right != null) {
                Recursive(current.right, data);
            } else {
                current.right = new node06(data);
            }
        }
    }

    void printLowestOrHighest() {
        if(isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        int lowest = lowest(root);
        int highest = highest(root);

        System.out.println("Nilai terkecilnya adalah : " + lowest);
        System.out.println("Nilai terbesarnya adalah : " + highest);
    }

    void printAll(node06 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            } else {
                printAll(node.left);
                printAll(node.right);
            }
        }
    }

    int countLeaf(node06 node) {
        if(node == null) {
            return 0;
        } else if(node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeaf(node.left) + countLeaf(node.right);
        }
    }

    int lowest(node06 node) {
        if(node.left == null) {
            return node.data;
        }
        return lowest(node.left);
    }
    
    int highest(node06 node) {
        if(node.right == null) {
            return node.data;
        }
        return lowest(node.right);
    }

    boolean find(int data) {
        boolean result = false;
        node06 current = root;

        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(node06 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(node06 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(node06 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    node06 getSuccessor(node06 del) {
        node06 successor = del.right;
        node06 successorsParent = del;

        while (successor.left != null) {
            successorsParent = successor;
            successor = successor.left;
            if (successor != del.right) {
                successorsParent.left = successor.right;
                successor.right = del.right;
            }
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        node06 parent = root;
        node06 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    parent.right = null;
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                node06 successor = getSuccessor(current);

                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}