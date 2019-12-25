import java.util.ArrayList;

public class Blueprint {
    /* WHAT IS THIS CLASS FOR? */
    /* This class contains the individual blueprint information, that being what void relics contain it.  */

    /* Variables */

    /* ArrayList of all relics in which blueprint is found. Using ArrayList so the array size can be dynamically changed */
    public ArrayList<VoidRelic> relics = new ArrayList<>();
    /* Kind of a hack fraud ArrayList created to match rarity with each relic. 1 = common, 2 = uncommon, 3 = rare */
    public ArrayList<Integer> rarity = new ArrayList<>();
    /* Name of the specific blueprint, important for searching functionality on the warframe market */
    public String name;

    /* Functions */

    /*  Constructor. Requires at least one VoidRelic, rarity, and the name */
    public Blueprint(VoidRelic relic, int rare, String name)
    {
        relics.add(relic);
        rarity.add(rare);
        this.name = name;
    }

    /*  Simple function that lets you add more source relics for blueprint. */
    public void addRelic(VoidRelic relic, int rare)
    {
        relics.add(relic);
        rarity.add(rare);
    }

    /* Even more simple function that returns the number of relics associated with blueprint. */
    public int noOfRelics()
    {
        return relics.size();
    }
}
