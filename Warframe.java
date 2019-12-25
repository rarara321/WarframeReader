public class Warframe {
    /* WHAT IS THIS CLASS FOR? */
    /* This class represents a whole warframe. So if you were to think of Frost Prime, this class is all the */
    /* blueprints, all the relics, and the name of the warframe smashed into one. */

    /* Variables */

    public String name; /* Warframe name */
    public Blueprint mainBP; /* Main BP farming information */
    public Blueprint chassisBP; /* Chassis BP farming information */
    public Blueprint systemsBP; /* Systems BP farming information */
    public Blueprint neuropticsBP; /* Neuroptics BP farming information */

    /* Functions */

    /*  Constructor. Requires all blueprints and the name of said warframe in order to create. */
    public Warframe(String n, Blueprint main, Blueprint chass, Blueprint sys, Blueprint neuro)
    {
        name = n;
        mainBP = main;
        chassisBP = chass;
        systemsBP = sys;
        neuropticsBP = neuro;
    }
}
