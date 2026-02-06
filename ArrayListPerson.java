import java.util.ArrayList;
public class ArrayListPerson
{  
  public static void main(String[] args)
  { 
    ArrayList<Person> members = new ArrayList<Person>();
    Person a = new Person();
    Person b = new Person();
    Person c = new Person();
    members.add(a);
    members.add(b);
    members.add(c);
    a.setname("Greg");
    a.setsmart(5.0);
    a.setspeed(2);
    b.setname("Sigma");
    b.setsmart(10.0);
    b.setspeed(10);
    c.setname("Goober");
    c.setsmart(1.0);
    c.setspeed(10);

    
    for(Person m: members){
      System.out.print(m.getname()+", ");
      System.out.print(m.getspeed()+", ");
      System.out.print(m.getsmartness()+", ");
      System.out.println("\n\n");
    }
    

  }
}
