import java.util.Scanner;

public class Assignment1B
{
    public static void main(String[] args)
    {
        float price, rate, s_Charge;  //create empty float variables

        Scanner sc = new Scanner(System.in);

        System.out.println("[What to Tip]");

        System.out.println("Enter the total price of the meal: ");
        price = sc.nextFloat();

        System.out.println("Enter the local tax rate: ");
        rate = sc.nextFloat();

        System.out.println("Enter the service charge: ");
        s_Charge = sc.nextFloat();

        float t_Tax = price * rate;
        float s_Total = price + s_Charge;

        System.out.println("The subtotal is $" + s_Total);

        double ten_Tip = s_Total * .10;
        double ten_Tip_Total = ten_Tip + s_Total + t_Tax;

        System.out.println("A 10% tip would be $" + ten_Tip);
        System.out.println("The total would be $" + ten_Tip_Total);

        double twenty_Tip = s_Total * .25;
        double tw_Tip_Total = twenty_Tip + s_Total + t_Tax;

        System.out.println("A 25% tip would be $" + twenty_Tip);
        System.out.println("The total would be $" + tw_Tip_Total);
    }
}
