import javax.annotation.processing.FilerException;
import javax.swing.*;
import java.io.*;

public class TextFile
{
    private char mode;
    private BufferedReader reader;
    private BufferedWriter writer;

    public TextFile(char mode) throws IOException
    {
        this.mode=mode;
        if(mode=='w')
        {
            writer = new BufferedWriter(new FileWriter("RisultatoSalvato.txt"));
        }
        else
        {
            reader = new BufferedReader(new FileReader("RisultatoSalvato.txt"));
        }
    }

    public void writeOnFile(String testo) throws IOException, FileException
    {
        writer.write(testo);
        closeFile();
    }

    public String readFromFile() throws FileException, IOException
    {
        String tmp;
        tmp = reader.readLine();
        closeFile();
        if(tmp==null)
        {
            return "0";
        }
        return tmp;
    }

    public void closeFile() throws IOException
    {
        if(this.mode=='w')
        {
            writer.close();
        }
        else
        {
            reader.close();
        }
    }
}
