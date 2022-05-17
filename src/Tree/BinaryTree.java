package Tree;

public class BinaryTree {
    
    Branch root;

    public BinaryTree(int value) {
        root = new Branch(value);
    }

    public BinaryTree(int[] list){
        root = new Branch(list[0]);
        for(int i : list){
            if(i != root.getValue()){
                add(i);
            }
        }
    }

    public void add(Integer value){
        Branch aux = root;
        while(aux.getNextBranch(value) != null){
            aux = aux.getNextBranch(value);
        }
        aux.setNextBranch(value);
        aux.getNextBranch(value).setRoot(aux);
    }

    public void add(int[] list){
        for(int value : list){
            add(value);
        }
    }

    public void remove(Integer value){
        Branch aux = root;
        try{
            while(aux.getNextBranch(value).getValue() != value){
                aux = aux.getNextBranch(value);
            }
            remove(aux);
            /*
            change implementation later
            */
        }catch(NullPointerException e){
            System.out.println("There's no such value in this tree");
        }
    }

    public void remove(Branch branch){
        if(branch.isLeaf()){
            branch.getRoot().setNextBranch(branch.getValue(), null);
        }else{
            try{
                System.out.println(branch.getFullLeftBranch().getValue());
            }catch(NullPointerException e){

            }
        }
    }

    public void removeBiggestElement(){
        System.out.println("bef"+root.getFullRightBranch());
        remove(root.getFullRightBranch());
        System.out.println("aft"+root.getFullRightBranch());
        System.out.println();
    }

    public void removeLowestElement(){
        System.out.println("bef"+root.getFullLeftBranch());
        remove(root.getFullLeftBranch());
        System.out.println("aft"+root.getFullLeftBranch());
        System.out.println();
    }

}
