public class Main {
    public static void main(String[] args)
    {
        Person Calvin = new Person("Calvin","Yeboah","123456","MR",2004);

        System.out.println(Calvin);
        System.out.println(Calvin.GetFullName());
        System.out.println(Calvin.GetFormalName());
        System.out.println("Current Age:" + Calvin.GetAge());
        System.out.println("Age at 2004:" + Calvin.GetAge());


    }
}