package src.com.company;
import src.com.company.Player;
import src.com.company.villain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player= new Player();
        player.start();
        villain villain1 = new villain();
        villain1.init(30,0,0);
        System.out.println("Scrieti atac pentru a ataca si exit pentru a iesi: ");
        Scanner s = new Scanner(System.in);
        String comanda=s.nextLine();
        while(comanda.compareTo("exit")!=0)
        {if(comanda.compareTo("atac")==0)
        player.Attack(villain1);
        s = new Scanner(System.in);
        comanda=s.nextLine();}

    }
}
