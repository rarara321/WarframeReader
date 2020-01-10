import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Database d = new Database();
        Scanner sc = new Scanner(System.in);
        SiteConnect connection = new SiteConnect();
        connection.setURL(d.warframes[0].mainBP);
        PriceCalculations calculate = new PriceCalculations(connection.prices);
        System.out.println(calculate.getAverage());
        /*while (true)
        {
            System.out.println("Which warframe do you want to see?\n");
            System.out.println("-1: Quit");
            for (int i=0; i< d.warframes.length; i++)
            {
                System.out.println(i + ": " + d.warframes[i].name);
            }
            while (!sc.hasNextInt())
            {
                System.out.println("Please input a number.");
            }
            int choice = sc.nextInt();
            if (choice >= d.warframes.length || choice == -1)
            {
                break;
            }
            Warframe w = d.warframes[choice];
            System.out.print("\n\nBlueprint: ");
            for (int i=0; i< w.mainBP.noOfRelics(); i++)
            {
                System.out.print(w.mainBP.relics.get(i).name +" ( " );
                if (w.mainBP.rarity.get(i) == 1)
                {
                    System.out.print("Common ), ");
                }
                else if (w.mainBP.rarity.get(i) == 2)
                {
                    System.out.print("Uncommon ), ");
                }
                else
                {
                    System.out.print("Rare ), ");
                }
            }

            System.out.print("\nChassis: ");
            for (int i=0; i< w.chassisBP.noOfRelics(); i++)
            {
                System.out.print(w.chassisBP.relics.get(i).name +" ( " );
                if (w.chassisBP.rarity.get(i) == 1)
                {
                    System.out.print("Common ), ");
                }
                else if (w.chassisBP.rarity.get(i) == 2)
                {
                    System.out.print("Uncommon ), ");
                }
                else
                {
                    System.out.print("Rare ), ");
                }
            }

            System.out.print("\nSystems: ");
            for (int i=0; i< w.systemsBP.noOfRelics(); i++)
            {
                System.out.print(w.systemsBP.relics.get(i).name +" ( " );
                if (w.systemsBP.rarity.get(i) == 1)
                {
                    System.out.print("Common ), ");
                }
                else if (w.systemsBP.rarity.get(i) == 2)
                {
                    System.out.print("Uncommon ), ");
                }
                else
                {
                    System.out.print("Rare ), ");
                }
            }

            System.out.print("\nNeuroptics: ");
            for (int i=0; i< w.neuropticsBP.noOfRelics(); i++)
            {
                System.out.print(w.neuropticsBP.relics.get(i).name +" ( " );
                if (w.neuropticsBP.rarity.get(i) == 1)
                {
                    System.out.print("Common ), ");
                }
                else if (w.neuropticsBP.rarity.get(i) == 2)
                {
                    System.out.print("Uncommon ), ");
                }
                else
                {
                    System.out.print("Rare ), ");
                }
            }

            System.out.println("\n");
        }*/
    }
}

/* Design docs

    Read Warframe.market to check the average price, the cheapest price online / offline, and return that
    Return what void relics work for which warframes

    In order to do that:
    Void relics with a warframe parts stored on it
    Void relics stored with whether they are vaulted or from baro ki'teer
    Warframes have 4 components, Blueprint, chassic, neuroptics, systems
    Each void relic has a component attached to it.
    

 */