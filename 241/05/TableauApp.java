package week05;

/**
 * Skeleton code for an array based implementation of Young's tableau.
 *
 * @author Bayley Millar
 */
public class TableauApp {

    /**
     * The main method is just used for testing.
     *
     * @param args command line arguments are not used.
     */
    /*  public static void main(String[] args) {
        int[][] valid = {{1, 4, 5, 10, 11}, {2, 6, 8}, {3, 9, 12}, {7}};
        }*/

    /**
     * Determines whether the array passed to it is a valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isTableau(int[][] t){
        if(columnValuesIncrease(t)){
            if(isSetOf1toN(t)){
                return true;
            } 
        }
        return false;
    }

    /**
     *  Returns a string representation of an array based tableau.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a string representation of an array based tableau.
     */
    public static String toString(int[][] t) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                result.append(String.format("%-4s", t[i][j]));
            }
            if (i < t.length-1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
    /**A method that returns true is no row is longer than the preceding.
     * @param t a two-dimesional array that represents a tableau.
     * @return a boolean variable, true of no row is longer than the preceding.
     */
    public static boolean rowLengthsDecrease(int[][]t){
        int currentRow = 0;
        int nextRow = 0;
        for(int row = 0; row < t.length-1;row++){
            currentRow = t[row].length;
            nextRow = t[row+1].length;
            if(currentRow<nextRow){
                return false;
            }  
        }
        return true;
    }
    
    /**A method that retuns true if from left to right in any row, the integers
     * incresing, otherwise false.
     * @param t a two-dimesional array that represents a tableau.
     * @return return true if from left to right in any row, the integers
     * are increasing.
     */
    public static boolean rowValuesIncrease(int[][]t){
        int currentNum = 0;
        int nextNum = 0;
        for(int row = 0; row < t.length;row++){
            for(int col = 0;col <  t[row].length-1;col++){
                currentNum = t[row][col];
                nextNum = t[row][col+1];
                if(nextNum<currentNum){
                    return false;
                }
            }
        }
        return true;
    }
    /**A method that returns true if from top to bottom in any column, the
     * itegers are increasing, otherwise false.
     * @param t a two-dimensional array that represents a tableau.
     * @return retunrns true if from top to bottom in any column, the integers
     * are increasing.
     */
    public static boolean columnValuesIncrease(int[][] t){
        int currentNum = 0;
        int nextNum = 0;
        for(int col = 0;col <  t[0].length;col++){
            for(int row = 0; row < t.length-1;row++){
                if (t[row + 1].length <= col){
                    continue;
                }
                currentNum = t[row][col];
                nextNum = t[row+1][col];
                if(nextNum<currentNum){
                    return false;
                }
            }
        }
        return true;
    }
   
    /**A method that returns true if the set of integers used is {1,2,...,n}
     * where n is the number of cells, otherwise false.
     * @param t a two-dimensional array that represents a tableau.
     * @return returns boolean true if itegers used is where
     * n is the number of cells.
     */
    public static boolean isSetOf1toN(int[][]t){
        int totalLength = 0;
        for(int row = 0; row < t.length;row++){
            totalLength +=t[row].length;
        }
        for(int n = 1;n < totalLength;n++){
            boolean found = false;
            for(int row = 0; row < t.length;row++){
                for(int col = 0;col <  t[row].length;col++){
                    if(t[row][col] == n){
                        found = true;
                    }
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
        
    }
}






