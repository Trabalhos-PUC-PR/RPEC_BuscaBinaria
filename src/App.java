import Tree.BinaryTree;

public class App {
    public static void main(String[] args) {

        //int[] list = {0, 2, 4, 5, 6, 7, 9};
        //int value = 7;
        //int foundIndex = BinarySearch.indexOf(value, list);

        // System.out.printf("Value searched: %d, list[%d]=%d", value, foundIndex, list[foundIndex]);

        //int listSize = 10;
        // int[] treeList = new int[listSize];
        // for(int i = 0; i<listSize; i++){
        //     treeList[i] = (int)(Math.random()*100);
        // }
        int[] treeList = {55, 15, 25, 63, 88, 58, 97, 26, 76, 44};

        BinarySearch.print(treeList);

        BinaryTree tree = new BinaryTree(treeList);
        int[] i = {1, 100};
        tree.add(i);
        tree.removeBiggestElement();
        tree.removeBiggestElement();
        tree.removeBiggestElement();

    }

}
