package course56;

public class PoPocke extends PoSuper implements PoAction{
	int kotaichi;
	String nickname;
	
	public void battle() {
		System.out.println();
	}
	public void recover() {
		System.out.println();
	}
	public int getKotaichi() {
		return kotaichi;
	}
	public void setKotaichi(int kotaichi) {
		this.kotaichi = kotaichi;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
