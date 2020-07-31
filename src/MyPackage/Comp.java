package MyPackage;

public class Comp{
    private double comp_price;
    public Comp(double price){
        comp_price=price;
    }
    public double getPrice(){
        return comp_price;
    }
    public double total_price(int quantity){//input / return type/method access quanxian
        if(quantity>50)
            return 0.8*comp_price*quantity;
        else
            return comp_price*quantity;
    }

}
