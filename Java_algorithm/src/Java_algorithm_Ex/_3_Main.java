package Java_algorithm_Ex;

import java.util.Scanner;

//최빈수 구하기

public class _3_Main {
	

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int Num = 0;
		System.out.print("몇 번 입력하실 껀가요 >> ");
		Num = in.nextInt();
		
		int []intputNum = new int[10];
		for (int i = 0; i < Num; i++) {
			intputNum[i] = in.nextInt();
		}
		
		
		//사용자 input
		//1 2 2 3 4 5 2 2 4 6 7
		
		
		int[] mode = new int[10];
		
		
		//mode[3] = 5 3번 숫자가 5번 나왔다.
		
		
		//intputNum = 1 2 2 3 4 5 2 2 4 6 7
		for (int i = 0; i < Num; i++) {
			mode[intputNum[i]]++;    //mode[2] == 4
		}
		
		//mode[1] == 1
		//mode[2] == 4
		//mode[3] == 1
		//mode[4] == 2
		//mode[5] == 1
		//mode[6] == 1
		//mode[7] == 1
		
		int modeNum = 0;  //현재 최빈수
		int modeCnt = 0;   //최빈수가 나온 횟수
		
		for (int i = 0; i < Num; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수 : " + modeNum);
		System.out.println("cnt : " + modeCnt);
 	}

}
