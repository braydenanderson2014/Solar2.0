package com.Solar.install;
import java.util.Scanner;

import com.Solar.Program;
import com.Solar.Settings;
import com.Solar.Assets.Logo;
import com.Solar.Assets.VersionController;
import com.Solar.HelpManager.HelpManagerMenu;
import com.Solar.messageHandler.messageHandler;
public class installManager{
    public static Scanner scan = new Scanner(System.in);
    public static String Directory;
    public static String driveLetter;
    public static String DefaultPath = "\\Users\\%username%\\Documents/";
    public static String DefaultdriveLetter = "C";
    public installManager(){
        String path = driveLetter + ":" + Directory;
    }
    public static void installMenu(){
        Logo.displayLogo();
        System.out.println("Please wait while we check some things...");
        messageHandler.HandleMessage(1, "Checking For FirstTime Install...");
        boolean firstTime = FirstTime.checkFirstTime();
        if(firstTime){
            Program.clearScreen();
            Logo.displayLogo();
            System.out.println();
            System.out.println("Welcome to Solar, Please choose an Install Type");
            System.out.println("[MAN]: Manual Setup");
            System.out.println("[AUTO]: Auto Setup");
            System.out.println("[HELP]: Help");
            System.out.println();
            System.out.println("Console: ");

            String option = scan.nextLine().toLowerCase();
            if(option.equals("man")){
                //manualSetup
            }else if(option.equals("auto")){
                //autoSetup
            }else if(option.equals("help")){
                HelpManagerMenu.helpManager("INSTALL");
            }else{
                messageHandler.HandleMessage(-1, "Invalid Option, Try again");
                installMenu();
            }
        }else{
            Program.clearScreen();
            Logo.displayLogo();
            System.out.println();
            System.out.println("Welcome to Solar! We are so Glad You are Here!");
            System.out.println("============================================");
            System.out.println("[Start]: Start Program");
            System.out.println("[Config]: Configure Settings");
            System.out.println("[Help]: Help");
            System.out.println("[Stop]: Stop Program and quit");
            System.out.println("Program Version: " + VersionController.getVersion());
            System.out.println("Console: ");

            String option = scan.nextLine();
            if(option.equals("start")){
                
            }else if(option.equals("config")){
                Settings.configMenu();
            }else if(option.equals("help")){
                HelpManagerMenu.helpManagerMenu();// HELP
            }else if(option.equals("stop")){

            }else{
                messageHandler.HandleMessage(-1, "Invalid option, Try again");
                installMenu();
            }
        }
        
        
    }
    public static String getPath() {
        return driveLetter + ":" + Directory;
    }
}