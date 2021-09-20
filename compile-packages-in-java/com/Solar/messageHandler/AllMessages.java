package messageHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AllMessages {
    public static LocalDateTime myDateObj = LocalDateTime.now();
    public static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    public static String dTime  = myDateObj.format(myFormatObj);
    public static ArrayList<String> AllMessages = new ArrayList<String>();
    public static ArrayList<String> AllMessagesT = new ArrayList<String>();
    public static String addMessage(String message){
        AllMessages.add(message);
        AllMessagesT.add("[" + dTime + "]" + message);
        
        return message;
    }
    public static boolean clearMessages(){
        AllMessages.clear();
        AllMessagesT.clear();
        return true;
    }
    public static String getLastMessage() {
        if(AllMessages.size() > 0){
            int size = AllMessages.size();
            size --;
            return AllMessages.get(size);
        }else {
            return "No Messages";
        }
    }
    public static String getLastTMessage(){
        if(AllMessagesT.size() > 0){
            int size = AllMessagesT.size();
            size --;
            return AllMessagesT.get(size);
        }else {
            return "No Messages";
        }
    }
}
