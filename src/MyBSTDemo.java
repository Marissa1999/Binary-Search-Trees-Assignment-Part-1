/**
 * @author Marissa Gonçalves
 * Due Date: November 21, 2018
 * Runs and tests the MyBST class, which is implemented from the MyTree interface.
 */

public class MyBSTDemo 
{

    /**
     * Runs and tests the MyBST class, which is implemented from the MyTree interface.
     * @param args The classic name given for a String array of a main class.
     */ 
    public static void main(String[] args)
    {
        
        
        
        //Create a new original MyBST tree
        MyBST<String> originalTree = new MyBST<>();
        
        
        //Insert values into the original MyBST tree
        originalTree.insert("George");
        originalTree.insert("Michael");
        originalTree.insert("Tom");
        originalTree.insert("Adam");
        originalTree.insert("Jones");
        originalTree.insert("Peter");
        originalTree.insert("Daniel");
        originalTree.insert("Adam");
        
        
        
        
        
        //Create a new mirror MyBST tree
        MyBST<String> mirrorTree = new MyBST<>();
        
        
        //Print the title specifying the insertion values for the mirror tree
        System.out.println("Insertion Values for the Mirror Tree: ");
        
        
        //Skip a line in the program
        System.out.println();
        
        
        //Testing the mirror insert method, making sure if the values are added into the mirror tree
        System.out.println("Is George Added to the Tree?: " + mirrorTree.insertM("George"));
        System.out.println("Is Michael Added to the Tree?: " + mirrorTree.insertM("Michael"));
        System.out.println("Is Tom Added to the Tree?: " + mirrorTree.insertM("Tom"));
        System.out.println("Is Adam Added to the Tree?: " + mirrorTree.insertM("Adam"));
        System.out.println("Is Jones Added to the Tree?: " + mirrorTree.insertM("Jones"));
        System.out.println("Is Peter Added to the Tree?: " + mirrorTree.insertM("Peter"));
        System.out.println("Is Daniel Added to the Tree?: " + mirrorTree.insertM("Daniel"));
        System.out.println("Is Adam Added to the Tree?: " + mirrorTree.insertM("Adam"));
        
        
        
        //Skip three lines in the program
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        //Print the title specifying the in-order traversal for the original tree
        System.out.println("In-Order Traversal of Original Tree:");
        
        
        //Print the original tree using in-order traversal
        originalTree.inOrder();
        
        
        //Skip two lines in the program
        System.out.println();
        System.out.println();
        
        
        
        
        //Print the title specifying the in-order traversal for the mirror tree
	System.out.println("In-Order Traversal of Mirror Tree:");
        
        
        //Print the mirror tree using in-order traversal
	mirrorTree.inOrderM();
        
              
        //Skip four lines in the program
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        
        
        
        
        //Print the title specifying the pre-order traversal for the original tree
        System.out.println("Pre-Order Traversal of Original Tree:");
        
        
        //Print the original tree using in-order traversal
        originalTree.preOrder();

          
        //Skip two lines in the program
        System.out.println();
        System.out.println();
        
        
        
        
        
        //Print the title specifying the pre-order traversal for the mirror tree
	System.out.println("Pre-Order Traversal of Mirror Tree:");
        
        
        //Print the mirror tree using pre-order traversal
	mirrorTree.preOrderM();

        
        //Skip four lines in the program
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        
        
        
        
        
        //Print the title specifying the post-order traversal for the original tree
        System.out.println("Post-Order Traversal of Original Tree:");
        
        
        
        //Print the original tree using post-order traversal
        originalTree.postOrder();
        
        
        
        //Skip two lines in the program
        System.out.println(); 
        System.out.println();
        
        
        
        
        
        
        
        //Print the title specifying the post-order traversal for the mirror tree
	System.out.println("Post-Order Traversal of Mirror Tree:");
        
        
        //Print the mirror tree using post-order traversal
	mirrorTree.postOrderM();
        

        
        //Skip four lines in the program
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
       
        
        
        
        
        
        
        //Testing the mirror tree search method, if George is located in the tree
        System.out.println("Is George in the Mirror Tree?: " + mirrorTree.searchM("George"));

        
        //Skip a line in the program
        System.out.println();
        

        
        
        
        //Testing the mirror tree delete method, specifying if George can be deleted
        System.out.println("Can George be Deleted from the Mirror Tree?: " + mirrorTree.deleteM("George"));
        
        
        //Skip a line in the program
        System.out.println();
       
        
        
        
        
        //Print the title specifying the in-order traversal for the mirror tree after deleting the name George
        System.out.println("In-Order Traversal of Mirror Tree (After Deleting George):");
        
        
        //Print the mirror tree using in-order traversal
        mirrorTree.inOrderM();
        
        
        
        
        
        //Skip two lines in the program
        System.out.println();
        System.out.println();
        
        
        
        
        
        //Testing the mirror tree delete method again, making sure that George doesn't have to be deleted again
        System.out.println("Can George be Deleted from the Mirror Tree?: " + mirrorTree.deleteM("George"));
         
       
        
        //Skip a line in the program
        System.out.println();
        
        
        
        
        
        //Testing the mirror tree search method again, if George is located in the tree
        System.out.println("Is George in the Mirror Tree?: " + mirrorTree.searchM("George"));
        
      
        
        //Skip three lines in the program
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        
        
        
        
        //Print the title specifying the in-order traversal for the mirror tree before the minimum is deleted
        System.out.println("In-Order Traversal of Mirror Tree (Before Minimum Deleted):");
        
        
        //Print the mirror tree using in-order traversal
        mirrorTree.inOrderM();
        
        
        
        
        //Skip two lines in the program
        System.out.println();
        System.out.println();
        
        
        
        
        //Testing the delete minimum method
        System.out.println("Is the Minimum Value from the Mirror Tree Deleted?: " + mirrorTree.deleteMin());
        
        
        
        //Skip a line in the program
        System.out.println();

        
        
         //Print the title specifying the in-order traversal for the mirror tree after the minimum has been deleted
        System.out.println("In-Order Traversal of Mirror Tree (After Minimum Deleted):");
        
        
        //Print the mirror tree using in-order traversal
        mirrorTree.inOrderM();
        

        //Skip four lines in the program
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
       
        
        
        
        
        
        
        
        //Print the title specifying the in-order traversal for the original tree
        System.out.println("In-Order Traversal of Original Tree:");
        
        
        //Print the original tree using in-order traversal
        originalTree.inOrder();
        
        
        //Skip two lines in the program
        System.out.println();
        System.out.println();
        
        
        
        
        
        //Print the title specifying the in-order traversal for the original tree, converted into a mirror image
        System.out.println("Mirror Image of Original Tree:");
        
        
        //Test the mirror image method for the original tree
        originalTree.mirror();       
        
        
        //Skip two lines in the program
        System.out.println();
        System.out.println();
        
        
    }
    
}
