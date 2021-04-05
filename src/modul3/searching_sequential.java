//Annilanurulhuzna
package modul3;

import java.util.Scanner;

public class searching_sequential {
    
    public static void main(String[]args){
        int A;
        int pencarian[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int ketemu = 0;
        
        System.out.println("isi data pencarian adalah: ");
            for (int i = 0; i < pencarian.length; i++) {
                System.out.print(pencarian[i] + " ");
            }
            
        System.out.println();
       
        Scanner cari = new Scanner(System.in);
        A = cari.nextInt();
        for (int i = 0; i < pencarian.length; i++){
            if (pencarian[i]== A){
                ketemu =1;
                System.out.println("data ke "+A+" beranda di indeks ke "+i);
            }
                
        }
        if (ketemu == 1){
            System.out.println("pencarian telah di temukan");
        }
        else{
            System.out.println("pencarian tidak di temukan");
        }
        
    }
    }

