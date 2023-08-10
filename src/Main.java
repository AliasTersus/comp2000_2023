import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;


public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }


    //Initalises the playStage. 
    class Canvas extends JPanel {
      Stage playStage = new Stage(); 

      //Sets up the graphical interface size
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));    
      }
      
      //
      @Override
      public void paint(Graphics g) {
        playStage.paint(g, getMousePosition());     
       }        
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
