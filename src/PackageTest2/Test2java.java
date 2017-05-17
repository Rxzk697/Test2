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
		System.out.println("分數計算比較程式");
		String st ;
		int times = 1 ;
		do {
			System.out.print("是否增加資料? Y/N:" );
			st = keyin.readLine();
			if (st.equals("y")| st.equals("Y"))
			{
			System.out.print("請輸入第"+ times + "位學生成績:" );
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
			System.out.print("第"+(x+1)+"位:"+list.get(x)+"  ");
		}
		
		
		 double[] Score_AF = new double [list.size()];
	   System.out.print("\n"+"最高分:"+checks);
	   System.out.println("\n修改後的成績  (開根號乘以10):");
	   for(int x=0; x<Score_AF.length ; x++){
		    Score_AF[x]=Math.pow(list.get(x), 0.5)*10;
		    Score_AF[x]=Math.round(Score_AF[x]);
		    System.out.print("第"+(x+1)+"位:"+Score_AF[x]+"  ");
	   }
	}

}
