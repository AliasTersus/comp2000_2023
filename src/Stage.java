import java.awt.Graphics;
import java.awt.Point;


public class Stage{

Grid gameGrid;
Actor cat;
Actor dog;
Actor bird;


//initialises the grid and actors
public Stage(){
  gameGrid = new Grid();
  cat = new Cat(gameGrid.cells[5][5]);
  dog = new Dog(gameGrid.cells[10][10]);
  bird = new Bird(gameGrid.cells[15][15]);
}

//calls to the grid to call to the cells to paint themselves
//calls to the actors to paint themselves over the grid
public void paint(Graphics g, Point mouseLoc) {
  if (gameGrid != null) { // Check if gameGrid is initialized before using it
      gameGrid.paint(g, mouseLoc);
      cat.paint(g);
      dog.paint(g);
      bird.paint(g);
  } 
}


}

