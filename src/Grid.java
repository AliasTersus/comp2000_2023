import java.awt.Graphics;
import java.awt.Point;

public class Grid {

  // grid made of cells
  int buffer = 10;
  Cell[][] cells = new Cell[20][20];

  public Grid() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j] = new Cell(buffer + Cell.size * i, buffer + Cell.size * j);
      }
    }
  }

  public void paint(Graphics g) {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j].paint(g);
      }
    }
  }


}
//
