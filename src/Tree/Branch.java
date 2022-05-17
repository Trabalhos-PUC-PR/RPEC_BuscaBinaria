package Tree;

public class Branch{

    /**
     * Pointer to root branch
     */
    Branch root;

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
        root = null;
    }

    public Branch(){
        value = null;
        leftBranch = null;
        rightBranch = null;
        root = null;
    }

    public Branch getRoot() {
        return root;
    }

    public void setRoot(Branch root) {
        this.root = root;
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

    public void setRightBranch(Branch rightBranch) {
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

    public void setNextBranch(int value, Object nullBranch) {
        if(this.value < value){
            setRightBranch(null);
        }else{
            setLeftBranch(null);
        }
    }

    public void setThisBranch(int value){
        this.value = value;
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

    public boolean isLeaf(){
        if(leftBranch == null && rightBranch == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = (""+value);
        return s;
    }
}