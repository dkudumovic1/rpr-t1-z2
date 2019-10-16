package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int  sumaCifara(int x){
        int suma=0;
        do {
            int cifra=x%10;
            x=x/10;
            suma=suma+cifra;
        }while(x>0);
        return suma;
    }

    public static void main(String[] args) {
	 int n;
	 Scanner ulaz=new Scanner (System.in);
	 n=ulaz.nextInt();
	 int i=0;
	 for(i=0;i<n;i++) {
	     if(i%sumaCifara(n)==0) System.out.println(i);
     }
    }
}
