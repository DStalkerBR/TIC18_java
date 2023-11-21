package troca;

public class Troca {

	public static void main(String[] args) {
		int umInteiro = 10;
		int outroInteiro = 20;
		int temp;
		temp = umInteiro;
		System.out.println(umInteiro + " <-> " + outroInteiro);
		umInteiro = outroInteiro;
		outroInteiro = temp;
		System.out.println(umInteiro + " <-> " + outroInteiro);
		umInteiro = umInteiro ^ outroInteiro;
		outroInteiro = umInteiro ^ outroInteiro;
		umInteiro = umInteiro ^ outroInteiro;
		System.out.println(umInteiro + " <-> " + outroInteiro);
		
	}

}
