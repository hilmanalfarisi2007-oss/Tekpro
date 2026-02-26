public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio", 2000000, 1989);
        staff[1] = new Employee("Maria", 2500000, 1991);
        staff[2] = new Employee("Isabel", 3000000, 1993);

        
        int result = staff[0].compare(staff[1]);

        if (result < 0)
            System.out.println("Antonio gajinya lebih kecil dari Maria");
        else if (result > 0)
            System.out.println("Antonio gajinya lebih besar dari Maria");
        else
            System.out.println("Gaji sama");

        
        Sortable.shell_sort(staff);

        System.out.println("\nSetelah diurutkan:");
        for (Employee e : staff) {
            e.print();
        }
    }
}
