package week10;

import java.util.*;

/**
 * This is a class for the recursive tree.
 * 
 * @author Bayley Millar
 * @param <T> The type of values stored in the tree.
 */
public class Tree<T> {
    /**the root value of the tree.*/
    private T rootValue;
    /**The list for all the children from the root.*/
    private List<Tree<T>> children;

    /**This is the constructor method for the class.
     * @param rootValue is the root value of the true.
     * @param children The list for all the children from the root.
     */
    public Tree(T rootValue, List<Tree<T>> children) {
        this.rootValue = rootValue;
        this.children = children;
    }
    /**This is another constructor for the class.
     * @param rootValue the root value of the tree.
     */
    public Tree(T rootValue) {
        this(rootValue, new ArrayList<Tree<T>>());
    }
    /**returns th number of nodes in the tree.
     * @return returns the size with the cnt variable
     */
    public int size() {
        int cnt = 1;
        if(rootValue!=null){
            for(Tree<T> child : children){
                cnt += child.size();
            }
            return cnt;
        }else{
            return 0;
        }
    }
    /**returns the largest number of children of any node.
     * @return returns the largest number of children of any node.
     */
    public int maxDegree() {
        int maximum = children.size();
        for(Tree<T> child : children){
            if(child.maxDegree() > maximum){
                maximum = child.maxDegree();
            }
        }
        return maximum;
    }
    /**adds a child to the root of the tree.
     *@param child is the list for the tree.*/
    public void add(Tree<T> child) {
        if(children != null){
            children.add(child);
        }
    }
    /**method thats finds a particular node.
     *@param value which is what is wanted to be found.
     *@return null return a null.
     */
    public Tree<T> find(T value) {
        if (rootValue.equals(value)) {
            return this;
        }
        for (Tree<T> child : children) {
            Tree<T> match = child.find(value);
            if (match != null) {
                return match;
            }
        }
        return null;
    }
    /**returns an ArrayList which gives the contents of the node for
     *post order traversal.
     *@return answer gives the answer.
     */
    public List<T> postOrder() {
        ArrayList<T>answer = new ArrayList<T>();
        for(Tree<T> child : children){
            answer.addAll(child.postOrder());
        }
        answer.add(rootValue);
        return answer;
    }
    /**converts to string.
     *@return returns a string value.
     */
    public String toString() {
        if (children.isEmpty()) {
            return rootValue.toString();
        }
        return rootValue.toString() + ' ' + children.toString();
    }
    /** method which represents an indenred format of the tree.
     *  @return answer in toSting format. 
     */
    public String toIndentedString() {
        StringBuilder answer = new StringBuilder(rootValue.toString());
        for(Tree<T> child : children){
            answer.append("\n");
            answer.append(child.toIndentedString("  "));
        }
        answer.append("\n");
        return answer.toString();
    }
    /** method which represents an indenred format of the tree.
     * @param spaces adds indentation where needed.
     * @return answer in toSting format.
     */
    public String toIndentedString(String spaces) {
        StringBuilder answer = new StringBuilder(spaces + rootValue.toString());
        for(Tree<T> child : children){
            answer.append("\n");
            answer.append(child.toIndentedString(spaces+"  "));
        }

        return answer.toString();
    }

    /** A helper method for testing (used by main).  Searches tree for
     *  the given target and adds white space separated children to
     *  the tree matching target if there is one.
     *
     * @param target the root value to seach for.
     * @param children a white space separated list of children to add
     * to the tree whose value matches target.
     */
    private static void addChildren(String target, String children) {
        Tree<String> parent = tree.find(target);
        if (parent != null) {
            for (String child : children.split(" ")) {
                parent.add(new Tree<>(child));
            }
        }
    }

    /** A tree instance used for testing. */
    private static Tree<String> tree;

    /**
     * Entry point of the program (used for testing).
     *
     * @param args command line arguments are not used.
     */
    public static void main(String[] args) {
        System.out.println("Creating tree\n-------------");
        tree = new Tree<>("food");
        System.out.print(tree + "\nsize: " + tree.size());
        System.out.println(", max degree: " + tree.maxDegree());
        System.out.println("\nAdding children\n----------------");
        addChildren("food", "meat fruit vegetable");
        System.out.print(tree + "\nsize: " + tree.size());
        System.out.println(", max degree: " + tree.maxDegree());
        System.out.println("\nAdding deeper children\n----------------------");
        addChildren("meat", "chicken beef fish");
        addChildren("fish", "salmon cod tuna shark");
        addChildren("vegetable", "cabbage");
        System.out.print(tree + "\nsize: " + tree.size());
        System.out.println(", max degree: " + tree.maxDegree());
        System.out.println("\nPostorder\n---------");
        System.out.println(tree.postOrder());
        System.out.println("\nIndented string\n---------------");
        System.out.print(tree.toIndentedString());
    }

}
