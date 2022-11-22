import java.util.ArrayList;
import java.util.Scanner;

class Bill{
    int tea=12;
    int coffee=15;
    int snacks=10;
    int idli=8;
    int dosha=6;
    Bill(){
        this.tea=tea;
        this.coffee=coffee;
        this.snacks=snacks;
        this.idli=idli;
        this.dosha=dosha;
    }
   int tea(int n1){
        int price1=this.tea*n1;
        return price1;
    }
    int coffee(int n2){
        int price2=this.coffee*n2;
        return price2;
    }
    int snacks(int n3){
        int price3=this.tea*n3;
        return price3;
    }
    int idli(int n4){
        int price4=this.idli*n4;
        return price4;
    }
    int dosha(int n5){
        int price5=this.dosha*n5;
        return price5;
    }

}
public class Menu {
    public static void main(String[] args) {
        ArrayList<String> menuList=new ArrayList<String>();
        Bill obj=new Bill();
        System.out.println("Enter your name: ");
        Scanner s=new Scanner(System.in);
        String name=s.next();
        menuList.add(name);
        System.out.println("Enter your phone number: ");
        String phNo=s.next();
        menuList.add(phNo);
        while(true){
            System.out.println("MENU \n 1.TEA-10 \n 2.COFFEE-15 \n 3.SNACKS-10 \n 4.IDLI-8 \n 5.DOSHA \n 6.Generate Bill \n 7.View All Transaction \n 8.Exit");
            System.out.println("choose your option");
            int mn=s.nextInt();
            switch (mn){
                case 1:
                    System.out.println("Enter the number tea you want");
                    int n1=s.nextInt();
                    int b=obj.tea(n1);
                    menuList.add(String.valueOf(b));
                    break;
                case 2:
                    System.out.println("Enter the number coffee you want");
                    int n2=s.nextInt();
                    int b1=obj.tea(n2);
                    menuList.add(String.valueOf(b1));
                    break;
                case 3:
                    System.out.println("Enter the number snacks you want");
                    int n3=s.nextInt();
                    int b2=obj.tea(n3);
                    menuList.add(String.valueOf(b2));
                    break;
                case 4:
                    System.out.println("Enter the number idli you want");
                    int n4=s.nextInt();
                    int b3=obj.tea(n4);
                    menuList.add(String.valueOf(b3));
                    break;




            }
        }

    }
}
