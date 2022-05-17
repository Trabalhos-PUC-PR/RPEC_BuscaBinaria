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
                Branch aux = root;
                while(aux.getNextBranch(i) != null){
                    aux = aux.getNextBranch(i);
                }
                aux.setNextBranch(i);
            }
        }
    }

    public void add(Integer value){
        Branch aux = root;
        while(aux.getNextBranch(value) != null){
            aux = aux.getNextBranch(value);
        }
        aux.setNextBranch(value);
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

    public void remove(Branch value){
        System.out.println(value.getValue());
    }

    public void removeBiggestElement(){
        remove(root.getFullRightBranch());
    }

    public void removeLowestElement(){
        remove(root.getFullLeftBranch());
    }

}
