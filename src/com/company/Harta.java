package src.com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Harta {
    public String[][] a= new String[10][10];
    public void Mapare()
    {
        for(int i=0;i<=9;i++)
            for(int j=0;j<=9;j++) {
                a[i][j]="-";
            }
            a[5][8]="c";
            a[4][3]="v";
            a[2][7]="v";
            a[9][5]="p";
    }
    public void Afisare()
    {
        for(int i=0;i<=9;i++)
        System.out.println(Arrays.toString(a[i]));
        System.out.println("In fata ta este un chest. Scrie open pentru a-l deschide");
        Scanner s = new Scanner(System.in);
        String comanda=s.nextLine();
        if(comanda.compareTo("sus")==0){
            ///////////////////////////////////////
        }

    }
}
