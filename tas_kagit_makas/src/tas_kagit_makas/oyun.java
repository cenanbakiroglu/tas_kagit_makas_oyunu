package tas_kagit_makas;

import java.util.Scanner;
import java.util.Random;

public class oyun {

	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		Random rand = new Random();
		String secenek[]= {"Taş","Kağıt","Makas"};
		
		int oyuncu,o_puan=0,b_puan=0,o_sec,b_sec;
		
		System.out.println("Oyundan çıkmak için sıfırı tuşlayınız");
		
		while(true)
		{
			System.out.println("Bilgisayar : "+b_puan+" || Oyunucu : "+o_puan);
			System.out.print("1-Taş\n2-Kağıt\n3-Makas\nSeciminiz : ");
			o_sec=(oku.nextInt())-1;
			b_sec=rand.nextInt(3);		
			if(o_sec>=-1 && o_sec<=2)
			{
				if(o_sec==b_sec)
				{
					System.out.println("Seciminiz : "+secenek[o_sec]+"\nBilgisayarın secimi : "+secenek[b_sec]+"\nBERABERE");
				}
				else if (o_sec==0 && b_sec==2 || o_sec==1 && b_sec==0 || o_sec==2 && b_sec==1)
				{
					System.out.println("Seciminiz : "+secenek[o_sec]+"\nBilgisayarın secimi : "+secenek[b_sec]+"\nKAZANDINIZ");
					o_puan++;
				}
				else if(b_sec==0 && o_sec==2 || b_sec==1 && o_sec==0 || b_sec==2 && o_sec==1)
				{
					System.out.println("Seciminiz : "+secenek[o_sec]+"\nBilgisayarın secimi : "+secenek[b_sec]+"\nKAYBETTİNİZ");
					b_puan++;
				}
				else if(o_sec==-1)
				{
					if(o_puan>b_puan)
					{
						System.out.println("Oyunu "+o_puan+" ile kazandınız");
					}
					else if(b_puan>o_puan)
					{
						System.out.println("Oyunu "+b_puan+" ile bilgisayar kazandı");
					}
					else
					{
						System.out.println("Berabere bitirdiniz");
					}
					break;
				}
			}
			else
			{
				System.out.println("Geçerli bir değer giriniz");
			}
		}
	}

}
