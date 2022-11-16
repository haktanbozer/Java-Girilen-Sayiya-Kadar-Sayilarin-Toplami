public class Ders {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n, i, sum;
		System.out.print("Pozitif bir sayı giriniz : ");
		n = Integer.parseInt(scan.nextLine());
		i = 1;
		sum = 0;
		while (i <= n)
		sum += i++; // sum = sum + i++;
		System.out.println("Toplam = " + sum);
		System.out.println("Program sonu");
		}
		}
