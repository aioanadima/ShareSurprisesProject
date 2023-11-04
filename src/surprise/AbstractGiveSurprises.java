package surprise;

import java.util.concurrent.TimeUnit;
import java.util.*;

abstract class AbstractGiveSurprises {

	private IBag container;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		this.container = BagFactory.getInstance().makeBag(type);
		this.waitTime = waitTime;
	}

	public void put(ISurprise newSurprise) {
		this.container.put(newSurprise);
	}

	public void put(IBag surprises) {
		while (!surprises.isEmpty()) {
			this.container.put(surprises);
		}
	}

	public void give() {
		this.container.takeOut().enjoy();
		this.giveWithPassion();
	}

	public void giveAll() {
		while (!container.isEmpty()) {
			this.container.takeOut().enjoy();
			this.giveWithPassion();
			
			// Sleep for X seconds - code snippet
			try {
				TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean isEmpty() {
		return this.container.isEmpty();
	}

	abstract void giveWithPassion();
}