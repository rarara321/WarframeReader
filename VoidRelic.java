public class VoidRelic {
    /* WHAT IS THIS CLASS FOR? */
    /* This class represents any singular void relic, and it contains no information about it save for: */
    /* its name and whether it's a baro ki'teer or vaulted relic. */

    /* Variables */

    public boolean vaulted; /* True/false to say if relic is vaulted or not */
    public boolean baro; /*  True/false to say if relic is only obtained from Baro Ki'Teer */
    public String name; /* Name of the void relic */

    /* Functions */

    /* Constructor. Creates the void relic, we need to know this name, if it's a vaulted relic, and if it's from Baro Ki'Teer */
    public VoidRelic ( String name, boolean vaulted, boolean baro)
    {
        this.vaulted = vaulted;
        this.baro = baro;
        this.name = name;
    }

}
