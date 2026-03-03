import java.util.*;

public class StackDemo{

   public static void main(String[] args){
   
      StackArray<String> names = new StackArray<String>();
      names.push("Lex");
      System.out.println(names.peek());
   
   }

}