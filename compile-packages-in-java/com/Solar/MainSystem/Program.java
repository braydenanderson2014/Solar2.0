package MainSystem;
import java.io.*;
import Assets.Logo;
import Assets.VersionController;
import install.FirstTime;
import install.InstallSystemSet;
import install.installManager;
import messageHandler.ErrorMessages;
import messageHandler.SystemMessages;
import messageHandler.messageHandler;

public class Program{
    public static boolean isRunning = false;
    public static String Version;
    public static boolean start(){
        Logo.displayLogo();
        System.out.println("Console: ");
        messageHandler.HandleMessage(1, "Starting Solar on Thread main");
        System.out.println(SystemMessages.getLastMessage());
        isRunning = true;
        return isRunning;
    }
    public static boolean clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else{
                Runtime.getRuntime().exec("clear");
            }
            messageHandler.HandleMessage(1, "Cleared Screen, ready to load next Screen");
            System.out.println(SystemMessages.getLastMessage());
            return true;
        } catch (IOException | InterruptedException e) {
            messageHandler.HandleMessage(-2, e.toString());
            System.out.println(ErrorMessages.getLastMessage());
        }
        return true;
    }
    public static void stop(){
        System.exit(0);
    }
    public static void main(String[] args) {
        start();
        new VersionController();//Version Controller sets the Default Version as the Version for now.
        System.out.println(SystemMessages.getLastMessage());
        boolean firstTime = FirstTime.checkFirstTime();
        if(firstTime){
            messageHandler.HandleMessage(1, "Now Installing System Files needed later..");
            System.out.println(SystemMessages.getLastMessage());
            InstallSystemSet.installSystemSets();
            installManager.installMenu();
        }else{
            messageHandler.HandleMessage(1, "System Determined First Time Setup is not necessary.");
            System.out.println(SystemMessages.getLastMessage());
            Version = VersionController.getVersion();//Gets the Default Version for Now...
            messageHandler.HandleMessage(1, "Temporarily set Default Version... Will Correct Version Later...");
            installManager.installMenu();
            //
        }
        
    }
}