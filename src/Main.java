import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        String name="Faisal Abdullah Alanazi";
        String friendName="";
        String friendIBAN="";
        String s="";
        int balance=10000;
        double n=0.0;
        while (true) {
            System.out.println("");
            System.out.println("=========================================");
            System.out.println("            Faisal ATM With Switch       ");
            System.out.println("=========================================");
            System.out.println("    > Enter (W or w) to withdraw");
            System.out.println("    > Enter (D or d) to deposit ");
            System.out.println("    > Enter (T or t) to transfer");
            System.out.println("    > Enter (P or p) to print info");
            System.out.println("    > Enter (E or e) to E X I T");
            System.out.println("=========================================");
            System.out.print("    > Enter your choice: ");
            s = input.next().toLowerCase();
            switch (s) {
                case "w":
                    System.out.print("    > Enter amount of  money  to withdraw ( up to 5000 ):");
                    n = input.nextInt();
                    if (n > 5000 || n <= 0) {
                        System.out.println("    > You cannot withdraw because up to 5000 or withdraw more than  your balance ");
                    } else {
                        balance -= n;
                        System.out.print("    > Your withdraw is: " + n + " your balance new is:  " + balance);
                    }
                    break;

                case "d":
                    System.out.print("    > Enter your amount your money deposit ( up to 10.000): ");
                    n = input.nextInt();
                    if (n > 10000 || n > balance) {
                        System.out.println("    > You cannot Deposit more than 10,000");
                    } else {
                        balance += n;
                        System.out.println("    > your deposit: " + n + "your new balance is: " + balance);
                    }
                    break;
                case "t":
                    System.out.print("    > how match you need transfer: ");
                    n = input.nextInt();
                    if (n > balance || n > 8000) {
                        System.out.println("    > you cannot transfer because more than allow transfer");
                    } else {

                        System.out.print("    > Enter name for transfer: ");
                        friendName = input.next().toUpperCase();
                        System.out.print("    > Enter your friend IBAN for transfer: ");
                        friendIBAN = input.next().toUpperCase();
                        if (friendIBAN.length()==10){

                            balance -= n;
                            System.out.println("    > your transfer to " + friendName + " : " + n + "\n \t transfer Successfully");
                        }

                    }
                    break;
                case "p":
                    System.out.println("    > Your name: "+name);
                    System.out.println("    >your balance is : " + balance);
                    break;
                case "e":
                    break;

            }
        }









    }
}