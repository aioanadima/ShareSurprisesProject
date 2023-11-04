package surprise;

import java.util.*;

class BagRandom implements IBag {

	private ArrayList<ISurprise> surprises;

	public BagRandom() {
		surprises = new ArrayList<>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.surprises.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			ISurprise nextSurprise = bagOfSurprises.takeOut();
			this.put(nextSurprise);
		}
	}

	@Override
	public ISurprise takeOut() {
		Random randomGenerator = new Random();
		int nextIndex = randomGenerator.nextInt(surprises.size());

		return this.surprises.remove(nextIndex);
	}

	@Override
	public boolean isEmpty() {
		return this.surprises.isEmpty();
	}

	@Override
	public int size() {
		return surprises.size();
	}
}