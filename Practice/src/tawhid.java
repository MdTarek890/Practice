import java.util.Scanner; 
public class tawhid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("Enter several numbers, separated by one space and type 0 to end sum=");
		    Scanner reader=new Scanner(System.in);
		    double sum=0;
		    double x = reader.nextDouble();
		    while(x!=0){
		    sum=sum+x;
		    x=reader.nextDouble();
		    }
		    System.out.printf("sum= "+sum);

		    System.out.printf("sum=%2.2f\n",sum);

	}

}
