package com.Solar.messageHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ErrorMessages {
    public static LocalDateTime myDateObj = LocalDateTime.now();
    public static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    public static String dTime  = myDateObj.format(myFormatObj);
    public static ArrayList<String> ErrorMessages = new ArrayList<String>();
    public static ArrayList<String> ErrorMessagesT = new ArrayList<String>();
    public static String addMessage(String message){
        ErrorMessages.add("[Error]: " + message);
        ErrorMessages.add("[" + dTime + "][Error]: " + message);
        AllMessages.addMessage("[Error]: " + message);
        return message;
    }
    public static boolean clearMessages(){
        ErrorMessages.clear();
        ErrorMessagesT.clear();
        return true;
    }
    public static String getLastMessage() {
        int size = ErrorMessages.size();
        size --;
        return ErrorMessages.get(size);
    }
}
