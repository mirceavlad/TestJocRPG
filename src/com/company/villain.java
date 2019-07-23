package src.com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Random;

public class villain {
    private static int villainnr=0;
    private int maxhealth;
    public int currenthealth;
    private int armor;
    private int currentarmor;
    private int attack;
    private int currentattack;
    public String name;
    public void init(int health, int armors, int attacks)
    {
        villainnr++;
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
        int dmg_primit = rand.nextInt(AttNr)+3-this.currentarmor;
        currenthealth-=dmg_primit;
        System.out.println(this.name+" a fost atacat pentru "+dmg_primit+" puncte");
        if(currenthealth<=0) {
            System.out.println(this.name + " a fost eliminat");
        }
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
        Random rname = new Random();
        name=list.get(rname.nextInt(list.size()));
    }
    public void Attack(Player x){
        x.attacked(currentattack);
    }



}