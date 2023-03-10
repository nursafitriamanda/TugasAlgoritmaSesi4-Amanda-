import java.util.Scanner;

public class LatihanPerulangan {

    public static void main (String[] args) {
        /// 1 3 5 7 9 11
        System.out.println("NOMOR SATU");
        for (int a = 1; a <= 11; a +=2) {
            System.out.print(a + " ");
        }
        System.out.println ();
        System.out.println("========================");

        /// 20 15 10 5 0 
        System.out.println("NOMOR DUA");
        for (int a = 20; a >= 0; a -=5) {
            System.out.print(a + " ");
        }
        System.out.println ();
        System.out.println("========================");

        /// 0 1 1 2 3 5 8 13 
        System.out.println("NOMOR TIGA");
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < 8; i++) {
            int c = a + b ;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println ();
        System.out.println("========================");

        // 1 2 3 6 11 20 37
        System.out.println("NOMOR EMPAT ");

        int x = 1, y = 2, z = 3;

        System.out.print(x + " " + y + " " + z + " ");

        for (int i = 4;  i<= 7; i++) {
            int e = x + y + z;
            System.out.print(e + " ");
            x = y;
            y = z;
            z = e;
        }
        System.out.println ();
        System.out.println("========================");


        // 1 2 3 4
        // 2 3 4 5
        // 3 4 5 6
        System.out.println("NOMOR LIMA");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j < i + 4; j++){
                System.out.print(j + " ");
            }
            System.out.println ();   
        }
        System.out.println("========================");

        System.out.println("6)");
        for (int k = 3; k <= 5; k++){
            for (int l = 2; l <= 6; l++){
                if (k==3 && l<= 4){
                System.out.println(k + " x " + l + " = " + k*l);				
                }else if(k==4 && l>=3 && l<=5){
                	System.out.println(k + "x" + l + " = " + l*l);
                }else if(k==5 && l>=4&& l<=6){
                	System.out.println(k + "x" + l + " = " + l*l);
                }
                }
            }


             
                



    }
}