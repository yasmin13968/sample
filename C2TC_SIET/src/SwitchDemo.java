
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter animal number which you want to select");
		String option=sc.next();
		
		String animal;
		
		switch(option)
		{
		case "A":animal="Tiger";
			   break;
			
		case "B":animal="Lion";
			   break;
			   
		case "C":animal="Elephant";
		       break;
			
		case "D":animal="Horse";
				break;
				
		case "E":animal="Zebra";
				break;
				
		default:animal="Invalid";
				break;
		}
		System.out.println("The selected animal is "+animal);
	}

}
