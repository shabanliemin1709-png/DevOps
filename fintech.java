
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
import java.util.Scanner;
public class fintech {
    public static void main(String[] args) {

       Scanner get_data = new Scanner(System.in);
    System.out.println("Добро пожаловать в баздых, вы месный?(yes / no)");
    String local = get_data.nextLine();
if (local.equalsIgnoreCase("yes")) {
System.out.println("Сколько лет?");
int age = get_data.nextInt();
if (age >= 18) {
    System.out.println("Деньги есть? а именно сколько");
  int money = get_data.nextInt();
  if (money >= 100) {
System.out.println("проходи");    
  } else System.out.println("Сорян не поебёшся :(, приходи когда будут деньги.");
} else System.out.println("Сорян не поебёшся :(, не достаточно взрослый.");
}else System.out.println("Сорян, не поебёшся :(, нет документов.");

}}    

