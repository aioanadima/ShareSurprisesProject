package surprise;

import java.util.ArrayList;

class BagFIFO implements IBag {

	private ArrayList<ISurprise> surprises;

	public BagFIFO() {
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
		return this.surprises.remove(0);
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