package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz*/

        Scanner scan=new Scanner(System.in);// Scanner objesi create ettik kullanicidan input almak icin
        System.out.println(" toplama icin 1\n cikarma icin 2\n bolme icin 3\n carpma icin 4 ");
        int islem=scan.nextInt();
        System.out.println("lutfen iki tam sayi giriniz");// kullaniciya bildirimde bulunuldu
        double num1=scan.nextDouble();//birinci sayi assign edildi
        double num2=scan.nextDouble();//ikinci sayi assign edildi

        if (islem ==1){
            System.out.println("toplama isleminin sonucu: "+ num1 + "+" + num2 + "=" +(num1+num2));
        }else if (islem ==2){
            System.out.println("cikarma isleminin sonucu: "+ num1 + "-" + num2 + "=" +(num1-num2));
        }else if (islem ==3){
            System.out.println("carpma isleminin sonucu: "+ num1 + "*" + num2 + "=" +(num1*num2));
        }else if (islem ==4){
            System.out.println("bolme isleminin sonucu: "+ num1 + "/" + num2 + "=" +(num1/num2));}
        else{ System.out.println("hatali secim yaptiniz");}

    }}


































































       /* Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
        //kullanıcıya seçim içn işlem menusu yazdırdık
        int islem = scan.nextInt();//kullanıcının islem tercihi için veriable create edildi
        System.out.println("lütfen iki tam sayı giriniz : ");//kullanıcıya bildirmde bulunuldu.

        double num1 = scan.nextDouble();//1 sayı assign edildi
        double num2 = scan.nextDouble();//2 sayı assign edildi
        if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
        }else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
        } else System.out.println("hatalı secim yaptınız tekrar deneyiniz");
    }
}
*/