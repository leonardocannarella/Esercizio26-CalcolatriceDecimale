import javax.swing.*;
import java.awt.*;

public class GuidaFrame extends JFrame
{
    ImageIcon img = new ImageIcon("icon/calculator.png");

    public GuidaFrame(String titolo)
    {
        super(titolo);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconImage(img.getImage());
        setBounds(50,50,600,300);
    }
}