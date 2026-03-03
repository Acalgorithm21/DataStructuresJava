public class MazeGameDemo{

   public static void main(String[] args){
   
      NewMaze maze1 = new NewMaze(7, 10);
      System.out.println(maze1.entranceCoordinate.x + 1);
      System.out.println(maze1.exitCoordinate.x + 1);
      maze1.cravePath();
      
   }
}