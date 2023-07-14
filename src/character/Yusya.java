package character;

public class Yusya extends Team {

	public Yusya() {
		super("勇者",3000, 250, 50);
		this.setSide(1);
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
