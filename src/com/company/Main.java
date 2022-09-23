package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int Body = 0;
        System.out.println("je moje oblibena barva cerna?");
        String color = sc.nextLine();
        if (color.equalsIgnoreCase("ano")){
            System.out.println("toto neni spravna odpoved, moje oblibena barva je bila, 0 bodu");

        }
        else {
            System.out.println("ano, toto je sprava odpoved, +1 bod"); Body = 1;
        }
        System.out.println("Bude dnes prset?");
        String Weather = sc.nextLine();
        if(Weather.equalsIgnoreCase("ano")){
            System.out.println("ano, bez napovedy, +1 bod"); Body++;
        }
        else {
            System.out.println("spatne, bez bodu");
        }
        System.out.println("Mam se dnes dobre?");
        String mood = sc.nextLine();
        if (mood.equalsIgnoreCase("ano")){
            System.out.println("toto je spravna odpoved, 1 bod"); Body++;

        }
        else {
            System.out.println("Toto je spatna odpoved, bez bodu");
        }
        System.out.println("Mam na sobe mikinu?");
        String sweatshirt = sc.nextLine();
        if(sweatshirt.equalsIgnoreCase("ano")){
            System.out.println("ano, bez napovedy, +1 bod");
            Body++; }
        else {
            System.out.println("spatne, bez bodu");
        }

        System.out.println("Budu mit dnes k veceri pizzu?");*-;
        String dinner = sc.nextLine();
        if(dinner.equalsIgnoreCase("ano")){
            System.out.println("Spatne, bezu bodu");
        }
        else {
            System.out.println("ano spravne + bod");
            Body++;  }
        System.out.println(Body + " body");
    }
}
