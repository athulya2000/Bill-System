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
        int price1=this.tea*n;
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
        ArrayList<Bill> menuList=new ArrayList<Bill>();
        Bill obj=new Bill();
        System.out.println("MENU \n 1.TEA-10 \n 2.COFFEE-15 \n 3.SNACKS-10 \n 4.IDLI-8 \n 5.DOSHA \n 6.Generate Bill \n 7.View All Transaction \n 8.Exit");
        System.out.println("choose your option");
        Scanner s=new Scanner(System.in);
        int mn=s.nextInt();
    }
}
