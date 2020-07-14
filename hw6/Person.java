public class Person {
	public String last;
	public String first;
	public String middle;
	private int empID;
	private double baseSalary;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}
	public Person(String last, String first, String middle, int id, double sal){
		this.last = last;
		this.first = first;
		this.middle = middle;
		empID = id;
		baseSalary = sal;
	}


	public void printName(int order)
	{

	   if(order == 0)
	   {
	      System.out.println(first + "  " + middle + "  " + last);

	   }else if(order == 1)
	       {

	       System.out.println(last + " ," + middle + " " + first);

	       }
	       else if(order == 2)
		   	       {

		   	       System.out.println(last + " ," + first + " " + middle);

	       }
	}


}
