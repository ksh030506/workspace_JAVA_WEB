package Java_algorithm_Ex;

//소수 판별하기
public class _7_Main {
	public static void main(String[] args) {
		int num = 13;
		boolean isPrimeNumber = true;
		
		//소수 1과 자기자신만을 제외하고 나우어 떨어지면 -> 소수가 아님
		//1과 자기자신만 나누어떨어지면 -> 소수
		
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				//primeNumber X
				isPrimeNumber = false;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println(num + " 은 소수입니다.");
		} else {
			System.out.println(num + " 은 소수가 아닙니다.");
		}
	}

}