package src.com.company;

import java.util.Scanner;

public class Player {
    private String name;
    private int maxhealth;
    private int currenthealth;
    private int armor;
    private int currentarmor;
    private int attack;
    private int currentattack;
    public void stats(){
        System.out.println("HP: "+currenthealth+"/"+maxhealth);
        System.out.println("Armura: "+currentarmor+"/"+armor);
        System.out.println("Atac: "+currentattack+"/"+attack);
    }
    public void start(){
        maxhealth=30;
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
}
