import Tree.BinaryTree;

public class App {
    public static void main(String[] args) {

        int[] list = {0, 2, 4, 5, 6, 7, 9};
        int value = 2;
        int foundIndex = BinarySearch.indexOf(value, list);

        // System.out.printf("Value searched: %d, list[%d]=%d", value, foundIndex, list[foundIndex]);

        int listSize = 10;
        int[] treeList = new int[listSize];
        for(int i = 0; i<listSize; i++){
            treeList[i] = (int)(Math.random()*100);
        }

        BinarySearch.print(treeList);

        BinaryTree tree = new BinaryTree(treeList);

    }

}
