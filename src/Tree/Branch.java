package Tree;

public class Branch{
    
    /**
     * Pointer to next branch, where the value is less than root value
     */
    Branch leftBranch;

    /**
     * Pointer to next branch, where the value is greater than root value
     */
    Branch rightBranch;

    Integer value;

    public Branch(Integer value) {
        this.value = value;
        leftBranch = null;
        rightBranch = null;
    }

    public Branch(){
        value = null;
        leftBranch = null;
        rightBranch = null;
    }

    public Branch getLeftBranch() {
        return leftBranch;
    }

    public void setLeftBranch(Branch leftBranch) {
        this.leftBranch = leftBranch;
    }

    public Branch getRightBranch() {
        return rightBranch;
    }

    public Branch getRightMostBranch(){
        Branch aux = new Branch();
        aux = rightBranch;
        while(aux.getRightBranch() != null){
            aux = aux.getRightBranch();
        } 
        return aux;
    }
    
    public void setRightBranch(Branch rightBranch) {
        this.rightBranch = rightBranch;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        String s = (""+value);
        return s;
    }

}