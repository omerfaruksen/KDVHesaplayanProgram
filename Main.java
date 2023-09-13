import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        double tutar, kdv;
        Scanner input=new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        tutar = input.nextDouble();

        if (tutar>1000) {
            kdv = (tutar * 8) / 100;
            System.out.println("Girilen Fiyat: " + tutar);
            System.out.println("KDV'li Fiyat: " + (tutar + kdv));
            System.out.print("KDV tutarı: " + kdv);
        }
        else{
            kdv=(tutar*18)/100;
            System.out.println("Girilen Fiyat: " +tutar);
            System.out.println("KDV'li Fiyat: "+(tutar+kdv));
            System.out.println("KDV Tutarı: "+kdv);
        }
    }

}
