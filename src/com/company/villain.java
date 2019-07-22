package src.com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Random;

public class villain {
    private int maxhealth;
    private int currenthealth;
    private int armor;
    private int currentarmor;
    private int attack;
    private int currentattack;
    private String nume;
    public void init(int health, int armors, int attacks)
    {
        maxhealth=health;
        currenthealth=health;
        armor=armors;
        currentarmor=armors;
        attack=attacks;
        currentattack=attacks;
    }
    public void attacked(int AttNr)
    {
        Random rand = new Random();
        int dmg_primit = rand.nextInt(AttNr)+1-currentarmor;
        currenthealth-=dmg_primit;
        System.out.println(this.nume+" a fost atacat pentru "+dmg_primit+" puncte");
        if(currenthealth<=0)
            System.out.println(this.nume+" a fost eliminat");
    }
    Scanner s;

    {
        try {
            String localDir = System.getProperty("user.dir");
            File file = new File(localDir + "/src/com/company/numevil");
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> list = new ArrayList<String>();
        while(s.hasNext()){
            list.add(s.next());
        }
        s.close();
        Random rnume = new Random();
        nume=list.get(rnume.nextInt(list.size()));
    }

}
