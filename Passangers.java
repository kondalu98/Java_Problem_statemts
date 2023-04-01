import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Passangers {
    public static void main(String[] args) {
        List<Passanger> Person_Detail=new ArrayList<>();
        Map<String,List<Integer>> m1=new HashMap<>();
        List<Passanger> pd=new ArrayList<>();
        Person_Detail.add(new Passanger("ROCK", 9));
        Person_Detail.add(new Passanger("AMAR", 8));
        Person_Detail.add(new Passanger("CHILD", 35));
        Person_Detail.add(new Passanger("ABHI" ,20));
        Person_Detail.add(new Passanger("KONDAL", 29));
        List<Passanger> Case_1=Person_Detail.stream().filter(age->age.age()>0 && age.age()<10).collect(Collectors.toList());
        List<Passanger> Case_2=Person_Detail.stream().filter(age->age.age()>=10 && age.age()<20).collect(Collectors.toList());
        List<Passanger> Case_3=Person_Detail.stream().filter(age->age.age()>=20 && age.age()<30).collect(Collectors.toList());
        List<Passanger> Case_4=Person_Detail.stream().filter(age->age.age()>=30 && age.age()<40).collect(Collectors.toList());
        List<Passanger> Case_5=Person_Detail.stream().filter(age->age.age()>=40 && age.age()<50).collect(Collectors.toList());
        List<Passanger> Case_6=Person_Detail.stream().filter(age->age.age()>50).collect(Collectors.toList());


      
        if(Case_1.size()>0)
        {
            System.out.println("========0-10========");
        }
        for(Passanger p:Case_1)
        {
        System.out.println(p.name()+"\t"+p.age());
        }

        
        if(Case_2.size()>0)
        {
            System.out.println("========10-20========");
        }
        for(Passanger p:Case_2)
        {
        System.out.println(p.name()+"\t"+p.age());
        }

        if(Case_3.size()>0)
        {
            System.out.println("========20-30========");
        }
        for(Passanger p:Case_3)
        {
        System.out.println(p.name()+"\t"+p.age());
        }

        if(Case_4.size()>0)
        {
            System.out.println("========30-40========");
        }
        for(Passanger p:Case_4)
        {
        System.out.println(p.name()+"\t"+p.age());
        }

        if(Case_5.size()>0)
        {
            System.out.println("========40-50========");
        }
        for(Passanger p:Case_5)
        {
        System.out.println(p.name()+"\t"+p.age());
        }

        if(Case_6.size()>0)
        {
            System.out.println("======== 50++========");
        }
        for(Passanger p:Case_5)
        {
        System.out.println(p.name()+"\t"+p.age());
        }

    
}
}
class Passanger{
    private String name;
    private int age;
    Passanger(String name , int age)
    {
        this.name=name;
        this.age=age;
    }
    int age()
    {
        return age;
    }
    String name()
    {
        return name;
    }
}
