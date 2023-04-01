import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Remove_object {
    
    public static void main(String[] args) {
        List<SalesData> Sales_2022=new ArrayList<>();
       
        //sales_2022 items
        Sales_2022.add(new SalesData("Tea",100));
        Sales_2022.add(new SalesData("Cofee",250));
        Sales_2022.add(new SalesData("Green Tea",50));
        Sales_2022.add(new SalesData("Lemon Tea",180));
        Sales_2022.add(new SalesData("Orange Tea",220));

        System.out.println(Sales_2022.size());
        System.out.println(Sales_2022);
        
        Iterator it=Sales_2022.iterator();
        while(it.hasNext())

        {
           SalesData sd=(SalesData) it.next();
           if(sd.ItemName().equals("Tea"))
           {
            it.remove();
           }
      
            
        }
        System.out.println(Sales_2022.size());
        System.out.println(Sales_2022);
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
