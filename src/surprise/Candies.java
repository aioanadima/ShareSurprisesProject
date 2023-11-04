package surprise;
import java.util.Random;

class Candies implements ISurprise {

	public static Random randomGenerator = new Random();
	private static String[] candies = {"chocolate", "jelly", "fruits", "vanilla"};
	private int numberOfCandies;
	private String typeOfCandies;

	public Candies(int num, String type) {
		this.numberOfCandies = num;
		this.typeOfCandies = type;
	}

	@Override
	public void enjoy() {
		System.out.println("You received " + this.numberOfCandies + " " + this.typeOfCandies + " candies.");
	}

	@Override
	public String toString() {
		return "[Candies] number = " + this.numberOfCandies + ", type = " + this.typeOfCandies;
	}

	public static Candies generate() {
		int randomCandiesIndex = randomGenerator.nextInt(Candies.candies.length);
		int randomNumber = randomGenerator.nextInt();
		//return new Candies(1, "chocolate");
		return new Candies(randomNumber, Candies.candies[randomCandiesIndex]);
	}
}