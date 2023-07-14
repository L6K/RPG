package character;
import java.util.Random;

public class Mob extends Team {
	Random rn = new Random();
	private String name;


	public Mob(String name,int HP,int MP) {
		super(name,HP, MP, 50);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int zangeki() {
		// TODO 自動生成されたメソッド・スタブ
		this.setMP(this.getMP() - 50);
		return rn.nextInt(50)+50;
	}

	@Override
	public int hissatsu() {
		// TODO 自動生成されたメソッド・スタブ
		this.setMP(this.getMP() - 100);
		return rn.nextInt(100)+50;
	}
	public String getName(){
		return this.name;
	}



}
