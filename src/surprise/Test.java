package surprise;

public class Test {

	public static void main(String[] args) {
//		FortuneCookie fc0 = FortuneCookie.generate();
//		System.out.println(fc0);
//		System.out.println("--------");
//		fc0.enjoy();
		
//		Candies c0 = Candies.generate();
//		System.out.println(c0);
//		System.out.println("------------");
//		c0.enjoy();
		
//		MinionToy t0 = MinionToy.generate();
//		System.out.println(t0);
//		System.out.println("------------");
//		t0.enjoy();
//		
//		MinionToy t1 = MinionToy.generate();
//		System.out.println(t1);
//		System.out.println("------------");
//		t1.enjoy();
//		
//		MinionToy t2 = MinionToy.generate();
//		System.out.println(t2);
//		System.out.println("------------");
//		t2.enjoy();
		
//		ISurprise[] s1 = new ISurprise[3];
//		s1 = GatherSurprises.gather(5);
//		for(int i = 0; i < 5; i++) {
//			System.out.println(s1[i]);
//		}
		
//		ISurprise s2;
//		s2 = GatherSurprises.gather();
//		System.out.println(s2);
		
		
		//AbstractGiveSurprises a1 = new AbstractGiveSurprises("FIF0", 10);
		GiveSurpriseAndApplause ga = new GiveSurpriseAndApplause("LIFO", 190);
		System.out.println(ga);		

		
	}

}
