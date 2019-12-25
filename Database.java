public class Database {
    /* WHAT IS THIS CLASS FOR? */
    /* This class serves as a complete database with all the relics, blueprints, and warframes created here */
    /* all references to specific relics, blueprints, or wareframes is referring to objects created here.  */

    /* Constructor. Basically the bulk of this class, creates all the specific information needed, and thus, */
    /* it has a lot of very specific, repetitive lines of code. I could write this all in a text document and*/
    /* create a parser, but I'm too lazy for that. */

    /* not fully initialized warframe array in which every warframe will be stored in */
    Warframe[] warframes;

    //TODO VAULTED FRAMES, RELICS, MAYBE EXPAND TO WEAPONS, COMPANIONS?
    public Database()
    {
        /* Specific void relics, sorted by tier, then alphabetic type */
        VoidRelic lc4 = new VoidRelic("Lith C4", false, false);

        VoidRelic ld1 = new VoidRelic("Lith D1", false, false);

        VoidRelic ll2 = new VoidRelic("Lith L2", false, false);

        VoidRelic lm4 = new VoidRelic("Lith M4", false, false);

        VoidRelic ls8 = new VoidRelic("Lith S8", false, false);

        VoidRelic lv7 = new VoidRelic("Lith V7", false, false);
        VoidRelic lv8 = new VoidRelic("Lith V8", false, false);

        VoidRelic lw2 = new VoidRelic("Lith W2", false, false);

        VoidRelic mb4 = new VoidRelic("Meso B4", false, false);

        VoidRelic mc4 = new VoidRelic("Meso C4", false, false);

        VoidRelic md4 = new VoidRelic("Meso D4", false, false);

        VoidRelic me3 = new VoidRelic("Meso E3", false, false);

        VoidRelic ml1 = new VoidRelic("Meso L1", false, false);

        VoidRelic mn9 = new VoidRelic("Meso N9", false, false);

        VoidRelic mr2 = new VoidRelic("Meso R2", false, false);

        VoidRelic mv6 = new VoidRelic("Meso V6", false, false);

        VoidRelic na3 = new VoidRelic("Neo A3", false, false);
        VoidRelic na4 = new VoidRelic("Neo A4", false, false);

        VoidRelic ng2 = new VoidRelic("Neo G2", false, false);

        VoidRelic ni1 = new VoidRelic("Neo I1", false, false);

        VoidRelic nm2 = new VoidRelic("Neo M2", false, false);

        VoidRelic no1 = new VoidRelic("Neo O1", false, true);

        VoidRelic nr3 = new VoidRelic("Neo R3", false, false);

        VoidRelic nt2 = new VoidRelic("Neo T2", false, false);

        VoidRelic nz5 = new VoidRelic("Neo Z5", false, false);

        VoidRelic aa2 = new VoidRelic("Axi A2", false, true);
        VoidRelic aa6 = new VoidRelic("Axi A6", false, false);
        VoidRelic aa7 = new VoidRelic("Axi A7", false, false);
        VoidRelic aa8 = new VoidRelic("Axi A8", false, false);
        VoidRelic aa9 = new VoidRelic("Axi A9", false, false);

        VoidRelic ab3 = new VoidRelic("Axi B3", false, false);

        VoidRelic ad2 = new VoidRelic("Axi D2", false, false);

        VoidRelic ap3 = new VoidRelic("Axi P3", false, false);

        VoidRelic at3 = new VoidRelic("Axi T3", false, false);

        VoidRelic av8 = new VoidRelic("Axi V8", false, true);

        /* Specific blueprints, and then complete warframe. Sorted by warframe, going alphabetic */

        /* Ash */
        Blueprint ashBp = new Blueprint(lv7, 2,"Ash Prime Blueprint");
        Blueprint ashCh = new Blueprint(lv8, 1,"Ash Prime Chassis");
        Blueprint ashNe = new Blueprint(na4, 2,"Ash Prime Neuroptics");
        Blueprint ashSy = new Blueprint(aa7, 3, "Ash Prime Systems");
        Warframe ash = new Warframe("Ash",ashBp,ashCh,ashSy,ashNe);

        /* Atlas */
        Blueprint atlasBp = new Blueprint(ld1, 1,"Atlas Prime Blueprint");
        Blueprint atlasCh = new Blueprint(me3, 2, "Atlas Prime Chassis"); atlasCh.addRelic(ab3, 2);
        Blueprint atlasNe = new Blueprint(aa6, 3,"Atlas Prime Neuroptics"); atlasNe.addRelic(aa9,3);
        Blueprint atlasSy = new Blueprint(mc4, 2, "Atlas Prime Systems"); atlasSy.addRelic(na3,2);
        Warframe atlas = new Warframe("Atlas", atlasBp, atlasCh, atlasSy, atlasNe);

        //Banshee

        /* Chroma */
        Blueprint chromaBp = new Blueprint(mb4, 1, "Chroma Prime Blueprint"); chromaBp.addRelic(aa6, 1);
        Blueprint chromaCh = new Blueprint(md4, 2, "Chroma Prime Chassis"); chromaCh.addRelic(ml1,2);
        Blueprint chromaNe = new Blueprint(lc4, 3, "Chroma Prime Neuroptics");
        Blueprint chromaSy = new Blueprint(mc4, 3, "Chroma Prime Systems");
        Warframe chroma = new Warframe("Chroma", chromaBp, chromaCh, chromaSy, chromaNe);

        //Ember

        /* Equinox */
        Blueprint equinoxBp = new Blueprint(at3, 2, "Equinox Prime Blueprint");
        Blueprint equinoxCh = new Blueprint(ll2, 1, "Equinox Prime Chassis"); equinoxCh.addRelic(lm4, 1); equinoxCh.addRelic(aa8, 1);
        Blueprint equinoxNe = new Blueprint(na3, 2, "Equinox Prime Neuroptics");
        Blueprint equinoxSy = new Blueprint(me3, 3, "Equinox Prime Systems");
        Warframe equinox = new Warframe("Equinox", equinoxBp, equinoxCh, equinoxSy, equinoxNe);

        // Frost Prime

        // Hydroid Prime

        /* Limbo Prime */
        Blueprint limboBp = new Blueprint(ni1, 2, "Limbo Prime Blueprint"); limboBp.addRelic(nm2,2);
        Blueprint limboCh = new Blueprint(ml1, 3, "Limbo Prime Chassis");
        Blueprint limboNe = new Blueprint(ll2, 3, "Limbo Prime Neuroptics");
        Blueprint limboSy = new Blueprint(nr3, 1, "Limbo Prime Systems"); limboSy.addRelic(at3, 1);
        Warframe limbo = new Warframe("Limbo", limboBp, limboCh, limboSy, limboNe);

        //Loki Prime

        //Mag Prime

        /* Mesa Prime */
        Blueprint mesaBp = new Blueprint(ld1, 2, "Mesa Prime Blueprint"); mesaBp.addRelic(mr2, 2);
        Blueprint mesaCh = new Blueprint(mc4, 1, "Mesa Prime Chassis"); mesaCh.addRelic(na3, 1);
        Blueprint mesaNe = new Blueprint(lm4, 3, "Mesa Prime Neuroptics");
        Blueprint mesaSy = new Blueprint(nm2, 3, "Mesa Prime Systems");
        Warframe mesa = new Warframe("Mesa", mesaBp, mesaCh, mesaSy, mesaNe);

        //Mirage

        //Nekros

        //Nova

        //Nyx

        //Oberon

        //Rhino

        //Saryn

        //Trinity

        //Valkyr

        /* Vaubaun */
        Blueprint vaubaunBp = new Blueprint(mv6, 2, "Vaubaun Prime Blueprint");
        Blueprint vaubaunCh = new Blueprint(na4, 1, "Vaubaun Prime Chassis");
        Blueprint vaubaunNe = new Blueprint(lv7, 3, "Vaubaun Prime Neuroptics");
        Blueprint vaubaunSy = new Blueprint(lv8, 3, "Vaubaun Prime Systems");
        Warframe vaubaun = new Warframe("Vaubaun", vaubaunBp, vaubaunCh, vaubaunSy, vaubaunNe);

        /* Volt Prime */
        Blueprint voltBp = new Blueprint(no1, 1, "Volt Prime Blueprint");
        Blueprint voltCh = new Blueprint(av8, 2, "Volt Prime Chassis");
        Blueprint voltNe = new Blueprint(av8, 3, "Volt Prime Neuroptics");
        Blueprint voltSy = new Blueprint(no1, 2, "Volt Prime Systems");
        Warframe volt = new Warframe("Volt", voltBp, voltCh, voltSy, voltNe);

        /* Wukong Prime */
        Blueprint wukongBp = new Blueprint(lw2, 3, "Wukong Prime Blueprint");
        Blueprint wukongCh = new Blueprint(mb4, 2, "Wukong Prime Chassis");
        Blueprint wukongNe = new Blueprint(ni1, 1, "Wukong Prime Neuroptics"); wukongNe.addRelic(nt2, 1);
        Blueprint wukongSy = new Blueprint(ap3, 2, "Wukong Prime Systems");
        Warframe wukong = new Warframe("Wukong", wukongBp, wukongCh, wukongSy, wukongNe);

        //Zephyr Prime

        /* Array of all created warframes to be easily accessed */
        warframes = new Warframe[]{ash, atlas, chroma, equinox, limbo, mesa, vaubaun, volt, wukong};

    }

    public Warframe findFrame(String name)
    {
        for (Warframe warframe : warframes) {
            if (name == warframe.name) {
                return warframe;
            }
        }
        System.out.println("Could not find specified warframe.");
        return warframes[0];
    }

}
