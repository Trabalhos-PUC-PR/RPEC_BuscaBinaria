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

    private Branch getLeftBranch() {
        return leftBranch;
    }

    private void setLeftBranch(Branch leftBranch) {
        this.leftBranch = leftBranch;
    }

    private Branch getRightBranch() {
        return rightBranch;
    }

    private void setRightBranch(Branch rightBranch) {
        this.rightBranch = rightBranch;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Branch getNextBranch(int value) {
        if(this.value < value){
            return getRightBranch();
        }
        return getLeftBranch();
    }

    public void setNextBranch(int value) {
        if(this.value < value){
            setRightBranch(new Branch(value));
        }else{
            setLeftBranch(new Branch(value));
        }
    }

    public Branch getFullRightBranch(){
        Branch aux = rightBranch;
        while(aux.getRightBranch() != null){
            aux = aux.getRightBranch();
        }
        return aux;
    }

    public Branch getFullLeftBranch(){
        Branch aux = leftBranch;
        while(aux.getLeftBranch() != null){
            aux = aux.getLeftBranch();
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = (""+value);
        return s;
    }
}