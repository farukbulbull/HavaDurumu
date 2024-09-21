import java.util.Scanner;

public class Sıcaklık {
    public static void main(String[] args) {
        int ısı;
        
        Scanner inp=new Scanner(System.in);
        //KULLANICIDAN HAVA DERECESİNİ ALDIK
        
        System.out.print("SICAKLIĞI GİRİNİZ:");
        ısı= inp.nextInt();
        
        //KULLANICIYA ÖNERMELERDE BULUNDUK
        
        if (ısı<5){
            System.out.print("KAYAK YAPABİLRSİNİZ");
            
        } else if (ısı>=5&&ısı<15) {
            System.out.print("SİNEMAYA GİDEBİLİRSİN");
            
            
        } else if (ısı>=15&&ısı<25) {
            System.out.print("PİKNİK YAPMAYA GİDEBİLİRSİN");
            
        } else if (ısı>=25) {
            System.out.print("YÜZMEYE GİDEBİLİRSİN");

        }


    }
}
