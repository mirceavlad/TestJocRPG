package src.com.company;

import java.util.Arrays;

public class Harta {
    public int[][] a= new int[10][10];
    public void Mapare()
    {
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++) {
                a[i][j]=0;
            }
            a[5][8]=2;
            a[4][3]=1;
            a[2][7]=1;
    }
    public void Afisare()
    {
        for(int i=0;i<9;i++)
        System.out.println(Arrays.toString(a[i]));

    }
}
