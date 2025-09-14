public class MyFrame extends JFrame
{
   private JButton button;
   private JPanel panel;
   private JComponent drawing;
   private int diam;
 
   private MyFrame()
   {
      diam = 10;
      
      button = new JButton("Click here to add a circle");
      button.addActionListener(new AnyListener());
      drawing = new MyDrawing();
      panel = new JPanel();
      panel.add(drawing);
      panel.add(button);
      add(panel);
   }
 
   class MyDrawing extends JComponent
   {
      public void paintComponent(Graphics g)
      {
         g.fillOval(1, 1, diam, diam);
         repaint();
      }
   }
 
   class AnyListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         diam = diam + 5;
      }
   }
}

public class MyViewer
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 200;
 
   public static void main(String[] args)
   {
      MyFrame frame = new MyFrame();
      frame.setTitle("My Frame");
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
   }
}
