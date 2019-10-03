import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
 
 class example {  
   public example() {  
        JFrame frame = new JFrame("JFrame Example");   
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
        frame.add(label);
        frame.add(button);
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

public class gui{

    public static void main(String args[])
    {
        new example();
    }
}