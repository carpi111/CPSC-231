import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class Logger
{
    private FileWriter fw;
    private String date;


    public void log(String fileName, String data)
    {
        try
        {
            fw = new FileWriter(new File(fileName), true);
            date = new Date().toString();

            fw.write(date + ": " + data + "\n");

            fw.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
