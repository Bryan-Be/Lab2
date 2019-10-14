import java.util.Scanner;

public class periMeter {

	public static void main(String[] args) {
		System.out.println("Calculate the value of the area, volume and the perimeter of anyroom you desire in Grand Circus!!!");
		Scanner scan = new Scanner(System.in);
		int CEILINGHEIGHT = 12;
		
		 char userQuest = 'y';
			
			
			while (userQuest == 'y') {
		
		
		
		System.out.println("Enter the Length of room in questions:");
		double roomLength = scan.nextDouble();
		
		
		
		System.out.println("Enter the Width of room in questions:");
		double roomWidth = scan.nextDouble();
		
		
		double area = (roomLength * roomWidth);
		double periMeter = (2*(roomLength + roomWidth));
		double voLume = (roomLength * CEILINGHEIGHT * roomWidth);
		
		System.out.println("Perimeter :" + periMeter);
		System.out.println("Area :" + area);
		System.out.println("Volume :" + voLume);
		
		System.out.println("Would you like to calculate another room?... If so press y");
		
		  userQuest = scan.next().charAt(0); 
		
			}
		
		System.out.println("Thank you for using my app have a great day!!!!!!");

	}

}
