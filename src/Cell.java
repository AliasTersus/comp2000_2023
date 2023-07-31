import java.awt.Color;
import java.awt.Graphics;



public class Cell {
  
  int xDimension = 35;
  int yDimension = 35;
  static int size = 35;

  public Cell(int xDimension, int yDimension){
    this.xDimension = xDimension;
    this.yDimension = yDimension;
  }



  public void paint(Graphics g){

          g.setColor(Color.WHITE);
          System.out.println("setColor");
          g.fillRect(xDimension, yDimension, size, size);
          System.out.println("drawRect");
          g.setColor(Color.black);
          System.out.println("setColor");
          g.drawRect(xDimension, yDimension, size, size);
          System.out.println("fillRect");

          }
      


}
