package surprise;

class MinionToy implements ISurprise {

	private static final String[] names = { "Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim" };
	private String minionName;
	private static int counter;

	public MinionToy(String name) {
		this.minionName = name;
	}

	@Override
	public void enjoy() {
		System.out.println("You got a minion named " + this.minionName + "!");
	}

	@Override
	public String toString() {
		return "[Minion] name = " + this.minionName;
	}

	public static MinionToy generate() {
		MinionToy lastMinion;
		if (MinionToy.counter == names.length) {
			counter = 0;
			lastMinion = new MinionToy(MinionToy.names[counter]);
		} else {
			lastMinion = new MinionToy(MinionToy.names[counter]);
			counter++;
		}
		return lastMinion;
	}
}