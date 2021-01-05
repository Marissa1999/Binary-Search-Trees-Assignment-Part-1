/**
 * @author Marissa Gonçalves
 * Due Date: November 21, 2018
 * Demonstrates various methods on the Original and Mirror Binary Search Trees.
 * @param <E> The parameter of the TreeNode class which can define any type of value.
 */

public class MyBST <E extends Comparable<E>>
{

    /**
     * The first node of the entire tree.
     */
    private TreeNode<E> root;
    
    
    
    /**
     * The total number of elements in the tree.
     */
    private int size;
    
    
    
    
    /**
     * Creates an empty tree.
     */
    public MyBST()
    {  
        this.size = 0;
        this.root = null;        
    }
    
   
    
    
    
    /**
     * Returns true if the specified element is in the original tree.
     * @param e The value of the chosen element to be searched.
     * @return The boolean value indicating whether the element is found in the original tree.
     */
    public boolean search(E e) 
    {
       
        TreeNode<E> current = this.root;
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                current = current.left;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                current = current.right;
            }
                    
            else
            {
                return true;
            }
            
        }
        
        return false;
        
    }

    
    
    
    
    
    /**
     * Returns true if the element is added successfully into the original tree.
     * @param e The value of the chosen element to be inserted.
     * @return The boolean value indicating whether the element can be added to the original tree.
     */
    public boolean insert(E e) 
    {
       
        TreeNode<E> current = this.root;
        TreeNode<E> parent = current;
        
        
        if(this.root == null)
        {
            this.root = new TreeNode(e);
        }
        
 
     else
     {
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                 parent = current;
                 current = current.right;
            }
                    
            else
            {
                return false;
            }
            
        }
        

        
        if(e.compareTo(parent.element) < 0)
        {
            parent.left = new TreeNode(e);
        }
        
        else
        {
            parent.right = new TreeNode(e);
        }
        
     } 
        
        this.size++;
        return true;

        
    }

    
    
    
    
    
    /**
     * Returns true if the element is removed from the original tree successfully.
     * @param e The value of the chosen element to deleted.
     * @return The boolean value indicating whether the element can be deleted from the original tree.
     */
    public boolean delete(E e)
    {   
       
        TreeNode<E> current = this.root;
        TreeNode<E> parent = current;
        
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            
            else if (e.compareTo(current.element) > 0)
            {
                parent = current;
                current = current.right;
            }
            
            else
            {
                break;
            }
           
        }  
            
        
          if(current == null)
          {        
              return false;          
          }
          
          
          
          if(current.left == null)
          {
              
              if(parent == null)
              {
                  this.root = current.right;
              }
              
              else
              {
                  if(e.compareTo(parent.element) < 0)
                  {             
                      parent.left = current.right;   
                  }
                  
                  else
                  {
                      parent.right = current.right;
                  }
              }
              
          }
          
          
          else
          {
              
              TreeNode<E> parentOfRightMost = current;
              TreeNode<E> rightMost = current.left;
              
              
              
              while(rightMost.right != null)
              {  
                  parentOfRightMost = rightMost;
                  rightMost = rightMost.right;
              }
              
              
              current.element = rightMost.element;
              
              
              if(parentOfRightMost.right == rightMost)
              {
                  parentOfRightMost.right = rightMost.left;
              }
              
              else
              {
                  parentOfRightMost.left = rightMost.left;
              }
              
              
          }
           
          
        this.size--;
        return true;  
        
        
    }

    
    
    
    
    
     
    /**
     * Returns true if the specified element is in the mirror tree.
     * @param e The value of the chosen element to be searched.
     * @return The boolean value indicating whether the element is found in the mirror tree.
     */
    public boolean searchM(E e) 
    {
        
        TreeNode<E> current = this.root;
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                current = current.right;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                current = current.left;
            }
            
            else
            {
                return true;
            }
            
        }
        
        return false;
        
    }

    
    
    
    
    /**
     * Returns true if the element is added successfully into the mirror tree.
     * @param e The value of the chosen element to be inserted.
     * @return The boolean value indicating whether the element can be added to the mirror tree.
     */
    public boolean insertM(E e) 
    {
            
      TreeNode<E> current = this.root;
      TreeNode<E> parent = current;
        
        
      if(this.root == null)
      {
          this.root = new TreeNode(e);
      }
        
 
     else
     {
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.right;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                 parent = current;
                 current = current.left;
            }
                    
            else
            {
                return false;
            }
            
        }
        

        
        if(e.compareTo(parent.element) < 0)
        {
            parent.right = new TreeNode(e);
        }
        
        else
        {
            parent.left = new TreeNode(e);
        }
        
     } 
        
        this.size++;
        return true;
        
    }

    
    
    
    /**
     * Returns true if the element is removed from the mirror tree successfully.
     * @param e The value of the chosen element to deleted.
     * @return The boolean value indicating whether the element can be deleted from the mirror tree.
     */
    public boolean deleteM(E e) 
    {
       
        TreeNode<E> current = this.root;
        TreeNode<E> parent = current;
        
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.right;
            }
            
            
            else if (e.compareTo(current.element) > 0)
            {
                parent = current;
                current = current.left;
            }
            
            else
            {
                break;
            }
           
        }  
            
        
          if(current == null)
          {        
              return false;          
          }
          
          
          
          if(current.right == null)
          {
              
              if(parent == null)
              {
                  this.root = current.left;
              }
              
              else
              {
                  if(e.compareTo(parent.element) < 0)
                  {             
                      parent.right = current.left;   
                  }
                  
                  else
                  {
                      parent.left = current.left;
                  }
              }
              
          }
          
          
          
          else
          {
              
              TreeNode<E> parentOfLeftMost = current;
              TreeNode<E> leftMost = current.right;
              
              
              
              while(leftMost.left != null)
              {  
                  parentOfLeftMost = leftMost;
                  leftMost = leftMost.left;
              }
              
              
              current.element = leftMost.element;
              
              
              if(parentOfLeftMost.left == leftMost)
              {
                  parentOfLeftMost.left = leftMost.right;
              }
             
              else
              {
                  parentOfLeftMost.right = leftMost.right;
              }
   
              
          }
            
        this.size--;
        return true;  
        
    }

    
    
    
    
    
    
    /**
     * Deletes the element with the minimum value in the mirror tree.
     * @return The boolean value indicating whether the minimum element was already deleted.
     */
    public boolean deleteMin() 
    {
        
        TreeNode<E> current = this.root;
        
        if(current == null)
        {
            return false;
        }
         
        while(current.right != null)
        {  
            current = current.right;   
        }
                 
        
        deleteM(current.element);
        return true; 

    }

    
    
    
     /**
     * Calls the recursive method to print the original tree nodes in in-order traversal.
     */
    public void inOrder() 
    {  
        inOrder(this.root);       
    }
    
    
    
    
    
    /**
     * Prints the original tree nodes in in-order traversal.
     * @param node The element being traversed one at a time in the original tree. 
     */
    public void inOrder(TreeNode<E> node)
    {
        if (node == null)
        {
            return;
        }
        
        inOrder(node.left);
        System.out.print(node.element + " ");
        inOrder(node.right);
       
    }
    
    
    
    /**
     * Calls the recursive method to print the mirror tree nodes in in-order traversal.
     */
    public void inOrderM() 
    {
        inOrderM(this.root);
    }
    
    
    
    
    
    
    /**
     * Prints the mirror tree nodes in in-order traversal.
     * @param node The element being traversed one at a time in the mirror tree. 
     */
    public void inOrderM(TreeNode<E> node)
    {
        
        if (node == null)
        {
            return;
        }
        
        inOrderM(node.right);
        System.out.print(node.element + " ");
        inOrderM(node.left);
        
    }

    
    
    
    
     /**
     * Calls the recursive method to print the original tree nodes in pre-order traversal.
     */
    public void preOrder() 
    {  
        preOrder(this.root);       
    }
    
   
    
    
    /**
     * Prints the original tree nodes in pre-order traversal.
     * @param node The element being traversed one at a time in the original tree.
     */
    public void preOrder(TreeNode<E> node) 
    {
        
        if(node == null)
        {
            return;
        }
        
         System.out.print(node.element + " ");
         preOrder(node.left);
         preOrder(node.right);
            
        
    }
    
   
    
    
    /**
     * Calls the recursive method to print the mirror tree nodes in pre-order traversal.
     */
    public void preOrderM() 
    {
        preOrderM(this.root);
    }
    
    
    
    
    
    /**
     * Prints the mirror tree nodes in pre-order traversal.
     * @param node The element being traversed one at a time in the mirror tree. 
     */
    public void preOrderM(TreeNode<E> node)
    {
        
        if(node == null)
        {
            return;
        }
        
         System.out.print(node.element + " ");
         preOrderM(node.right);
         preOrderM(node.left);
        
    }

    
    
    
    
    /**
     * Calls the recursive method to print the original tree nodes in post-order traversal.
     */
    public void postOrder() 
    {  
        postOrder(this.root);       
    }
    
    
    
    
    /**
     * Prints the original tree nodes in post-order traversal.
     * @param node The element being traversed one at a time in the original tree.
     */
    public void postOrder(TreeNode<E> node) 
    {
       
        if(node == null)
        {
            return;
        }
        
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.element + " ");
        
        
    }
    
    
    
    
    
    /**
     * Calls the recursive method to print the mirror tree nodes in post-order traversal.
     */
    public void postOrderM() 
    {    
        postOrderM(this.root);
    }

    
    
    
    
    /**
     * Prints the mirror tree nodes in post-order traversal.
     * @param node The element being traversed one at a time in the mirror tree.
     */
    public void postOrderM(TreeNode<E> node)
    {
        
        if(node == null)
        {
            return;
        }
        
        
        postOrderM(node.right);
        postOrderM(node.left);
        System.out.print(node.element + " ");
        
    }
    
    
    
    

 
    /**
     * Calls the recursive method to create the mirror image of the tree, without changing the original tree.
     */
    public void mirror()
    {
        mirror(this.root);
    }
    
    
    
    
    
    /**
     * Creates the mirror image of the tree, without changing the original tree itself.
     * @param node The element being traversed one at a time in the original tree, making the mirror image.
     */
    public void mirror(TreeNode<E> node)
    {
        
         if(node != null)
         {
             
             TreeNode<E> temp = node.left;
             node.left = node.right;
             node.right = temp;
          
             mirror(node.left);
             System.out.print(node.element + " ");
             mirror(node.right);
             
         } 
        
      }
    
    
    
    
    /**
     * Returns the number of elements in the original/mirror tree.
     * @return The total integer amount of elements in a particular tree.
     */
    public int getSize() 
    {
        return this.size;
    }

    
    
    
    
    /**
     * Returns true if the original/mirror tree is empty.
     * @return The boolean value determining whether the original/mirror tree is empty.
     */
    public boolean isEmpty() 
    {
        return this.size == 0;
    }

    
    
    
    
    /**
     * Removes all elements from the original/mirror tree.
     */
    public void clear() 
    {
        this.root = null;
        this.size = 0;
    }

    
   
  
    
    
}
