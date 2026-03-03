public interface Maze{

   /**
     * This method initializes Walls, Entrance coordinates, and Exit coordinates 
     *
     * 
     */

   public void initialize();
   
   /**
     * This method checks to see if the next desired spot is empty. 
     * 
     * @return true if spot is empty, otherwise false if spot is occupied.
     */

   public boolean createPath(Object maze, int x, int y);
   
   /**
     * This method gets entrance X coordinate of entrance
     * 
     * @return The entrance X coorinate
     */
   
   
   
}