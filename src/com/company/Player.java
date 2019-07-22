package src.com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    private static String name;
    public int maxhealth;
    public int currenthealth;
    public int armor;
    public int currentarmor;
    private int attackinit;
    public int attack;
    ArrayList<String> inventory = new ArrayList<String>();

    public void stats(){
        System.out.println("HP: "+currenthealth+"/"+maxhealth);
        System.out.println("Armura: "+currentarmor+"/"+armor);
        System.out.println("Atac: "+attack);
        System.out.println("Inventar: "+ inventory);
    }
    public void start(){
        maxhealth=50;
        currenthealth=maxhealth;
        armor=0;
        currentarmor=armor;
        attackinit=10;
        attack=attackinit;
        System.out.println("Introduceti numele jucatorului: ");
        Scanner s= new Scanner(System.in);
        name=s.nextLine();
        System.out.println("Numele este: "+name);
        this.stats();

    }
    public void Attack(villain x){
        x.attacked(attack);
    }
    public void attacked(int AttNr)
    {
        Random rand = new Random();
        int dmg_primit = rand.nextInt(AttNr);
        currenthealth = (currenthealth - dmg_primit) + this.currentarmor;
        System.out.println("Ai fost atacat pentru "+dmg_primit+" puncte");
        if(currenthealth<=0)
            System.out.println("Ai fost eliminat");
    }
    public void EquipCommonSword(common_sword sword){
        attack=attackinit;
        attack+=sword.attack;
        inventory.add(sword.name);
    }
    public void Bataie(villain villain1){
        System.out.println("Scrieti atac pentru a ataca si exit pentru a iesi: ");
        Scanner s = new Scanner(System.in);
        String comanda=s.nextLine();
        while(comanda.compareTo("exit")!=0) {
            if (comanda.compareTo("atac") == 0) {
                this.Attack(villain1);
                if (villain1.currenthealth > 0)
                    villain1.Attack(this);
                else break;
            }s = new Scanner(System.in);
            comanda = s.nextLine();

        }
    }
    void citire_cmd()
    {   Scanner s = new Scanner(System.in);
        String comanda=s.nextLine();

        while(comanda.compareTo("exit")!=0){
        if(comanda.compareTo("Stats")==0){
            this.stats();
        }
        }
}
    void openChest()
    {
        System.out.println("In fata ta este un chest. Scrie open pentru a-l deschide");
        Scanner s = new Scanner(System.in);
        String comanda=s.nextLine();
        common_sword swd = new common_sword();
        if(comanda.compareTo("open")==0)
        {
            System.out.println("Sabia ta are "+(attack-attackinit)+" puncte de dmg, cea din chest are "+ swd.attack);
            System.out.println("Scrie 1 pentru a o pastra pe prima si 2 pentru a o schimba");
            comanda=s.nextLine();
            if(comanda.compareTo("1")==0)
            {
                System.out.println("Ai inchis chestul. ");
            }
            else if(comanda.compareTo("2")==0)
            {

                System.out.println("Ai luat sabia si ai inchis chestul");
                swd.numire();
                this.EquipCommonSword(swd);
                this.stats();
            }
        }

    }
}

