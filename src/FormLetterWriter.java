import java.util.Scanner;
public class FormLetterWriter
{
    private void displaySalutation(String cusLname)
    {
        System.out.println("Dear Mr. or Ms. " + cusLname);
        System.out.println("Thank you for your recent order.");
    }

    private void displaySalutation(String cusFname, String cusLname)
    {
        System.out.println("Dear " + cusFname + " " + cusLname);
        System.out.println("Thank you for your recent order.");
    }

    public void main(String[] args)
    {
        String firstName;
        String lastName;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name ");
        firstName = input.nextLine();
        System.out.print("Enter last name ");
        lastName = input.nextLine();

        FormLetterWriter customer = new FormLetterWriter();
        customer.displaySalutation(lastName);
        customer.displaySalutation(firstName, lastName);
    }
}