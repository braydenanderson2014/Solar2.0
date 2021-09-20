package messageHandler;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class SystemMessages{
    public static LocalDateTime myDateObj = LocalDateTime.now();
    public static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    public static String dTime  = myDateObj.format(myFormatObj);
    public static ArrayList<String> SystemMessages = new ArrayList<String>();
    public static ArrayList<String> SystemMessagesT = new ArrayList<String>();
    public static String addMessage(String message){
        SystemMessages.add("[System]: " + message);
        SystemMessages.add("[" + dTime + "][System]: " + message);
        AllMessages.addMessage("[System]: " + message);
        return message;
    }
    public static boolean clearMessages(){
        SystemMessages.clear();
        SystemMessagesT.clear();
        return true;
    }
    public static String getLastMessage() {
        if(SystemMessages.size() > 0){
            int size = SystemMessages.size();
            size --;
            return SystemMessages.get(size);
        }else if(SystemMessages.size() < 1){
            return "No System Messages";
        }
        return dTime;
    }
    public static String getLastTMessage(){
        if(SystemMessagesT.size() > 0){
            int size = SystemMessagesT.size();
            size --;
            return SystemMessagesT.get(size);
        }else {
            return "No System Messages";
        }
    }
}