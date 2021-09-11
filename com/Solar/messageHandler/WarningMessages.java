package com.Solar.messageHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WarningMessages{
    public static LocalDateTime myDateObj = LocalDateTime.now();
    public static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    public static String dTime  = myDateObj.format(myFormatObj);
    public static ArrayList<String> WarningMessages = new ArrayList<String>();
    public static ArrayList<String> WarningMessagesT = new ArrayList<String>();
    public static String addMessage(String message){
        WarningMessages.add("[Warning]: " + message);
        WarningMessages.add("[" + dTime + "][Warning]: " + message);
        AllMessages.addMessage("[Warning]: " + message);

        return message;
    }
    public static boolean clearMessages(){
        WarningMessages.clear();
        WarningMessagesT.clear();
        return true;
    }
    public static String getLastMessage() {
        int size = WarningMessages.size();
        size --;
        return WarningMessages.get(size);
    }
}