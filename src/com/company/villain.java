package com.company;
import java.util.Random;

public class villain {
    private int maxhealth;
    private int currenthealth;
    private int armor;
    private int currentarmor;
    private int attack;
    private int currentattack;
    public void init(int health, int armors, int attacks)
    {
        maxhealth=health;
        currenthealth=health;
        this.armor=armors;
        currentarmor=armors;
        this.attack=attacks;
        currentattack=attacks;
    }
    public void attacked(int AttNr)
    {
        Random rand = new Random();
        int dmg_primit = rand.nextInt(AttNr)+1;
        currenthealth-=dmg_primit;
    }
}
