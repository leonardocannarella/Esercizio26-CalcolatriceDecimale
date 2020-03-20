import java.lang.Math.*;

public class Calcolatrice
{
    //Attributi interni
    private int numero1;
    private int numero2;

    //Costruttore
    public Calcolatrice(int numero1, int numero2)
    {
        setNumero1(numero1);
        setNumero2(numero2);
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Metodo per il calcolo dell'addizione
    public String addizione()
    {
        int somma = numero1+numero2;

        return "La somma è " + somma;
    }

    //Metodo per il calcolo della sottrazione
/* Metodo per il calcolo della sottrazione con utilizzo della seguente eccezione:
   - NegativeNumberException per controllare risultato negativo */
    public String sottrazione()
    {
        //Dichiarazione
        int sottrazione=0;

        //Gestore di eccezioni

        //Blocco di esecuzione delle istruzioni nel codice
        try
        {
            //Lanciare eccezione creata per risultato negativo
            if(numero2>numero1)
                throw new NegativeNumberException();
            else
                sottrazione=numero1-numero2;
        }

        //Sollevamento di eccezione, se il risultato è negativo
        catch(NegativeNumberException e)
        {
            //Stampa a video del messaggio di eccezione
            return "Il primo numero non può essere minore del secondo!";
        }

        return "La sottrazione è " + sottrazione;
    }

    //Metodo per il calcolo della moltiplicazione
    public String moltiplicazione()
    {
        int moltiplicazione = numero1*numero2;

        return "La moltiplicazione è " + moltiplicazione;
    }

    //Metodo per il calcolo della divisione
/* Metodo per il calcolo della divisione con utilizzo delle seguenti eccezioni:
   - ArithmeticException per controllare divisioni per zero
   - NotAnIntException per controllare che i dividendi siano numeri interi */
    public String divisione() throws ArithmeticException
    {
        //Dichiarazione
        double divisione=0;

        //Gestore di eccezioni

        //Blocco di esecuzione delle istruzioni nel codice
        try
        {
            divisione=numero1/numero2;

            //Lanciare eccezione creata ad hoc per valori non interi
            if(numero1%numero2!=0)
            {
                throw new NotAnIntException();
            }

        }

        //Sollevamento di eccezione, se il denominatore è zero
        catch(ArithmeticException e)
        {
            //Stampa a video del messaggio di eccezione
            return "Non si può dividere per zero!\n";
        }

        //Sollevamento di eccezione, se i valori non sono interi
        catch(NotAnIntException e)
        {
            //Stampa a video del messaggio di eccezione
            return "Errore nella divisione! Inserire numeri che restituiscono risultati interi.\n";
        }
        return "La divisione è " + divisione;
    }

    //Metodo per il calcolo della potenza
    public String potenza()
    {
        double potenza = Math.pow((double)numero1, (double)numero2);
        return "La potenza vale "+potenza;
    }

    //Metodo per il calcolo della radice quadrata
/* Metodo per il calcolo della radice quadrata con utilizzo della seguente eccezione:
   - InvalidRadicandException per controllare radicandi negativi */
    public String radicequadrata()
    {
        //Dichiarazione
        double radice=0;

        //Gestore di eccezioni

        //Blocco di esecuzione delle istruzioni nel codice
        try
        {
            //Lanciare eccezione creata ad hoc per valori negativi
            if(numero1<0)
                throw new InvalidRadicandException();
            else
                radice = Math.sqrt((double)numero1);
        }

        //Sollevamento di eccezione, se il radicando è negativo
        catch(InvalidRadicandException e)
        {
            //Stampa a video del messaggio di eccezione
            return "Il radicando non può essere negativo!";
        }

        return "La radice vale "+radice;
    }

    //Metodo per il calcolo del logaritmo
    /* Metodo per il calcolo del logaritmo con utilizzo della seguente eccezione:
   - NegativeArgument per controllare argomenti negativi */
    public String logaritmo()
    {
        //Dichiarazione
        double log=0;

        //Gestore di eccezioni

        //Blocco di esecuzione delle istruzioni nel codice
        try
        {
            //Lanciare eccezione creata ad hoc per argomento e base negativi
            if(numero1<=0 || numero2<=0)
                throw new NegativeArgumentException();
            else
                log = Math.log((double)numero2)/Math.log((double)numero1);
        }

        //Sollevamento di eccezione se l'argomento e la base sono negativi
        catch(NegativeArgumentException e)
        {
            //Stampa a video del messaggio di eccezione
            return "Il logaritmo non può avere argomento o base negativi!";
        }

        return "Il logaritmo vale "+log;
    }
}
