package src.com.company;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private static String name;
    public int maxhealth;
    private int currenthealth;
    private int armor;
    private int currentarmor;
    private int attackinit;
    private int attack;
    private int currentattack;

    public void stats(){
        System.out.println("HP: "+currenthealth+"/"+maxhealth);
        System.out.println("Armura: "+currentarmor+"/"+armor);
        System.out.println("Atac: "+currentattack+"/"+attack);
    }
    public void start(){
        maxhealth=50;
        currenthealth=maxhealth;
        armor=0;
        currentarmor=armor;
        attack=10;
        currentattack=attack;
        System.out.println("Introduceti numele jucatorului: ");
        Scanner s= new Scanner(System.in);
        name=s.nextLine();
        System.out.println("Numele este: "+name);
        this.stats();

    }
    public void Attack(villain x){
        x.attacked(currentattack);
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
    public void EquipSword(common_sword sword){
        attack=attackinit;
        attackinit+=sword.attack;
        currentattack=attack;
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
            }
            s = new Scanner(System.in);
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
        comanda=s.nextLine();
        }
}}

