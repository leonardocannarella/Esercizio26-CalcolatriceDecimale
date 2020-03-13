import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener
{
    Calcolatrice c1 = new Calcolatrice(0,0);
    JTextField num1, num2;
    JLabel ris, tip;
    JButton add, sott, molt, divis, pot, radq, log, openGuide;

    public MyPanel()
    {
        num1 = new JTextField();
        num1.setHorizontalAlignment(JTextField.CENTER);
        num2 = new JTextField();
        num2.setHorizontalAlignment(JTextField.CENTER);
        tip = new JLabel("CALCOLATRICE - LEONARDO CANNARELLA", SwingConstants.CENTER);
        tip.setFont(tip.getFont().deriveFont(20.0f));
        tip.setForeground(Color.RED);
        ris = new JLabel("NESSUN RISULTATO", SwingConstants.CENTER);
        ris.setFont(ris.getFont().deriveFont(15.0f));
        add = new JButton("a+b");
        sott = new JButton("a-b");
        molt = new JButton("axb");
        divis = new JButton("a:b");
        pot = new JButton("a^b");
        radq = new JButton("sqrt(a)");
        log = new JButton("log_a(b)");
        openGuide = new JButton("Guida");
        openGuide.setBorder(new LineBorder(Color.BLACK));
        openGuide.setForeground(Color.green);

        setLayout(new GridLayout(12,1));
        add(tip);
        add(num1);
        add(num2);
        add(ris);
        add(add);
        add(sott);
        add(molt);
        add(divis);
        add(pot);
        add(radq);
        add(log);
        add(openGuide);

        add.addActionListener(this);
        sott.addActionListener(this);
        molt.addActionListener(this);
        divis.addActionListener(this);
        pot.addActionListener(this);
        radq.addActionListener(this);
        log.addActionListener(this);
        openGuide.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        num2.setEditable(true);
        tip.setText("CALCOLATRICE - LEONARDO CANNARELLA");

        Object pulsantePremuto = e.getSource();

        String text1 = num1.getText();
        String text2 = num2.getText();
        boolean match1 = text1.matches("[a-zA-Z]");
        boolean match2 = text1.matches("[a-zA-Z]");

        if(!match1 && !match2)
        {

            if(pulsantePremuto==add)
            {
                if(!num1.getText().equals("") && !num2.getText().equals(""))
                {
                    c1.setNumero1(Integer.parseInt(num1.getText()));
                    c1.setNumero2(Integer.parseInt(num2.getText()));
                    ris.setText(c1.addizione());
                }
                else
                {
                    ris.setText("Inserisci tutti e due i valori!");
                }
            }

            if(pulsantePremuto==sott)
            {
                if(!num1.getText().equals("") && !num2.getText().equals(""))
                {
                    c1.setNumero1(Integer.parseInt(num1.getText()));
                    c1.setNumero2(Integer.parseInt(num2.getText()));
                    ris.setText(c1.sottrazione());
                }
                else
                {
                    ris.setText("Inserisci tutti e due i valori!");
                }
            }

            if(pulsantePremuto==molt)
            {
                if(!num1.getText().equals("") && !num2.getText().equals(""))
                {
                    c1.setNumero1(Integer.parseInt(num1.getText()));
                    c1.setNumero2(Integer.parseInt(num2.getText()));
                    ris.setText(c1.moltiplicazione());
                }
                else
                {
                    ris.setText("Inserisci tutti e due i valori!");
                }
            }

            if(pulsantePremuto==divis)
            {
                if(!num1.getText().equals("") && !num2.getText().equals(""))
                {
                    c1.setNumero1(Integer.parseInt(num1.getText()));
                    c1.setNumero2(Integer.parseInt(num2.getText()));
                    ris.setText(c1.divisione());
                }
                else
                {
                    ris.setText("Inserisci tutti e due i valori!");
                }
            }

            if(pulsantePremuto==pot)
            {
                if(!num1.getText().equals("") && !num2.getText().equals(""))
                {
                    c1.setNumero1(Integer.parseInt(num1.getText()));
                    c1.setNumero2(Integer.parseInt(num2.getText()));
                    ris.setText(c1.potenza());
                }
                else
                {
                    ris.setText("Inserisci tutti e due i valori!");
                }
            }

            if(pulsantePremuto==radq)
            {
                if(!num1.getText().equals(""))
                {
                    num2.setEditable(false);
                    tip.setText("Clicca un altro pulsante per riabilitare le caselle.");
                    c1.setNumero1(Integer.parseInt(num1.getText()));
                    c1.setNumero2(0);
                    num2.setText("");
                    ris.setText(c1.radicequadrata());
                }
                else
                {
                    ris.setText("Inserisci un valore!");
                }
            }

            if(pulsantePremuto==log)
            {
                if(!num1.getText().equals("") && !num2.getText().equals(""))
                {
                    c1.setNumero1(Integer.parseInt(num1.getText()));
                    c1.setNumero2(Integer.parseInt(num2.getText()));
                    ris.setText(c1.logaritmo());
                }
                else
                {
                    ris.setText("Inserisci tutti e due i valori!");
                }
            }

            if(pulsantePremuto==openGuide)
            {
                GuidaFrame guida = new GuidaFrame("Guida");
                Container c2 = guida.getContentPane();
                GuidaPanel panel1 = new GuidaPanel();
                c2.add(panel1);

                guida.setVisible(true);
            }
        }
        else
        {
            ris.setText("Devi inserire solo numeri!");
        }
    }


}