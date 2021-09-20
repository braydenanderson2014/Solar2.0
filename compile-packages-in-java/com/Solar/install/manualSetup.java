package install;

import Assets.Logo;
import Assets.VersionController;
import Console.Console;
import MainSystem.ProgramController;

public class manualSetup{
    public manualSetup(){
        
    }
    public static void ManualMenu(){
        ProgramController.clearScreen();
        Logo.displayLogo();
        System.out.println();
        System.out.println("Welcome to Solar: Manual Setup Menu");
        System.out.println("[PATH]: Set The Path; Current Path: " + installManager.getPath());
        System.out.println("[VERSION]: Set The Version: " + VersionController.getVersion());
        System.out.println();
        System.out.println("Console");
        Console.getConsole();
    }
}