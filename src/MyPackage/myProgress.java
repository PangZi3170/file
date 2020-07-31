package MyPackage;

import java.util.Scanner;
public class myProgress {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int quantity = scanner.nextInt();
        Comp computer1=new Comp(1000);
        System.out.printf("the total price to pay is %f when buying %d computers",
                computer1.total_price(quantity),quantity);
        for(int a =0;a<5;a++){
            Integer[] ss ={0,0,0,0,0};

        }
    }
}

