package java_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F0015_gemüseladen {
    static List<String> urunListesi =new ArrayList<>();
    static List<Double> urunFiyatlari =new ArrayList<>();
    static double toplanOdenecekTutar;
    static double toplamkilo;
    static  int islem;
    static double  miktar;

    public static void main(String[] args) {
        /*
         * Basit bir 5 �r�nl� manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        urunListesi.add("Orange");urunListesi.add("�pfel");urunListesi.add("Trauben");urunListesi.add("Tomato");urunListesi.add("Paprica");
        urunFiyatlari.add(2.99);urunFiyatlari.add(1.99);urunFiyatlari.add(1.59);urunFiyatlari.add(0.99);urunFiyatlari.add(1.99);
        Scanner scan=new Scanner (System.in);

        int secim=0;
        do {
            System.out.println("Lutfen almak istediginiz urunu seciniz cikmak icin cikisi seciniz"+"\n"+"1=Orange\t"+urunFiyatlari.get(0)+"\n"+"2=�pfel\t\t"+urunFiyatlari.get(1)+
                    "\n"+"3=Trauben\t"+urunFiyatlari.get(2)+"\n"+"4=Tomato\t"+urunFiyatlari.get(3)+"\n"+"5=Paprica\t"+urunFiyatlari.get(4)+"\n"+"6=EXIT"+"\n");
            secim=scan.nextInt();
            if(secim!=6) {
                System.out.println("Kac kilo almak istersiniz ");
                int kilo=scan.nextInt();

                toplanOdenecekTutar+=hesaplama(urunFiyatlari.get(secim-1),kilo);


                System.out.println("Devam etmek istiyormusunuz  E & H");
                String str=scan.next().toUpperCase();
                if(str.equalsIgnoreCase("E")) {
                    continue;
                }else {
                    secim=6;

                }
            }else {
                secim=6;
            }

        } while (secim!=6);

        System.out.println(islem+" islem yaptiniz "+toplamkilo+" kilo  aldiniz.");
        System.out.println("Toplam tutar= "+toplanOdenecekTutar+"�");

        do{
            System.out.println("Odeyeceginiz  miktari giriniz");
            double odemetutari=scan.nextDouble();
            miktar=odeme(odemetutari);
            if (miktar==0) {
                System.out.println("Tesekkurler odemeniz yapildi");
            }else  if(miktar>0) {
                System.out.println("Eksik odeme yaptiniz");
                System.out.println("Kalan miktar="+toplanOdenecekTutar);
            }else  if(miktar<0) {
                System.out.println("Para ustunuz="+-miktar);
                miktar=0;
            }
        }while(!(miktar==0));


        scan.close();

    }
    private static double odeme(double odemetutari) {
        toplanOdenecekTutar=toplanOdenecekTutar-odemetutari;
        double kalan=toplanOdenecekTutar;
        return kalan;
    }
    public static double hesaplama(double  secim,int kilo) {
        toplamkilo+=kilo;
        double toplam=secim*kilo;
        islem++;
        return toplam;
    }
}
