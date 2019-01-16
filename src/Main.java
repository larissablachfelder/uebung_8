import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
	    File test = new File("/Users/larissablachfelder/documents/test.txt"); //Laptop auf Deutsch aber Betriebssystem Englisch


        try
        {
            FileReader read = new FileReader(test);
            BufferedReader br = new BufferedReader(read);

            while(true)
            {
                String zeilen = br.readLine();

                if(zeilen == null)
                {
                    break;
                }
            }
        }
        catch(IOException e)
        {
          e.printStackTrace();
        }

    }
}
