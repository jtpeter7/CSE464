import java.util.Scanner;
public class change
{


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double cost, paidAmount;
        int[] changes = new int[5];
        System.out.println("Please enter the cost:");
        cost = scan.nextDouble();

        System.out.println("Please enter the paid amount:");
        paidAmount = scan.nextDouble();

        changes=changeCalc(paidAmount, cost);

        for(int i=0; i<5 ; i++)
        {
            System.out.println(changes[i]);
        }


    }

    public static int[] changeCalc(double paid, double cost)
    {

        int change = (int)((paid*100) - (cost*100));
        int dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;
        int[] changes = new int[5];


        if(change > 0)
        {
            while(change>=100){
                change-=100;
                dollars++;
            }
            changes[0]=dollars;

            while(change>=25){
                change-=25;
                quarters++;
            }
            changes[1]=quarters;

            while(change>=10){
                change-=10;
                dimes++;
            }
            changes[2]=dimes;

            while(change>=5){
                change-=5;
                nickles++;
            }
            changes[3]=nickles;

            while(change>=1){
                change-=1;
                pennies++;
            }
            changes[4]=pennies;

        }

        return changes;

    }
}