package MainSystem;
import java.util.Scanner;
import Assets.Logo;
import Console.ConsoleSettings;
import install.installManager;
import messageHandler.messageHandler;
public class Settings{
    public static Scanner scan = new Scanner(System.in);
    public static String path = installManager.getPath();
    public static String logType = "all";
    public static boolean FirstTime = false;
    public static void SettingsMenu(){
        Logo.displayLogo();
        System.out.println();
        System.out.println("Settings Menu");
        System.out.println("============================================");
        System.out.println("[PATH]: Program's Working Directory" + path);
        System.out.println("[CONSOLE]: Console Settings");
        System.out.println("[LOG]: Log Dump Type: " + logType);
        System.out.println("[FIRST]: Enable/Disable FirstTime Setup: " + FirstTime);
        System.out.println("[RETURN]: Return");
        String option = scan.nextLine().toLowerCase();
        if(option.equals("path")){

        }else if(option.equals("console")){
            ConsoleSettings.ConsoleSettingsMenu();
        }else if(option.equals("log")){
            if(logType.equals("all")){
                logType = "debug";
            }else if(logType.equals("debug")){
                logType = "limited";
            }else if(logType.equals("limited")){
                logType = "all";
            }
            SettingsMenu();
        }else if(option.equals("first")){
            if(FirstTime == true){
                FirstTime = false;
            }else if(FirstTime == false){
                FirstTime = true;
            }
            SettingsMenu();
        }else if(option.equals("return")){

        }else {
            messageHandler.HandleMessage(-1, "Invalid option, Try again");
            SettingsMenu();
        }
    }
    public static void configMenu(){
        Logo.displayLogo();
        System.out.println();
        System.out.println("Settings Menu");
        System.out.println("============================================");
        System.out.println("[PATH]: Program's Working Directory" + path);
        System.out.println("[CONSOLE]: Console Settings");
        System.out.println("[LOG]: Log Dump Type: " + logType);
        System.out.println("[FIRST]: Enable/Disable FirstTime Setup: " + FirstTime);
        System.out.println("[RETURN]: Return");
        String option = scan.nextLine().toLowerCase();
        if(option.equals("path")){
            
        }else if(option.equals("console")){
            ConsoleSettings.dConsoleSettingsMenu();
        }else if(option.equals("log")){
            if(logType.equals("all")){
                logType = "debug";
            }else if(logType.equals("debug")){
                logType = "limited";
            }else if(logType.equals("limited")){
                logType = "all";
            }
            configMenu();
        }else if(option.equals("first")){
            if(FirstTime == true){
                FirstTime = false;
            }else if(FirstTime == false){
                FirstTime = true;
            }
            configMenu();
        }else if(option.equals("return")){
            installManager.installMenu();
        }else {
            messageHandler.HandleMessage(-1, "Invalid option, Try again");
            configMenu();
        }
    }
    public static boolean refreshSettings(){
        path = installManager.getPath();
        logType  = "all";
        FirstTime = false;
        return true;
    }
}