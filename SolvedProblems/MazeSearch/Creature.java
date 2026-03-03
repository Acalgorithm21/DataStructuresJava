/** 
  * This interface is the blueprint for Creature 
  *  
  * 
  */



public interface Creature {
    
    /**
      * This method moves creature in the up direction inside of 2d Array
      *
      * 
      */
    void moveUp();
    
    /**
      * This methid moves creature in the DOWN direction inside of 2d Array
      *
      *
      */
      
    void moveDown();
    
    /**
      * This method moves creature in the LEFT direction inside of 2d Array
      *
      *
      */
      
    void moveLeft();
    
    /**
      * This method moves creatures in the RIGHT direction inside of 2d Array
      *
      *
      */
      
    void moveRight();
    
    /**
      * This method creates a stack that holds the squares visited on a particular path 
      * 
      *
      */
    
    void createPath();
    
    /**
      * This method gets the current X position of creature 
      *
      * @return the position of creature 
      */
    int getPositionX();    
    
    /**
      * This method gets the current Y position of creature 
      *
      * @return the position of creature 
      */
    
    int getPositionY();    

}