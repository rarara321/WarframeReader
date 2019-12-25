import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SiteConnect {

    String baseURL = "https://warframe.market/";
    URL site;
    URLConnection siteRead;

    public SiteConnect()
    {
        System.out.println("Loading connection...");
        setURL();
    }

    public void setURL(Blueprint bp)
    {
        setURL();
        String name = "items/" + bp.name;
        char[] nameArray = name.toCharArray();
        for (int i=0; i<nameArray.length; i++)
        {
            nameArray[i] = Character.toLowerCase(nameArray[i]);
            if (nameArray[i] == ' ')
            {
                nameArray[i] = '_';
            }
        }
        name = new String(nameArray);
        try
        {
            site = new URL(site, name);
            siteRead = site.openConnection();
            readSite(siteRead);
        }
        catch (Exception e)
        {
            System.out.println("COULD NOT FIND BLUEPRINT SITE, ERROR CODE:");
            System.out.println(e);
        }
    }

    private void setURL()
    {
        try
        {
            site = new URL(baseURL);
            System.out.println("Connection Established!");
        }
        catch (Exception e)
        {
            System.out.println("COULD NOT ACCESS SITE: ERROR CODE:");
            System.out.println(e);
        }
    }

    public void readSite(URLConnection siteRead) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(siteRead.getInputStream()));
        String line;
        while ((line = read.readLine()) != null )
        {
            System.out.println(line);
        }
        read.close();
    }
}
