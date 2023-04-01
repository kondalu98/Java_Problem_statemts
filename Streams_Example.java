import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

public class Streams_Example {
    public static void main(String[] args) {
        List<SalesData> Sales_2022=new ArrayList<>();
        List<SalesData> Sales_2023=new ArrayList<>();
        List<SalesData> Sales_Variance =new ArrayList<>();
        //sales_2022 items
        Sales_2022.add(new SalesData("Tea",100));
        Sales_2022.add(new SalesData("Cofee",250));
        Sales_2022.add(new SalesData("Green Tea",50));
        Sales_2022.add(new SalesData("Lemon Tea",180));
        Sales_2022.add(new SalesData("Orange Tea",220));
        //sales_2023 items
        Sales_2023.add(new SalesData("Tea",220));
        Sales_2023.add(new SalesData("Cofee",230));
        Sales_2023.add(new SalesData("Green Tea",60));
        Sales_2023.add(new SalesData("Lemon Tea",210));
        Sales_2023.add(new SalesData("Orange Tea",205));


        int Total_Sale_22=Sales_2022.stream().mapToInt(n->n.Amount()).sum();
        int Total_Sale_23=Sales_2023.stream().mapToInt(n->n.Amount()).sum();

        System.out.println("Total_Sale_22  "+ Total_Sale_22);
        System.out.println("Total_Sale_22  "+ Total_Sale_23);

        int Total_tea_22=Sales_2022.stream().filter(item->item.ItemName().contains("Tea")).mapToInt(n->n.Amount()).sum();
        int Total_tea_23=Sales_2023.stream().filter(item->item.ItemName().contains("Tea")).mapToInt(n->n.Amount()).sum();
        System.out.println("Total_tea_22  "+ Total_tea_22);
        System.out.println("Total_tea_23  "+ Total_tea_23);
        




    }
}
class SalesData
{
    private String ItemName;
    private int Amount;
    private double var;
    SalesData(String ItemName,int Amount)
    {
        this.ItemName=ItemName;
        this.Amount=Amount;
    }



    int Amount()
    {
        return  Amount;
    }
    String ItemName()
    {
        return  ItemName;
    }
    SalesData(String ItemName,double Variance)
    {
        this.ItemName=ItemName;
        this.var=Variance;
    }
    public String toString()
    {
        return "{"+this.ItemName+":"+this.var+"}";
    }

}
