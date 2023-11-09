
// karakter , harf ve sayılardan oluşan 8 haneli 10 adet sifre olusturma


import java.util.Random;
import java.util.Scanner;

public class SifreOlusturma

 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Random r = new Random();
	 char []dizi = { 'a' ,'b' ,'c' ,'1' , '2' , '*' ,'+','-'};	
	String Sifre = " " ;
	for(int i  = 0 ; i < 10 ; i++) {
		
	  for(int j  = 0 ; j < 8 ; j++) {
		  int t = (int)(Math.random()*8);
		 
		Sifre+= dizi[t];
		 
		}
			
	  System.out.println(Sifre);
	  Sifre="";
	}}}
		
	


