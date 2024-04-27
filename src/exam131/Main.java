package exam131;

public class Main {

	public void calculateAndPrintArea(int length, int width) {
		int area = length*width;
		System.out.println("Area of the rectangle : " + area);
	}

	public void calculateAndPrintPerimeter(int length, int width) {
		int perimeter = 2*(length + width);
		System.out.println("Perimeter of the rectangle : " + perimeter);
	}

	public void displayWelcomeMessage(String user) {
		System.out.println("Welcome, " + user + "!");
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.displayWelcomeMessage("John");
		main.calculateAndPrintArea(5, 10);
		main.calculateAndPrintPerimeter(5,10);
	}

}
