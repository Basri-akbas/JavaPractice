package java_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F0029_library {

    static int count=1000;
    static List<String> kitapAdi=new ArrayList<>();
    static List <String> yazarAdi=new ArrayList<>();
    static List <Double> fiyati=new ArrayList<>();
    static List <Integer> kitapNo=new ArrayList<>();

    public static void main(String[] args) {

	        /*  ====================PAZAR PROJEMIZ==============================
	         * bir kitapci icin program yazalim
	         * kitap no 1000'den baslayacak sirali no olsun
	         * program baslayinca menu isminde bir method calissin
	         * 1-kitap ekle
	         * 2-numara ile kitap goruntule
	         * 3-bilgi ile kitap goruntule
	         * 4-numara ile kitap sil
	         * 5-tum kitaplar listele
	         * 6-cikis
	         ************************************
	         * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
	           yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir list'te tutmamiz gerek
	           2-kitap numarasi 1000'den baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
	            count=1000;
	           menu isminde bir method olusturmaliyim,
	           3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
	           4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
	         */


        System.out.println(        "        ********************SANAL K�TABEV�NE HO�GELD�N�Z********************       "   );

        System.out.println("                 **********��LEMLER�N�Z ARTIK �OK KOLAY!************             ");

        System.out.println("    //// MEN� ////                         ");


        menu();

    }
    @SuppressWarnings("resource")
    private static void menu() {

        Scanner scan=new Scanner(System.in);
        int secim=0;

        System.out.println("\nL�tfen yapmak istediginiz i�lemi se�iniz. Ard�ndan enter tu�una bas�n�z.\n");

        System.out.println( "1-)K�TAP EKLE\n2-)NUMARA �LE K�TAP G�R�NT�LE\n3-)K�TAP B�LG�S� �LE K�TAP G�R�NT�LE\n4-)NUMARA �LE K�TAP S�L\n5-)T�M K�TAPLARI L�STELE\n6-)�IKI�");

        secim=scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("\nKitap Ekleme Sekmesine Ho�geldiniz.L�tfen Y�nergeleri izleyiniz.");
                kitapekle();

                break;
            case 2:

                numarakitapgoruntule();

                break;

            case 3:

                bilgikitapgoruntule();

                break;

            case 4:

                kitapsil();

                break;

            case 5:

                kitaplarilistele();

                break;

            case 6:
                System.out.println("\n\t\t\t********************�IKI� ��LEM�N�Z BA�ARI �LE GER�EKLE�T�R�LM��T�R. TE�EKK�R EDER, �Y� G�NLER D�LER�Z********************");

                break;

            default:

                do {
                    System.out.println("YANLI� B�R G�R�� YAPTINIZ.L�TFEN TEKRAR DENEY�N�Z.\n1-)K�TAP EKLE\n2-)NUMARA �LE K�TAP G�R�NT�LE\n3-)K�TAP B�LG�S� �LE K�TAP G�R�NT�LE\n4-)NUMARA �LE K�TAP S�L\n5-)T�M K�TAPLARI L�STELE\n6-)�IKI�");
                    secim=scan.nextInt();
                } while (secim<1 || secim>6);

        }

        scan.close();
    }
    private static void kitapekle() {


        int karar=0;
        String kitap="";
        String yazar="";
        double ucret=0;
        int toplamEklenen=0;


        do {

            @SuppressWarnings("resource")
            Scanner scan=new Scanner(System.in);

            System.out.println("L�tfen eklemek istediginiz kitab�n ad�n� giriniz : ");
            kitap=scan.nextLine().toUpperCase();

            System.out.println("L�tfen kitab�n yazar�n� giriniz : ");
            yazar=scan.nextLine().toUpperCase();

            System.out.println("L�tfen kitab�n fiyat�n� giriniz : ");
	            ucret=scan.nextDouble();


            kitapAdi.add(kitap);
            yazarAdi.add(yazar);
            fiyati.add(ucret);
            kitapNo.add(count);

            System.out.println("\nEklenen Kitap Bilgileri : "+"\n\nKitap No:"+kitapNo.get(toplamEklenen)  +"    "+"\nKitap Ad�:"+kitap+"    "+"\nKitap Yazar�:"+yazar+"    "+"\nKitap �cret:"+ucret+"$\n");

            count++;

            System.out.println("\nKitap eklemeye devam etmek i�in 1\n��lemi sonland�rmak i�in 2'yi tu�lay�n�z.\n");
            karar=scan.nextInt();

            toplamEklenen++;


        } while (karar==1);




        System.out.println("Kitap ekleme i�lemi ba�ar� ile ger�ekle�tirildi.Te�ekk�rler.\n");

        menu();
    }
    @SuppressWarnings("resource")
    private static void kitaplarilistele() {

        System.out.println("**********K�TAP L�STES�**************\n");
        Scanner scan=new Scanner(System.in);

        if (kitapNo.size()>0) {

            System.out.println(" K�TAP NO        K�TAP ADI        K�TABIN YAZARI        K�TABIN F�YATI " );
            for (int i = 0; i < kitapNo.size(); i++) {

                //System.out.println(" K�TAP NO        K�TAP ADI        K�TABIN YAZARI        K�TABIN F�YATI " );
                System.out.println(kitapNo.get(i) + "        "  +  kitapAdi.get(i) + "        " + yazarAdi.get(i) + "         " + fiyati.get(i) );

            }

            System.out.println("\nMen�ye d�nmek i�in 1\n��k�� yapmak i�in 2 tu�lay�n.");
            int karar=scan.nextInt();

            switch (karar) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.out.println("\n********************�IKI� ��LEM�N�Z BA�ARI �LE GER�EKLE�T�R�LM��T�R. TE�EKK�R EDER, �Y� G�NLER D�LER�Z********************");
                    break;
                default:

                    do {
                        System.out.println("\nYANLI� B�R G�R�� YAPTINIZ.L�TFEN TEKRAR DENEY�N�Z.\nMen�ye d�nmek i�in 1\\n��k�� yapmak i�in 2 tu�lay�n.\n");
                        karar=scan.nextInt();
                    } while (karar<1 || karar>2);

                    break;
            }

        }


        if (kitapNo.size()<=0) {
            System.out.println("\nHen�z eklenmi� bir kitap bulunmamaktad�r. \n\n\n");

            System.out.println("\nMen�ye d�nmek i�in 1\n��k�� yapmak i�in 2 tu�lay�n.\n");
            int karar2=scan.nextInt();

            switch (karar2) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.out.println("\n********************�IKI� ��LEM�N�Z BA�ARI �LE GER�EKLE�T�R�LM��T�R. TE�EKK�R EDER, �Y� G�NLER D�LER�Z********************");
                    break;
                default:

                    do {
                        System.out.println("\nYANLI� B�R G�R�� YAPTINIZ.L�TFEN TEKRAR DENEY�N�Z.\nMen�ye d�nmek i�in 1\\n��k�� yapmak i�in 2 tu�lay�n.\n");
                        karar2=scan.nextInt();
                    } while (karar2<1 || karar2>2);

                    break;
            }

        }


        scan.close();


    }
    private static void kitapsil() {

        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);
        int no=0;
        int karar=0;
        int toplamSilinen=0;
        int index=0;

        if (kitapNo.size()<=0) {
            System.out.println("\nHen�z eklenmi� bir kitap bulunmamaktad�r. \n\n\n");

            System.out.println("\nMen�ye d�nmek i�in 1\n��k�� yapmak i�in 2 tu�lay�n.\n");
            int karar3=scan.nextInt();

            switch (karar3) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.out.println("\n********************�IKI� ��LEM�N�Z BA�ARI �LE GER�EKLE�T�R�LM��T�R. TE�EKK�R EDER, �Y� G�NLER D�LER�Z********************");
                    break;
                default:

                    do {
                        System.out.println("\nYANLI� B�R G�R�� YAPTINIZ.L�TFEN TEKRAR DENEY�N�Z.\nMen�ye d�nmek i�in 1\\n��k�� yapmak i�in 2 tu�lay�n.\n");
                        karar3=scan.nextInt();
                    } while (karar3<1 || karar3>2);

                    break;
            }

        }


        if (kitapNo.size()>0) {

            do {



                System.out.println("L�tfen silmek istediginiz kitab�n nosunu giriniz : ");
                no=scan.nextInt();

                index=kitapNo.indexOf(no);

                // System.out.println(index);

                System.out.println("\nSilinen Kitap Bilgileri : "+"\n\nKitap No:"+kitapNo.get(index)  +"    "+"\nKitap Ad�:"+kitapAdi.get(kitapNo.get(index))
                        +"    "+"\nKitap Yazar�:"+yazarAdi.get(kitapNo.get(index))+"    "+"\nKitap �cret:"+fiyati.get(kitapNo.get(index))+"\n");


                kitapNo.remove(index);
                yazarAdi.remove(index);
                kitapAdi.remove(index);
                fiyati.remove(index);
                System.out.println("\nKitap silmeye devam etmek i�in 1\n��lemi sonland�rmak i�in 2'yi tu�lay�n�z.\n");
                karar=scan.nextInt();

                toplamSilinen++;


            } while (karar==1);




            System.out.println("\nKitap silme i�lemi ba�ar� ile ger�ekle�tirildi. Te�ekk�rler. ");

            menu();
        }
        scan.close();

    }
    private static void bilgikitapgoruntule() {

        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);

        String kitapismi="";
        String yazarismi="";

        int karar5=0;
        int toplamGoruntelenen=0;
        int index5=0;


        if (kitapNo.size()<=0) {
            System.out.println("\nHen�z eklenmi� bir kitap bulunmamaktad�r. \n\n\n");

            System.out.println("\nMen�ye d�nmek i�in 1\n��k�� yapmak i�in 2 tu�lay�n.");
            int karar4=scan.nextInt();

            switch (karar4) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.out.println("\n********************�IKI� ��LEM�N�Z BA�ARI �LE GER�EKLE�T�R�LM��T�R. TE�EKK�R EDER, �Y� G�NLER D�LER�Z********************");
                    break;
                default:

                    do {
                        System.out.println("\nYANLI� B�R G�R�� YAPTINIZ.L�TFEN TEKRAR DENEY�N�Z.\nMen�ye d�nmek i�in 1\\n��k�� yapmak i�in 2 tu�lay�n.\n");
                        karar4=scan.nextInt();
                    } while (karar4<1 || karar4>2);

                    break;
            }

        }


        if (kitapNo.size()>0) {



            do {


                System.out.println("L�tfen g�r�nt�lemek istediginiz kitab�n ad�n� giriniz : ");

                kitapismi=scan.nextLine().toUpperCase();

                index5=kitapAdi.indexOf(kitapismi);


                System.out.println(index5);

                System.out.println("\nG�r�nt�lenen Kitap Bilgileri: "+"\n\nKitap No: "+kitapNo.get(index5)  +"    "+"\nKitap Ad�: "+kitapAdi.get(index5)
                        +"    "+"\nKitap Yazar�: "+yazarAdi.get(index5)+"    "+"\nKitap �cret: "+fiyati.get(index5)+"\n");


                System.out.println("\nBa�ka kitap g�r�nt�lemek i�in 1\n��lemi sonland�r�p men�ye d�nmek i�in 2'yi tu�lay�n�z. ");
                karar5=scan.nextInt();

                toplamGoruntelenen++;


            } while (karar5==1);




            System.out.println("\nKitap g�r�nt�leme i�lemi ba�ar� ile ger�ekle�tirildi. Men�ye y�nlendiriliyorsunuz.\n ");

            menu();




        }scan.close();
    }
    private static void numarakitapgoruntule() {

        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);

        int index2=0;
        int no2=0;
        int karar7=0;
        int toplamGoruntulenen=0;


        if (kitapNo.size()<=0) {
            System.out.println("Hen�z eklenmi� bir kitap bulunmamaktad�r. \n\n\n");

            System.out.println("\nMen�ye d�nmek i�in 1\n��k�� yapmak i�in 2 tu�lay�n.");
            int karar6=scan.nextInt();

            switch (karar6) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.out.println("\n********************�IKI� ��LEM�N�Z BA�ARI �LE GER�EKLE�T�R�LM��T�R. TE�EKK�R EDER, �Y� G�NLER D�LER�Z********************");
                    break;
                default:

                    do {
                        System.out.println("\nYANLI� B�R G�R�� YAPTINIZ.L�TFEN TEKRAR DENEY�N�Z.\nMen�ye d�nmek i�in 1\\n��k�� yapmak i�in 2 tu�lay�n.\n");
                        karar6=scan.nextInt();
                    } while (karar6<1 || karar6>2);

                    break;
            }

        }



        if (kitapNo.size()>0) {



            do {



                System.out.println("L�tfen g�r�nt�lemek istediginiz kitab�n nosunu giriniz : ");
                no2=scan.nextInt();

                index2=kitapNo.indexOf(no2);

                // System.out.println(index2);

                System.out.println("\nG�r�nt�lenen Kitap Bilgileri: "+"\n\nKitap No: "+kitapNo.get(index2)  +"    "+"\nKitap Ad�: "+kitapAdi.get(index2)
                        +"    "+"\nKitap Yazar�: "+yazarAdi.get(index2)+"    "+"\nKitap �cret: "+fiyati.get(index2)+"\n");


                System.out.println("\nBa�ka kitap g�r�nt�lemek i�in 1\n��lemi sonland�r�p men�ye d�nmek i�in 2'yi tu�lay�n�z. ");
                karar7=scan.nextInt();

                toplamGoruntulenen++;


            } while (karar7==1);




            System.out.println("\nKitap g�r�nt�leme i�lemi ba�ar� ile ger�ekle�tirildi. Te�ekk�rler.\n ");

            menu();



        }
        scan.close();
    }

}
