package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {
		System.out.println(Calculatrice.add(5, 5));
		 int result1 = Calculatrice.multiply(3, 4);
        int result2 = Calculatrice.multiply(5, 2);

        // Print the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
	}
}
