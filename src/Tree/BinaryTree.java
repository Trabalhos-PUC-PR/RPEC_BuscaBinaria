package Tree;

public class BinaryTree {
    
    Branch branch;

    public BinaryTree(int value) {
        branch = new Branch(value);
    }

    public BinaryTree(int[] list){
        branch = new Branch(list[0]);
    }

    public void insertIntoTree(int[] list){
        for (int i : list) {
            if(branch.getValue() < i){
                branch.getRightMostBranch().setRightBranch(new Branch(list[i]));
            }
        }
    }

}
