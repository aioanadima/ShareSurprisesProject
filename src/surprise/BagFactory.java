package surprise;

class BagFactory implements IBagFactory {

	private static BagFactory instance;

	private BagFactory() {
	}

	public static BagFactory getInstance() {
		return new BagFactory();
	}

	@Override
	public IBag makeBag(String type) {
		switch (type) {
		case "RANDOM":
			return new BagRandom();
		case "FIFO":
			return new BagFIFO();
		case "LIFO":
			return new BagLIFO();
		}
		return null;
	}
}