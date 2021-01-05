/**
 * @author Marissa Gonçalves
 * Due Date: November 21, 2018
 * Initializes the left and right variables and sets the TreeNode element for the Mirror and Original Binary Search Trees.
 * @param <E> The parameter of the TreeNode class which can define any type of value.
 */

public class TreeNode<E> 
{
    
    /**
     * The value which a non-null node contains.
     */
    E element;
    
    /**
     * The first link that references the left child.
     */
    TreeNode<E> left;
    
    
    /**
     * The other link that references the right child.
     */
    TreeNode<E> right;
    
    
    
    /**
     * Sets the instance element value to the one specified in the parameter.
     * @param o The mentioned value in order to set the element value.
     */
    public TreeNode(E o)
    {
        this.element = o;
    }
    
 
}
