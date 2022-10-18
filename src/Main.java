import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee employee = new Employee("Ertuğrul",10000,40,2019);
        Employee employee2 = new Employee("Merih",12000,45,2017);
        Employee employee3 = new Employee("Zeynep", 15000,40,2016);
        Employee employee4 = new Employee("Feyza",12500,50,2014);
        Employee employee5 = new Employee("Metin",10000,30,2000);
        Employee employee6 = new Employee("Kemal",2000.0,45,1985);

        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        for(int i= 0; i< employees.size(); i++ ){

            System.out.println(employees.get(i).toString());

        }

    }
}
