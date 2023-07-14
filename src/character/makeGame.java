package character;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class makeGame {
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();
	public static void makeChar(int num,int i,ArrayList<Team> YusyaTeam,ArrayList<Team> MaouTeam){
		int index = i+1;
		System.out.println(index+"人目の名前、HP,MPをそれぞれ入力してください");
		System.out.print("名前:");
		String name = sc.next();
		System.out.print("HP:");
		int HP = sc.nextInt();
		System.out.print("MP:");
		int MP = sc.nextInt();
		Mob mob = new Mob(name,HP,MP);
		mob.setSide(1);
		mob.setNo(i);
		YusyaTeam.add(mob);
		String enemyName = "敵"+index;
		Mob mobEnemy = new Mob(enemyName,rn.nextInt(1000),rn.nextInt(200));
		mobEnemy.setSide(0);
		mobEnemy.setNo(num+i);
		MaouTeam.add(mobEnemy);
	}

//	public static ArrayList<Team> ServiveList(ArrayList<Team> team){
//		ArrayList<Team> Serviver = new ArrayList<>();
//		for(int i=0;i<team.size();i++){
//			if(team.get(i).getFlag()){
//				Serviver.add(team.get(i));
//			}
//		}
//		return Serviver;
//	}

	public static void deathCheck(Team a){
		if(a.getHp()<=0){
			a.setFlag();
		}
	}


}
