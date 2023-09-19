package course57;

public class Player {
	private int kinnruoku;
	private int gakuryoku;
	private int mitame;
	private int omosiro;
	
	void display() {
		System.out.println("・筋力:"+kinnruoku);
		System.out.println("・学力:"+gakuryoku);
		System.out.println("・見た目:"+mitame);
		System.out.println("・面白さ:"+omosiro);
	}
	public int getKinnruoku() {
		return kinnruoku;
	}
	public void setKinnruoku(int kinnruoku) {
		this.kinnruoku = kinnruoku;
	}
	public int getGakuryoku() {
		return gakuryoku;
	}
	public void setGakuryoku(int gakuryoku) {
		this.gakuryoku = gakuryoku;
	}
	public int getMitame() {
		return mitame;
	}
	public void setMitame(int mitame) {
		this.mitame = mitame;
	}
	public int getOmosiro() {
		return omosiro;
	}
	public void setOmosiro(int omosiro) {
		this.omosiro = omosiro;
	}
}
