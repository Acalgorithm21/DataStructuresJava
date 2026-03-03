import java.util.*;

   /**
    * StackADT<T> defines the blueprint for a generic stack.
    *
    * @param <T> the type of elements stored in the stack
    */

   public interface StackADT<T> {
    
    
       /**
         * This method inserts items into the stack.
         *
         * @param element to be inserted into stack  
         */
       void push(T element);
    
       /** 
         * This method removes the top item of stack.  
         *
         * @return the value removed from the stack 
         */
       T pop();
    
       /** 
         * This method lets user see what is at the top of stack.
         *
         * @return the value at the top of stack
         */
       T peek();
    
    
   }
   
   
