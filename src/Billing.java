import java.util.Scanner;
public class Billing
{
    private float computeBill(float price)
    {
        final float tax = 0.08f;

        return (price * (tax + 1));
    }

    private float computeBill(float price, int quantity)
    {
        final float tax = 0.08f;
        float totalBeforeTax = price * quantity;

        return (totalBeforeTax * (tax + 1));
    }

    private float computeBill(float price, int quantity, float coupon)
    {
        final float tax = 0.08f;
        float totalBeforeTax = price * quantity;

        return ((totalBeforeTax - coupon) * (tax + 1));
    }

    public void main(String[] args)
    {
        float price;
        int quantity;
        float coupon;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter price ");
        price = input.nextFloat();
        System.out.print("Enter quantity ");
        quantity = input.nextInt();
        System.out.print("Enter coupon value ");
        coupon = input.nextFloat();

        System.out.println(computeBill(price));
        System.out.println(computeBill(price, quantity));
        System.out.println(computeBill(price, quantity, coupon));
    }
}