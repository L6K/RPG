package character;

public class Maou extends Team {

	public Maou() {
		super("魔王",10000, 1000, 50);
		this.setSide(0);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int zangeki() { //MP-50で100ダメ
		// TODO 自動生成されたメソッド・スタブ
		this.setMP(this.getMP() - 50);
		return 100;

	}

	@Override
	public int hissatsu() {
		// TODO 自動生成されたメソッド・スタブ
		this.setMP(this.getMP() - 100);
		return 300;
	}
}
