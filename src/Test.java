import javax.swing.*;
import java.awt.*;

public class Test
{
    public static void main(String[] args)
    {
        //Creazione di una calcolatrice
        Calcolatrice c1 = new Calcolatrice(5, 25);
        System.out.println(c1.logaritmo());

        MyFrame f = new MyFrame("Calcolatrice");
        Container c = f.getContentPane();
        MyPanel panel = new MyPanel();
        c.add(panel);

        f.setVisible(true);
    }
}
