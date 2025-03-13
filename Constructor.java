
import java.util.*;
import java.lang.*;
class Animal
{
    String name;
    int age;
    public void set(String name, int age)
            {
                this.name = name;
                this.age = age;
            }
    public void display()
    {
        System.out.println ("Name: "+name+"\nAge: "+age);
    }
}
public class Constructor {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter the number of animals: ");
        int num = s.nextInt();
        s.nextLine();
        Animal[] a = new Animal[num];
        for (int i=0; i<num; i++)
        {
        
                a[i] = new Animal();
            System.out.println ("Enter the name: ");
            String name = s.nextLine();
            System.out.println ("Enter the age: ");
            int age = s.nextInt();
            s.nextLine();
            a[i].set(name,age);
            
        }
        for (int i=0; i<num; i++)
        {
            a[i].display();
        }
    }
}
