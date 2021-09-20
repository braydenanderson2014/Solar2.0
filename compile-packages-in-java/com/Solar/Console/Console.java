package Console;

import messageHandler.ErrorMessages;
import messageHandler.NotificationMessages;
import messageHandler.SystemMessages;
import messageHandler.WarningMessages;

public class Console {
    public static String getConsole(){
        if(ConsoleSettings.ErrorSet == true){
            if(ConsoleSettings.timeSet == true){
                System.out.println(ErrorMessages.getLastTMessage());
            }else {
                System.out.println(ErrorMessages.getLastMessage());
            }
        }
        if(ConsoleSettings.WarningSet == true){
            if(ConsoleSettings.timeSet == true){
                System.out.println(WarningMessages.getLastTMessage());
            }else {
                System.out.println(WarningMessages.getLastMessage());
            }
        }
        if(ConsoleSettings.SystemSet == true){
            if(ConsoleSettings.timeSet == true){
                System.out.println(SystemMessages.getLastTMessage());
            }else {
                System.out.println(SystemMessages.getLastMessage());
            }
        }
        if(ConsoleSettings.UserNotifySet == true){
            if(ConsoleSettings.timeSet == true){
                System.out.println(NotificationMessages.getLastTMessage());
            }else {
                System.out.println(NotificationMessages.getLastMessage());
            }
        }
        return "";
    }
    public static String test(){
        String t = SystemMessages.getLastMessage();
        System.out.println(t);
        return t;
    }
}
