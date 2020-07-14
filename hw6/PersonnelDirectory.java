import java.util.Scanner;
import java.util.*;

public class PersonnelDirectory {


    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        int total =0;
        Scanner scan = new Scanner(System.in);
        String firstN, lastN, middleN;
        int empID;
        double salary;
        int choice = -1;


        do {


            System.out.println("Welcome to the Personnel Directory Management System");
            System.out.println("====================================================");

            System.out.println("\n\n\t 1. Add Personel");
            System.out.println("\n\t 2. Find Personel");
            System.out.println("\n\t 3. Print Names");
            System.out.println("\n\t 4. Number of Entries in the Directory");

            System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter first name: ");
                    firstN = scan.nextLine();
                    System.out.println("Enter last name: ");
                    lastN = scan.nextLine();
                    System.out.println("Enter middle name: ");
                    middleN = scan.nextLine();

                    System.out.println("Enter employee id : ");
                    empID = scan.nextInt();
                    System.out.println("Enter base salary");
                    salary = scan.nextDouble();
                    scan.nextLine();

                    Person e1 = new Person(lastN, firstN, middleN, empID, salary);


                    personList.add(e1);
                    total++;

                    break;

                case 2:

                    System.out.println("Enter first name : ");
                    firstN = scan.nextLine();

                    System.out.println("Enter last name : ");
                    lastN = scan.nextLine();


                    boolean found = false;
                    int loc = -1;
                    for (int i = 0; i < personList.size(); i++) {
                        if (personList.get(i).first.equals(firstN) && personList.get(i).last.equals(lastN)) {
                            found = true;
                            loc = i;
                        }
                    }

                    if (found) {
                        System.out.println("Found");
                        personList.get(loc).printName(0);

                    } else {
                        System.out.println("not found");
                        Person p1 = new Person(lastN, firstN, " ");
                        personList.add(p1);
                        total++;
                    }

                    break;

                case 3:

                    System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
                    int order = scan.nextInt();
                    for (int i = 0; i < personList.size(); i++) {

                        personList.get(i).printName(order);
                    }

                    break;

                case 4:
                    System.out.println("Total Entries : " + total);

                    break;

            }

        } while (true);


    }

}