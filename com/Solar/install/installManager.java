package com.Solar.install;

import com.Solar.Assets.Logo;

public class installManager{
    public static String Directory;
    public static String driveLetter;
    public static String DefaultPath = "\\Users\\%username%\\Documents/";
    public static String DefaultdriveLetter = "C";
    public installManager(){
        
    }
    public static void installMenu(){
        Logo.displayLogo();
        System.out.println();
        System.out.println("Welcome to Solar, Please choose an Install Type");
        System.out.println("[MAN]: Manual Setup");
        System.out.println("[AUTO]: Auto Setup");
        System.out.println("[HELP]: Help");
        
    }
}