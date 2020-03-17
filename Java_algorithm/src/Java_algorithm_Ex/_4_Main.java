package Java_algorithm_Ex;

import java.util.Scanner;

//10진수 -> 2진수

public class _4_Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {

			String num;
			System.out.println("시작하실 꺼면 yes 끝내실 꺼면 no를 입력해 주세요.");
			num = in.next();
			switch (num) {
			case "yes":
				System.out.print("2진수로 바꿀 10진수를 입력해 주세요 >> ");
				int inputNum = in.nextInt();

				int[] bin = new int[100];

				int i = 0;

				int mok = inputNum;

				while (mok > 0) {
					bin[i] = mok % 2;
					mok /= 2;
					i++;
				}

				i--;
				for (; i >= 0; i--) {
					System.out.print(bin[i]);
				}
				break;

			case "no":
				System.out.println("종료합니다");
				System.exit(0);
			default:
				System.out.println("잘못입력하였습니다.");
				System.exit(0);
			}
		}

	}

}
