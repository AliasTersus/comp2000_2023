import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;

public class Main extends JFrame{
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }
        class Canvas extends JPanel{
        Grid grid = new Grid();

        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g){
            grid.paint(g);
            System.out.println(getMousePosition());
        }
   
    }

    


    private Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);

    }
}

