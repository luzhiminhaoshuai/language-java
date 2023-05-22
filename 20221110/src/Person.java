/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-02-12
 * Time:7:58
 */
public class Person {
    public String name="Person";
    int age=0;
}
 class Child extends Person{
     public String grade;

     public static void main(String[] args){

         Person p = new Person();
         Person p1=new Child();


         System.out.println(p.name);

     }

}
class Grandson extends Child{
  Person a0=new Person();
    Person a1=new Child();
    Person a2=new Grandson();
    Grandson a3=new Grandson();

}
