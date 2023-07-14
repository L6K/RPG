package main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import character.Maou;
import character.Team;
import character.Yusya;
import character.makeGame;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Yusya yusya = new Yusya();
		Maou maou = new Maou();

		ArrayList<Team> YusyaTeam = new ArrayList<>();
		ArrayList<Team> MaouTeam = new ArrayList<>();
		YusyaTeam.add(yusya);
		MaouTeam.add(maou);
		System.out.print("味方の数を入力してください:");
		int allyNum = sc.nextInt();
		for(int i=0;i<allyNum;i++){
			makeGame.makeChar(allyNum,i, YusyaTeam, MaouTeam);
		}
		System.out.println("勇者チームの情報は以下になります");
		for(int i=0;i<=allyNum;i++){
			System.out.println(YusyaTeam.get(i).display());
		}
		System.out.println("魔王チームの情報は以下になります");
		for(int i=0;i<=allyNum;i++){
			System.out.println(MaouTeam.get(i).display());
		}

		//新しい生存リストを勇者側、魔王側それぞれ作ってフラグで判断して入れる→そもそも必要？フラグあるのに？
		//生存リストの要素のパラメータから敵だけを判断してランダムに攻撃→新しくリストを作る？
		//攻撃方法はランダム(MPを参考に昇順でナンバリング、それを参考に乱数の範囲を指定)
		//MPが足りない場合、当攻撃方法を選択肢から除外
		//勇者側と魔王側の生存リストをマージしてSPで降順にソート
		//攻撃を行うたび死亡判定
		//名前が"勇者"の場合のみ攻撃方法の選択
		//YusyaTeamかMaouTeamの0番目のflagが0になったらゲーム終了

		while(true){
			ArrayList<Team> YMS = YusyaTeam;
			YMS.addAll(MaouTeam);
			YMS.sort((a,b) -> b.getSp()-a.getSp());
			for(int i=0;i<YMS.size();i++){
				int  target = rn.nextInt(4);
				if(YMS.get(i).getNo()<4){
					target+=4;
					if(YMS.get())
				}
			}

		}






	}

}

