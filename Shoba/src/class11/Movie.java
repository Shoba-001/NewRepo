package class11;

public abstract class Movie {
	boolean isBlockBuster;
	boolean isDualRole;
	public abstract void heroName(String heroName);
	public void heroineName(String heroineName) {
		System.out.println(heroineName);
	}
	public void isBlockBuster(boolean isBlockBuster) {
		System.out.println(isBlockBuster);
	}
	public void isDualRole(boolean isDualRole) {
		System.out.println(isDualRole);
	}

}
