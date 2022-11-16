java.util.Scanner scan = new java.util.Scanner(System.in);
int n, i, sum;
System.out.print("Pozitif bir sayı giriniz : ");
n = Integer.parseInt(scan.nextLine());
i = 1;
sum = 0;
do
{
sum += i++;
}
while (i <= n);
System.out.println("Toplam = " + sum);
System.out.println("Program sonu");
}
}
