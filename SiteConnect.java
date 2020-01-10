import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class SiteConnect {

    /* WHAT IS THIS CLASS FOR? */
    /* This is the class that establishes a connection to the specific warframe market page for the prime component. */
    /* You'll notice it also has an arraylist of prices, this is aquired from a list of all prices on the webpage, and is */
    /* passed to another class as soon as it's aquired */

    /* Variables */

    String baseURL = "https://warframe.market/"; /*base website*/
    URL site; /*object that will be a mix between the baseURL and the path to the specific warframe component url*/
    URLConnection siteRead; /*object that actually establishes conenction*/
    ArrayList<Integer> prices = new ArrayList<Integer>(); /*list of all market prices for the component*/

    /* Functions */

    /* Constructor that establishes a connection to the base site */
    public SiteConnect()
    {
        System.out.println("Loading connection...");
        setURL();
    }

    /*  Overloaded function for setURL that will connection to a site given a specific blueprint. */

    public void setURL(Blueprint bp)
    {
        String name = "items/" + bp.name; // The url for every component is https://warframe.market/items/bp.name, which is why the name is created like this.

        /*This part of the code changes the spaces in the string underscores, as the url uses underscores instead of spaces*/
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

        /* Attempts connection to specific URL */
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

    /* Base function for setURL, in which it connects to the initial site and checks if there are any errors */

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

    /*  Function that goes through the HTML data of the site and reads it */

    private void readSite(URLConnection siteRead) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(siteRead.getInputStream()));
        String line;
        while ((line = read.readLine()) != null )
        {
            /* The specific JSON line we're looking for is the application state line, and thus once we reacher that line we just pass it to the parser and break */
            if (line.contains("application-state"))
            {
                parser(line);
                break;
            }
        }
        read.close();
    }

    /* When readSite gets to the line with the prices information, parser will count all the listed prices and add them to the prices array */

    private void parser(String line)
    {
        /* To parse through the very long line, we first split it into different words by splitting it whenever there is a space*/
        String[] words = line.split(" ");
        for (int i=0; i<words.length; i++)
        {
            /* When going line by line, there is a specific part that lists: "Platinum: cost", so once we find the word platinum, we know the next word will be the listed price*/
            if (words[i].contains("platinum"))
            {
                String number = words[i+1];
                number = number.substring(0, number.length()-1);
                int value = (int)Double.parseDouble(number);
                prices.add(value);
            }
        }
    }

}

