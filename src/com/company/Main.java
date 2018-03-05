package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String eilute = "DBCDAAB";

        System.out.println(pirmasPasikartojantisSimbolis(eilute));
    }

    public static char pirmasPasikartojantisSimbolis(String e){

        ArrayList<Character> pirmaSykiMatomos = new ArrayList<Character>();
        pirmaSykiMatomos.add(e.charAt(0));

        for (int i = 1; i < e.length(); i++){
            for(int j = 0; j < pirmaSykiMatomos.size(); j++){
                if(e.charAt(i) == pirmaSykiMatomos.get(j)){
                    return e.charAt(i);
                }
            }
            pirmaSykiMatomos.add(e.charAt(i));
        }
        return '-';
    }
}
