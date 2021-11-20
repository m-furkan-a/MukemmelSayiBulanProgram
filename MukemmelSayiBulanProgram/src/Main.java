import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Bir Sayı Giriniz : ");
	    int sayi = input.nextInt();
	    int total=0;

	    for (int i=1;i < sayi ; i++){
	        if (sayi %i==0){
	            total+=i;
            }
        }
	    if (sayi==total)
	        System.out.println(sayi + " Mükemmmel Sayıdır.");
	    else
            System.out.println(sayi + " Mükemmmel Sayıdır Değildir.");
    }
}
