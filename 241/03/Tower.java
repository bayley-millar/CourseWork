package week03;

/** Bayley millar
 *  A recursive representation of a tower of blocks.
 *  Lab 03
 * @author Michael Albert
 */
public class Tower{

    /** The top block. */
    private char top;
    
    /** The rest of the tower. */
    private Tower rest;

    /**
     * Creates a new empty Tower.
     */
    public Tower() {
        this.top = ' ';
        this.rest = null;
    }
    
    /**
     *  External classes can only create empty towers and manipulate
     *  them using public methods, because this constructor is
     *  private.
     * @param top the top block in this tower
     * @param rest the rest of the tower
     */
    private Tower(char top, Tower rest) {
        this.top = top;
        this.rest = rest;
    }

    /**
     *  Returns true if this tower is empty, otherwise false.  Empty
     *  towers are represented with the top block being a space
     *  character.
     * @return whether the tower is empty or not.
     */
    public boolean isEmpty() {
        return top == ' ';
    }
        
    /**
     *  Creates a new tower by adding the given block to the top of
     *  this tower.
     * @param block a block to add to the top of this tower.
     * @return a new tower created by adding a block to the top of
     * this tower.
     */
    public Tower add(char block) {
        return new Tower(block, this);
    }

    /**
     * A method that returns an int equal to the height.
     *@return returns a int equal to the num of blocks.
     */
    public int height(){
        if(isEmpty()){
            return 0;
        }else{
            return 1 + rest.height();
        }
    }
    /**A method that returns an int equal to the number of blocks.
     *@param c is the variable in char.
     *@return returns int equal to blocks in the tower.
     */
    public int count(char c){
        int numOfBlocks = 1;
        if(c != top){
            return 0;
        }else{
            rest.count(c);
            numOfBlocks++;
        }
        return numOfBlocks;
    }
}
