package PackageTest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test2java {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin ;
		keyin=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("���ƭp�����{��");
		String st ;
		int times = 1 ;
		do {
			System.out.print("�O�_�W�[���? Y/N:" );
			st = keyin.readLine();
			if (st.equals("y")| st.equals("Y"))
			{
			System.out.print("�п�J��"+ times + "��ǥͦ��Z:" );
			st = keyin.readLine();
			list.add(Double.parseDouble(st));
			times++;
			}
			else {times=0;}
		
		}while (times==0);
		//....
		
		double checks=0;
		for(int x = 0 ; x<list.size(); x++){
			if (list.get(x)>checks){checks = list.get(x);}
			System.out.print("��"+(x+1)+"��:"+list.get(x)+"  ");
		}
		
		
		 double[] Score_AF = new double [list.size()];
	   System.out.print("\n"+"�̰���:"+checks);
	   System.out.println("\n�ק�᪺���Z  (�}�ڸ����H10):");
	   for(int x=0; x<Score_AF.length ; x++){
		    Score_AF[x]=Math.pow(list.get(x), 0.5)*10;
		    Score_AF[x]=Math.round(Score_AF[x]);
		    System.out.print("��"+(x+1)+"��:"+Score_AF[x]+"  ");
	   }
	}

}
