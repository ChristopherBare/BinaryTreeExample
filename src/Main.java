public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(8);
        bt.add(15);
        bt.add(35);
        bt.add(99);
        bt.add(6);
        bt.add(10);
        bt.add(73);
        bt.add(42);
        System.out.println("\nIn Order:");
        bt.traverseInOrder(bt.root);
        System.out.println("\nPost Order");
        bt.traversePostOrder(bt.root);
        System.out.println("\nPre Order");
        bt.traversePreOrder(bt.root);
    }
}
