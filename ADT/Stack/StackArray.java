import java.util.*;

   
 /**
   * StackArray<T> is an array-based implementation of the StackADT interface.
   *
   * @param <T> the type of elements stored in the stack
   */

   public class StackArray<T> implements StackADT<T>{
   
      private ArrayList<T> stack;
      
      
    /**
      * Constructor initializes an empty stack.
      */
      public StackArray(){
      
         stack = new ArrayList <>();
        
      }
      
      
    /**
      * Pushes an element onto the top of the stack.
      * Time Complexity: O(1) amortized
      *
      * @param element the element to insert
      */
   
      @Override
      public void push(T element){
      
         stack.add(element);
      
      }
      
      
    /**
      * Removes and returns the top element of the stack.
      * Time Complexity: O(1)
      *
      * @return the element removed
      * @throws EmptyStackException if the stack is empty
      */
     
      @Override
      public T pop(){
         if (stack.isEmpty()) throw new EmptyStackException();
         T element = stack.remove(stack.size() - 1);
         return element;
      
      }
      
      
    /**
      * Returns the top element of the stack without removing it.
      * Time Complexity: O(1)
      *
      * @return the top element
      * @throws EmptyStackException if the stack is empty
      */
   
      @Override
      public T peek(){
        if (stack.isEmpty()) throw new EmptyStackException();
        T element = stack.get(stack.size() - 1);
        return element;
      }
      
      
    /**
      * helper method that checks to see if the Stack is empty.
      *
      * Time Complexity O(1)
      *
      * @return True if stack is empty, false if otherwise. 
      */
      
      public boolean isEmpty(){
      
         return stack.isEmpty();
      }
      
    /**
      * Removes all elements from the stack.
      *
      * Time Complexity: O(n)
      */
      
      public void clear(){
      
         stack.clear();
      
      }
      
      
   }
