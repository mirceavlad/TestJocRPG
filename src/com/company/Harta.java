package src.com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Harta {
    public String[][] a = new String[10][10];
    public int i1 = 9;
    public int j1 = 5;

    public void Mapare() {
        Random rand = new Random();
        for (int i = 0; i <= 9; i++)
            for (int j = 0; j <= 9; j++) {
                a[i][j] = "-";
            }
        a[5][8] = "c";
        a[4][3] = "v";
        a[2][7] = "v";
        a[9][5] = "p";
    }

    public void Afisare() {
        for (int i = 0; i <= 9; i++)
            System.out.println(Arrays.toString(a[i]));
    }
    public int verif(){
        for(int i=0;i<=9;i++)
            for(int j=0;j<=9;j++)
            {
                if(a[i][j]!="-" && a[i][j]!="p")
                    return 1;
            }
        return 0;
    }
    public void Navigare(){
        this.Mapare();
        this.Afisare();
        Player p = new Player();
        p.start();
        System.out.println("Mergi pe harta ");
        Scanner s = new Scanner(System.in);
        String comanda = s.nextLine();
        while(comanda.compareTo("exit")!=0 && this.verif()!=0)
        { if (comanda.compareTo("sus") == 0 && i1>=1) {
            i1=i1-1;
            if(a[i1][j1]=="c")
                p.openChest();
            if(a[i1][j1]=="v")
            {
                villain v1 = new villain();
                v1.init(30,0,5);
                p.Bataie(v1);
            }
            a[i1][j1] = "p";
            a[i1+1][j1] = "-";
            this.Afisare();
        }
        if (comanda.compareTo("jos") == 0 && i1<=8) {
            i1=i1+1;
            if(a[i1][j1]=="c")
                p.openChest();
            if(a[i1][j1]=="v")
            {
                villain v1 = new villain();
                v1.init(30,0,5);
                p.Bataie(v1);
            }
            a[i1][j1] = "p";
            a[i1-1][j1] = "-";
            this.Afisare();
        }

        if (comanda.compareTo("stanga") == 0 && j1>=1) {
            j1=j1-1;
            if(a[i1][j1]=="c")
                p.openChest();
            if(a[i1][j1]=="v")
            {
                villain v1 = new villain();
                v1.init(30,0,5);
                p.Bataie(v1);
            }
            a[i1][j1] = "p";
            a[i1][j1+1] = "-";
            this.Afisare();
        }
        if (comanda.compareTo("dreapta") == 0 && j1<=8) {
            j1=j1+1;
            if(a[i1][j1]=="c")
                p.openChest();
            if(a[i1][j1]=="v")
            {
                villain v1 = new villain();
                v1.init(30,0,5);
                p.Bataie(v1);
            }
            a[i1][j1] = "p";
            a[i1][j1-1] = "-";
            this.Afisare();
        }s = new Scanner(System.in);
            comanda = s.nextLine();
        if(this.verif()==0)
            System.out.println("AI CASTIGAT BRAVO");
        }
    }
}
