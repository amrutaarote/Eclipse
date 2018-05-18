package Emp;

public class ChallengeMethod {
	
	public static void main  (String[] args)	{
	double Centimeters= calcFeetAndinchesToCentimeter (-7,5);
		
		if (Centimeters <0.0)
		{System.out.println("Inavlid Parameters");
		}
		calcFeetAndinchesToCentimeter(157);
	
	}	
	public static double calcFeetAndinchesToCentimeter ( double feet,double inches) {
		
		if ((feet<0) || ((inches<0) && (inches>12))) {
			System.out.println("Invalid feet or inches parameters");
		 			return -1;
					}
		double Centimeters = (feet*12)*2.54;
		Centimeters+= (inches*2.54);
				System.out.println(feet+ "Feet," + inches + "inches=" + Centimeters + "cm");
				return Centimeters;
		}
	
	
	
	
	public static double calcFeetAndinchesToCentimeter(double inches) {
		if (inches<0) {
			return -1;
		 		}
	double feet = inches/12;
	double remainingInches = (int) inches%12;
	System.out.println("inches is equal to ="+ feet + "feet and " + remainingInches);
	return calcFeetAndinchesToCentimeter (feet,remainingInches);
	
	}
				
	
		
}		
	
