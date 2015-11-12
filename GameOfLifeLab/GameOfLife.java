 

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.Location;

import java.util.Random;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 5;
    private final int COLS = 5;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        UnboundedGrid<Actor> grid = new UnboundedGrid<Actor>();
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
       
        Random rand = new Random();
        
        int n;
        
        for (int i =0; i <= 500; i++)
        {
            for (int a = 0; a <= 500; a++)
            {
                n = rand.nextInt(10);
                if (n == 2 || n == 5 || n == 7 || n== 9 || n == 1)
                    {
                        Actor rock1 = new Actor();
                        Location loc1 = new Location(i, a);
                        grid.put(loc1, rock1);
                    }
            }
        }
        
        //Tested version (Works if this is placed as code for populateGame)
        
        //for (int i =0; i <= 4; i++)
        //{
           // for (int a = 0; a <= 4; a++)
            //{
              //  if (i == 0 && a == 0 ||
                //    i == 0 && a == 4 ||
                //    i == 1 && a == 1 ||
                //    i == 1 && a == 3 ||
                //    i == 2 && a == 2 ||
                //    i == 3 && a == 1 ||
                //    i == 3 && a == 3 ||
                //    i == 4 && a == 0 ||
                //    i == 4 && a == 4 )
                //    {
                //        Actor rock1 = new Actor();
                //        Location loc1 = new Location(i, a);
                 //       grid.put(loc1, rock1);
                 //   }
         //   }
        
        // create and add rocks (a type of Actor) to the three intial locations
        
        
   }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        
        
        // create the grid, of the specified size, that contains Actors
        
        Grid<Actor> grid = world.getGrid();
        UnboundedGrid<Actor> grid1 = new UnboundedGrid<Actor>();
        
        Actor actor = new Actor();
        int neighbor;
        
        for (int i = 0; i <= 1000; i++)
        {
            for (int a = 0; a <= 1000; a++)
            {
                neighbor = 0;
                if (getActor(i, a) != null)
                {
                    if (getActor(i+1, a) != null)
                    {
                        neighbor += 1;
                    }
                    
                    if (getActor(i, a+1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i, a-1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i+1, a+1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i+1, a-1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i-1, a+1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i-1, a-1) != null)
                    {
                        neighbor += 1;
                    }
                    
                    if (getActor(i-1, a) != null)
                    {
                            neighbor += 1;
                        }
                    
                    
                    if (neighbor == 2 || neighbor == 3)
                    {
                        Location loc = new Location(i, a);
                        grid1.put(loc, actor);
                    }
                }
                else
                {
                    if (getActor(i+1, a) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i-1, a) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i, a+1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i, a-1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i+1, a+1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i+1, a-1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i-1, a+1) != null)
                    {
                        neighbor += 1;
                    }
                    if (getActor(i-1, a-1) != null)
                    {
                        neighbor += 1;
                    }   
                    
                    
                    if (neighbor == 3)
                    {
                        Location loc2 = new Location(i, a);
                        grid1.put(loc2, actor);
                    }
                }
            }
        }
        world.setGrid(grid1);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        
        // A for loop that runs through many generations
        for (int i = 0; i < 10000; i++)
        {
            Thread.sleep(1000);
            game.createNextGeneration();
        }
    }

}
