import java.util.Scanner;
public class bekedn {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("What up?");
        String uns1 = ask.nextLine();
        if (uns1.equalsIgnoreCase("good")) {
        System.out.println("do you need any think?");
        String uns2 = ask.nextLine();
        if (uns2.equalsIgnoreCase("yes")) {
        System.out.println("Only Og krash, hoy many do you need?");
        int uns3 = ask.nextInt();
        int bill = uns3*70;
        System.out.println("That'll " + bill);
 
        }  System.out.println("I am lil bit busy, see you lettr bro");
        } System.out.println("see u letter");
    }
}
