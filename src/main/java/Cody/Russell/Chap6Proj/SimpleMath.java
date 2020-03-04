package Cody.Russell.Chap6Proj;

public class SimpleMath  {
	
	public double divide(double numerator2, double denominator2) {
	
		if(denominator2 == 0) {
throw new IllegalArgumentException("Divisor can't be 0!");
		}
		return numerator2/denominator2;
}

}