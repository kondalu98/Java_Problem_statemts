import java.util.ArrayList;

import java.util.List;
public class SimpleVariance {
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

        for(int i=0;i<Sales_2022.size();i++)
        {
            SalesData Year_22=Sales_2022.get(i);
            SalesData Year_23=Sales_2023.get(i);
            int Difference=Year_22.Amount()-Year_23.Amount();
            double Variance =((double)Difference/Year_22.Amount()*100);
            Sales_Variance.add(new SalesData(Year_22.ItemName(), Variance));

        }
     System.out.println(Sales_Variance);




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
