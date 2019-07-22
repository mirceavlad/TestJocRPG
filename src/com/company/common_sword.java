package src.com.company;

import java.util.Random;

public class common_sword {
    Chest ch = new Chest();
    private Random rand = new Random();
    public String name;
    public int attack=rand.nextInt(5)+1+ch.verif();
    public void numire() {
        if (ch.verif() == 1)  name = "Common Sword";
        else if (ch.verif() == 5) name = "Rare Sword";
        else if (ch.verif() == 10) name = "Epic Sword";
        System.out.println(this.name);

    }
}
