public class Task5 {
	public static double areaOfTriangle (float num1, float num2, float num3) {
		double s = (num1 + num2 + num3) /2;

		double area = Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));
		
		return area;
	}

	public static void main (String[] args) {
		double results = areaOfTriangle(10,10,10);

		System.out.print("Area of this triangle is : " + results);
	}
}
