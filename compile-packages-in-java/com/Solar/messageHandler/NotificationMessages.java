package messageHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class NotificationMessages{
    public static LocalDateTime myDateObj = LocalDateTime.now();
    public static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    public static String dTime  = myDateObj.format(myFormatObj);
    public static ArrayList<String> NotificationMessages = new ArrayList<String>();
    public static ArrayList<String> NotificationMessagesT = new ArrayList<String>();
    public static String addMessage(String message){
        NotificationMessages.add("[Notification]: " + message);
        NotificationMessages.add("[" + dTime + "][Notification]: " + message);
        AllMessages.addMessage("[Notification]: " + message);
        return message;
    }
    public static boolean clearMessages(){
        NotificationMessages.clear();
        NotificationMessagesT.clear();
        return true;
    }
    public static String getLastMessage() {
        if(NotificationMessages.size() > 0){
            int size = NotificationMessages.size();
            size --;
            return NotificationMessages.get(size);
        }else {
            return "No Notification Messages";
        }
    }
    public static String getLastTMessage(){
        if(NotificationMessagesT.size() > 0){
            int size = NotificationMessagesT.size();
            size --;
            return NotificationMessagesT.get(size);
        }else {
            return "No Notification Messages";
        }
    }
}