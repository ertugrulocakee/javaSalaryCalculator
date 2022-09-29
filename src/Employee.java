public class Employee {

    private  String name;
    private  double salary;
    private  int workHours;
    private  int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public  double tax(){

        if(salary < 1000 ){

            return  0;

        }else{

            return  salary*0.03;

        }

    }

    public double bonus(){

        if(workHours>40){

            return  (workHours-40)*30;

        }else{

            return  0;

        }

    }


    public  double raiseSalary(int hireYear){

       int year = 2021;

       if(hireYear < year){

           int experience = year - hireYear;

           if (experience < 10) {

               return salary * 0.05;

           } else if (experience > 9 && experience < 20) {

               return salary * 0.1;

           } else {

               return salary * 0.15;

           }

       }else {

           return  0;
       }
    }


    public String toString(){

        String result = "Ad: "+name+" Maas: "+salary+" TL Calisma Saati: "+workHours+" Ise baslangic yili: "+hireYear;

        result += " Vergi: "+tax()+ " TL Bonus: "+ bonus() + " TL Maas artisi: "+ raiseSalary(hireYear) + " TL";

        result += " Vergi ve bonuslarla birlikte maas: "+ (salary+ tax()+bonus()) + " TL";

        result += " Toplam maas: " + (salary+ tax()+raiseSalary(hireYear) + bonus()) + " TL";

        return result;
    }


}
