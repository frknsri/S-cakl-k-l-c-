import java.security.SignedObject;
import java.security.interfaces.DSAKey;
import java.util.Scanner ;

public class hotbar {
    public static void main(String [] args) {
        int a;

        Scanner inp =new Scanner(System.in);

        System.out.println("--------MERHABA HOŞGELDİNİZ-------");
        System.out.println("-------------*******--------------");

        System.out.print("Bugün hava Kaç Derece  ? : ");
        a = inp.nextInt();

        if (a<5){
            System.out.println("Waaww Bugün Kayak İçin İyi Bir Gün !");
            System.out.println("*********--------------********");

        }else if (a>=5 && a<15){
            System.out.println("Bugün Kesinlikle Sinema Günü !");
            System.out.println("******------------------******");

        }if (a>=15 && a<25){
            System.out.println(" Bugün Sinema İçin Mükemmel Bir Gün !");
            System.out.println("*********-------------********");

        }else if (a>25){
            System.out.println("Hava Mükemmel Yüzmeyi Hiç Düşündünmü ?");

        }
        System.out.println(" BİZİ                             ");
        System.out.println("     TERCİH                       ");
        System.out.println("           ETTİĞİNİZ              ");
        System.out.println("                    İÇİN          ");
        System.out.println("                       TEŞEKKÜRLER");















    }
}
