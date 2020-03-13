import javax.swing.*;
import java.awt.*;

public class GuidaPanel extends JPanel
{
    JLabel info;

    public GuidaPanel()
    {
        info = new JLabel("<html>GUIDA ALL'UTILIZZO<br><br> Scrivi il primo numero nella casella 1 e il secondo nella casella 2.<br><br>" +
                "ADDIZIONE: La calcolatrice farà la seguente operazione -> Casella1 + Casella2<br>" +
                "SOTTRAZIONE: La calcolatrice farà la seguente operazione -> Casella1 - Casella2<br>" +
                "MOLTIPLICAZIONE: La calcolatrice farà la seguente operazione -> Casella1 x Casella2<br>" +
                "DIVISIONE: La calcolatrice farà la seguente operazione -> Casella1 : Casella2<br>" +
                "POTENZA: La calcolatrice farà la seguente operazione -> Casella1 elevato alla Casella2<br>" +
                "RADICE QUAD.: La calcolatrice farà la seguente operazione -> Radice quadrata della Casella1<br>" +
                "LOGARITMO: La calcolatrice farà la seguente operazione -> Logaritmo in base Casella1 di Casella2</html>");

        setLayout(new GridLayout(1,1));
        add(info);
    }
}
