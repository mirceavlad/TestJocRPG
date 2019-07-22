package src.com.company;
import src.com.company.Player;
import src.com.company.villain;
import java.awt.event.KeyEvent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player player= new Player();
        player.start();
        villain villain1 = new villain();
        villain1.init(30,0,5);
        //player.Bataie(villain1);
       //System.out.println("Comenzile dumneavoastra sunt: Stats, exit ");
       //player.citire_cmd();
        //player.openChest();
    }}

