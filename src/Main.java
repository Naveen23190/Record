record Employee(int Id , String Name)
{

}
public class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee(101, "Naveen");
        System.out.println(employee.Id());
        System.out.println(employee.Name());
        System.out.println(employee);
    }
}
