package Java_algorithm_Ex;

//각 자릿수 합구하기
public class _9_Main {

	public static void main(String[] args) {
		int inputNum = 1232;
		int accNum = 0;
		
		
		//1232  => 일의 자리 수하기 => 123 => 일의자리 구하기 => 12 => 일의자리 구하기 => 1
		//               2                  3                      2           1 = 8
		
		while(inputNum > 0) {
			accNum += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(accNum);
	}
}
