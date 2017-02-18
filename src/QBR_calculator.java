import java.util.Scanner;
public class QBR_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A quarterback collects touchdowns:");
		Float TD = sc.nextFloat();
		System.out.println("Total yards:");
		Float YDS = sc.nextFloat();
		System.out.println("Interceptions:");
		Float INT = sc.nextFloat();
		System.out.println("Completions:");
		Float COMP = sc.nextFloat();
		System.out.println("Number of passes attempted:");
		Float ATT = sc.nextFloat();
		double a = ((COMP/ATT)-.3)*5;
		double b = ((YDS/ATT)-3)*.25;
		double c = (TD/ATT)*20;
		double d = 2.375 - ((INT/ATT) * 25);
		if (a>=2.375)
			a = 2.375;
		if (b>= 2.375)
			b = 2.375;
		if (c >= 2.375)
			c = 2.375;
		if (d < 0)
			d = 0;
		if (a < 0)
			a = 0;
		if (b < 0)
			b = 0;
		double QBR = ((a+b+c+d)/6)*100;
		System.out.printf("Player's QB rating is: %.1f", QBR);
	}

}
