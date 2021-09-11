package com.Solar.HelpManager;

import com.Solar.Assets.Logo;
import com.Solar.messageHandler.messageHandler;

public class HelpManagerMenu {
    public static void helpManagerMenu(){
        Logo.displayLogo();
        System.out.println();
        System.out.println("Welcome to the HelpMangerMenu, From Here you can choose a General help topic!");
        System.out.println("[INSTALL]: Installer Help");
    }   
    public static String helpManager(String option){
        if(option.equals("INSTALL")){
            String help = InstallMangerHelper.getHelp();
            return help;
        }else if(option.equals("CONSOLESETTINGS")){

        }else{
            messageHandler.HandleMessage(-2, "Invalid Option Detected by System... Moving to HelpMangerMenu");
            helpManagerMenu();
        }
        return option;
    }
}
