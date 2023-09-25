package lectie;
import java.util.Scanner;
//10. написать метод, который будет вычислять сколько денег получает работник за месяц.
// Метод должен принимать на входе два параметра (зарплата за час, кол-во отработанных часов в день)
//Условия: 1) Каждый час после 40 считается за полтора
//2) Работник не может работать больше чем 60 часов в неделю.
//3) Работник не может получать меньше 5 долларов в час.
public class Ex10 {
    public static void Salary(double salary, int hours){
        Double h=Double.valueOf(hours);
        if(salary<5){
            System.out.println("слишком мало зп");
        }
        if (hours>60){
            System.out.println("слишком много рабочих часов в неделю");
        }

        if ((hours>40)&& (hours<=60)){
            System.out.println("бонусы за экстра часы "+(hours-40)*(1.5*salary) + " итого "+ ((salary*h)+(hours-40)*(1.5*salary)));
        }
        if (hours<=40){
            System.out.println(salary*h+ " долларов за стандартную неделю");
        }

    }
    public static void main(String[] args) {
        System.out.println("сколько денег получает работник за месяц");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите зп за час");
        double salary=sc.nextDouble();
        System.out.println("введите рабочих часов");
        int hours = sc.nextInt();
    Salary(salary, hours);
    }
}
