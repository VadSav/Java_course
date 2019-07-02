

public class SuperBoss {
	private static SuperBoss INSTANCE;
    static String name;

	private SuperBoss(String name) {
		
		this.name = name;
	}
	
	public static synchronized SuperBoss getSuperBoss() {
		if (INSTANCE == null) {
			INSTANCE = new SuperBoss(name);
		}
		
		return INSTANCE;
	}
	
	

}
