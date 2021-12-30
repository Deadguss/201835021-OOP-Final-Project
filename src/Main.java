import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        inheritance inh = new inheritance();
        Hata hata = new Hata();

        System.out.print("\n Adınızı giriniz: ");
        inh.adsoyad = s.nextLine();
        System.out.print("\n Gitmek istediğiniz yer: ");
        inh.konum = s.nextLine();
        System.out.print("\n Bulunmak istediğiniz sınıf (1=Business , 2=Economy): ");
        inh.ktip = s.nextInt();
        System.out.print("\n Koltuk no seçiniz: ");
        inh.koltuk = s.nextInt();
        System.out.print("\n Yaşınızı Giriniz: ");
        inh.yas = s.nextInt();
        System.out.print("\n Yolculuk Tipini Seçiniz (1=Tek Gidiş, 2=Gidiş/Dönüş) : ");
        inh.sefer = s.nextInt();

        double istanbulFiyat = 4850, amerikaFiyat = 6750, ingiltereFiyat = 8960, yasIndirimi, ktipIndirimi, sIndirimi;


        if (inh.konum.equalsIgnoreCase("İstanbul") && inh.yas > 0 && (inh.sefer == 1 || inh.sefer == 2)) {
            if (inh.yas < 12) {
                yasIndirimi = istanbulFiyat * 0.5;
                istanbulFiyat = istanbulFiyat - yasIndirimi;
            } else if (inh.yas >= 12 && inh.yas <= 24) {
                yasIndirimi = istanbulFiyat * 0.1;
                istanbulFiyat = istanbulFiyat - yasIndirimi;

            } else if (inh.yas >= 65) {
                yasIndirimi = istanbulFiyat * 0.3;
                istanbulFiyat = istanbulFiyat - yasIndirimi;
            }
            if (inh.sefer == 2) {
                sIndirimi = istanbulFiyat * 0.2;
                istanbulFiyat = (istanbulFiyat - sIndirimi) * 2;
            }
            if (inh.ktip == 1) {
                ktipIndirimi = istanbulFiyat * 0.7;
                istanbulFiyat = (istanbulFiyat + ktipIndirimi) * 0.6;
            }

            System.out.print("Sayın " + inh.adsoyad + " Koltuk numaranız " + inh.koltuk + " \n Bilet Tutarınız : " + istanbulFiyat);
        }
        //else{
          //hata.dgr();
        //}

        if (inh.konum.equalsIgnoreCase("Amerika") && inh.yas > 0 && (inh.sefer == 1 || inh.sefer == 2)&& (inh.ktip ==1 || inh.ktip==2)) {
            if (inh.yas < 12) {
                yasIndirimi = amerikaFiyat * 0.4;
                amerikaFiyat = amerikaFiyat - yasIndirimi;

            } else if (inh.yas >= 12 && inh.yas <= 24) {
                yasIndirimi = amerikaFiyat * 0.1;
                amerikaFiyat = amerikaFiyat - yasIndirimi;

            } else if (inh.yas >= 65) {
                yasIndirimi = amerikaFiyat * 0.3;
                amerikaFiyat = amerikaFiyat - yasIndirimi;
            }
            if (inh.sefer == 2) {
                sIndirimi = amerikaFiyat * 0.7;
                amerikaFiyat = (amerikaFiyat - sIndirimi) * 0.8;
            }
            if (inh.ktip == 1) {
                ktipIndirimi = amerikaFiyat * 0.7;
                amerikaFiyat = (amerikaFiyat + ktipIndirimi) * 0.7;
            }
            System.out.print("Sayın " + inh.adsoyad + " Koltuk numaranız " + inh.koltuk + " \nBilet Tutarınız : " + amerikaFiyat);
        }

        if (inh.konum.equalsIgnoreCase("İngiltere") && inh.yas > 0 && (inh.sefer == 1 || inh.sefer == 2)) {
            if (inh.yas < 12) {
                yasIndirimi = ingiltereFiyat * 0.5;
                ingiltereFiyat = ingiltereFiyat - yasIndirimi;

            } else if (inh.yas >= 12 && inh.yas <= 24) {
                yasIndirimi = ingiltereFiyat * 0.3;
                ingiltereFiyat = ingiltereFiyat - yasIndirimi;

            } else if (inh.yas >= 65) {
                yasIndirimi = ingiltereFiyat * 0.6;
                ingiltereFiyat = ingiltereFiyat - yasIndirimi;
            }
            if (inh.sefer == 2) {
                sIndirimi = ingiltereFiyat * 0.7;
                ingiltereFiyat = (ingiltereFiyat - sIndirimi) * 2;
            }
            if (inh.ktip == 1) {
                ktipIndirimi = ingiltereFiyat * 0.7;
                ingiltereFiyat = (ingiltereFiyat + ktipIndirimi) * 0.6;
            }
            System.out.print("Sayın " + inh.adsoyad + " Koltuk numaranız " + inh.koltuk + " \nBilet Tutarınız : " + ingiltereFiyat);
        }
        }
    }





