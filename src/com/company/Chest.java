package src.com.company;

import java.util.Random;

public class Chest {
    Random rand = new Random();
    public int sansa = rand.nextInt(100)+1;
    public int verif()
    {
        if(sansa==100){

            return 10;

        }
        else if(sansa%10==0)
        {
            return 5;

        }
        else {
        return 1;}
    }
}
