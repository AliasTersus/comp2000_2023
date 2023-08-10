import java.awt.Color;
import java.awt.Graphics;

public abstract class Actor {

  Cell location;
  Color color;


  public void paint(Graphics g){
  g.setColor(Color.BLACK);
  g.fillRect(location.x+5, location.y+5, location.width-10, location.height-10);
  g.setColor(color);
  g.fillRect(location.x+10, location.y+10, location.width-20, location.height-20);
  }


}
