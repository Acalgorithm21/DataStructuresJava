import java.util.*;
import java.awt.*;


public class NewMaze implements Maze{
   // row then column, height then width
   Object[][] maze;
   private int height;
   private int width;
   public Point entranceCoordinate = new Point();
   public Point exitCoordinate = new Point(); //
   
   /*
    * Constructor initializes the width and height of array 
    *
    * Constructor initializes entrance and exit coordinates 
    *
    * Constructor initializes array Walls 
    *
    * @param height, width, sets the rows(height), and columns(width) of 2d array 
    */
   public NewMaze(int height, int width){
      
      this.height = height;
      this.width = width;
      maze = new Object[height][width];

      
      for (int i = 0; i < height; i++){      
         for (int j = 0; j < width; j++){
            maze[i][j] = "X";
         }
      }
      
      initialize();
      setEntranceExit();
      printMaze();
      
   
   }
   
   /*
    * Calls all helper methods to complete maze set up. 
    */
 
   @Override 
   public void initialize(){
   
      for (int i = 1; i < height - 1 ; i++){
         for (int j = 1; j < width - 1; j++){
            
            Random rand = new Random();
            int num = rand.nextInt(2);
            
            if (num == 1){
               maze[i][j] = "X";
            }
            
            else
            {
               maze[i][j] = " ";
            }
   
         }
      }
   }
   
   /*
    * This method sets entrance and exit coordinates in 2d array. 
    *
    * This method generates walls for 2d array.
    */
    
    
   @Override
   public boolean createPath(Object maze, int x, int y){
   
      return true;
   
   } 
    
      
   private void setEntranceExit(){
   
      Random rand = new Random();
      
      int exitX = rand.nextInt(1, width - 1);
      int entranceX = rand.nextInt(1, width - 1);
      
      maze[0][exitX] = " ";
      maze[height - 1][entranceX] = " ";

      entranceCoordinate.x = entranceX;
      entranceCoordinate.y = height -1;
      
      exitCoordinate.x = exitX;
      exitCoordinate.y = 0;
      
   }
   
   public void printMaze(){
   
      for (int i = 0; i < height; i++){
         for (int j = 0; j < width; j++){
             System.out.print(maze[i][j] + " ");
         }  
         System.out.println();
      }
      
   }
   
   
   public void cravePath(){
        
      ArrayList points = new ArrayList();
      
      //Generates random nodes for paths to connect to.
      for (int i = height - 2; i > 0; i-- ){
      
         Random rand = new Random();
         Point node = new Point(i, rand.nextInt(1 , width - 1)); 
         points.add(node);   
         
      }       
      
      //Tests nodes in array.
      System.out.println(points);
      
      
      Point currentPosition = entranceCoordinate;
      
      while (currentPosition != exitCoordinate){
      
         if("X".equals(maze[currentPosition.x + 1][currentPosition.y])){
         
            maze[currentPosition.x + 1][currentPosition.y] = " ";
            currentPosition.x += 1; 
         
         } 
              
         else
         {
         
            currentPosition.x += 1;
         
         
         }
       
      }
      
   }
   
   //End of file
}