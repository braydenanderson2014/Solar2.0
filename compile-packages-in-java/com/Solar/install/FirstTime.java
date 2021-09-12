package install;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import messageHandler.ErrorMessages;
import messageHandler.SystemMessages;
import messageHandler.messageHandler;

public class FirstTime {
    public static boolean firstTime;
    public static boolean checkFirstTime(){
        String path = "\\Solar\\InstallationFiles/isFirstTime.txt";
        File file = new File(path);
        if(file.exists()){
            try {
                BufferedReader in = new BufferedReader(new FileReader(new File(path)));
                int line = 0;
                messageHandler.HandleMessage(1, "Reading from isFirstTime.txt on line: " + line);
                System.out.println(SystemMessages.getLastMessage());
                for(String x= in.readLine(); x != null; x= in.readLine()){
                    line++;
                    messageHandler.HandleMessage(1, "Reading from isFirstTime.txt on line: " + line);
                    System.out.println(SystemMessages.getLastMessage());
                    firstTime = Boolean.parseBoolean(x);
                }
                in.close();
                messageHandler.HandleMessage(1, "Found a Boolean, Now applying to System Setting... IsFirstTime = " + firstTime);
                System.out.println(SystemMessages.getLastMessage());
                return firstTime;
            } catch (Exception e) {
                messageHandler.HandleMessage(-2, "Failed to read from isFirstTime.txt [" + e.toString() + "]");
                return true;
            }
        }else{
            messageHandler.HandleMessage(-2, "Failed to find a critical File, Starting System File Setup");
            System.out.println(ErrorMessages.getLastMessage());
            return true;
        }
    }
}
