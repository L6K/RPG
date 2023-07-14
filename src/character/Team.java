package character;

public abstract class Team {
	private int HP,MP,SP,NO;
	private String name;
	private boolean lifeFlag=true;
	private int side; //0敵,1味方
	Team(String name,int HP,int MP,int SP){
		this.HP = HP;
		this.setMP(MP);
		this.SP = SP;
		this.name = name;
	}

	public int normalAttack(){
		return 50;
	}
	//TODO:オーバーライド
	public abstract int zangeki();


	public abstract int hissatsu();

	public int getHp(){
		return this.HP;
	}

	public void setHp(int HP){
		this.HP=HP;
	}

	public int getMp(){
		return this.getMP();
	}

	public void setMp(int MP){
		this.setMP(MP);
	}

	public int getSp(){
		return this.SP;
	}

	public void setSp(int SP){
		this.SP=SP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public int getNo(){
		return this.NO;
	}

	public void setNo(int NO){
		this.NO=NO;
	}

	public String display(){
		return "名前:"+this.name+" HP:"+this.getHp()+" MP:"+this.getMP()+" SP:"+this.SP;
	}

	public void setFlag(){
		this.lifeFlag=false;
	}

	public boolean getFlag(){
		return this.lifeFlag;
	}

	public int getSide(){
		return this.side;
	}

	public void  setSide(int side){
		this.side = side;
	}

}
