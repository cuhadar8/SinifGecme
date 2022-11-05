import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int notToplam = 0;
		int dersToplam = 0;
		
		
		System.out.print("Matematik notunuz: ");
		int mat = scanner.nextInt();
		if(!(mat<0 || mat>100)) {
			notToplam += mat;
			dersToplam++;
			
		}
		
		System.out.print("Türkçe notunuz: ");
		int turkce = scanner.nextInt();
		if(!(turkce<0 || turkce>100)) {
			notToplam += turkce;
			dersToplam++;
			
		}
		
		System.out.print("Fizik notunuz: ");
		int fizik = scanner.nextInt();
		if(!(fizik<0 || fizik>100)) {
			notToplam += fizik;
			dersToplam++;
		}
		
		System.out.print("Kimya notunuz: ");
		int kimya = scanner.nextInt();
		if(!(kimya<0 || kimya>100)) {
			notToplam+=kimya;
			dersToplam++;
		}
		
		System.out.print("Müzik notunuz: ");
		int muzik = scanner.nextInt();
		if(!(muzik<0 || muzik>100)) {
			notToplam += muzik;
			dersToplam++;
		}
		
		double average = notToplam/dersToplam;
		
		if(average<55) {
			System.out.println("Sınıf tekrarına kaldınız.");
		}
		else {
			System.out.println("Tebrikler sınıfı geçtiniz. :)");
		}
		System.out.println("Ortalamanız: " + average);
		
		
		

	}

}
