import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    ImageIcon img = new ImageIcon("icon/calculator.png");
    public MyFrame(String titolo)
    {
        super(titolo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(img.getImage());
        setBounds(50,50,500,602);
    }
}