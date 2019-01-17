import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
	    File test = new File("/Users/larissablachfelder/documents/test.txt"); //Laptop auf Deutsch aber Betriebssystem Englisch

         // File Reader zur gleichen zeit lesen zugriff auf die datei

        BufferedReader br = null;

            List<String> liste = new ArrayList<String>(); //liste erstellen

        try
        {
             br = new BufferedReader(new FileReader(test));

            while(true)
            {
                String zeilen = br.readLine();


                if(zeilen == null) //abbruchbedingung, deshalb alles andere danach
                {
                    break;
                }

                liste.add(zeilen);//liste befüllen
            }
        }
        catch(IOException e)
        {
          e.printStackTrace();
        }
        finally
        {
                try
                {
                    br.close();

                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
        }


        for(String item : liste)
        {
            System.out.println(item);
        }

    }
}
