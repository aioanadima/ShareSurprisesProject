package surprise;

import java.util.ArrayList;
import java.util.Random;

final class GatherSurprises {

	private static ISurprise[] gatherSurprises;
	public static Random randomGenerator = new Random();

  private GatherSurprises(ISurprise[] gatherSurprises) {
	  GatherSurprises.gatherSurprises = gatherSurprises;
  }

  public static ISurprise[] gather(int n) {
	  	ISurprise[] gatherSurprises = new ISurprise[n + 1];
		for (int i = 0; i < n; i++) {
			int randomNumber = randomGenerator.nextInt(2);
			
			switch(randomNumber) {
			case 0:
				gatherSurprises[i] = FortuneCookie.generate();
				break;
			case 1:
				gatherSurprises[i] = Candies.generate();
				break;
			case 2:
				gatherSurprises[i] = MinionToy.generate();
			}	
		}
		return gatherSurprises;
  }

  public static ISurprise gather() {
		int randomNumber = randomGenerator.nextInt(3);
				
		switch(randomNumber) {
			case 0:
				return FortuneCookie.generate();
			case 1:
				return Candies.generate();
			case 2:
				return MinionToy.generate();
		}	
		return null;
  }
}