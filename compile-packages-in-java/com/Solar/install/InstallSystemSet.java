package install;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import Assets.VersionController;
import messageHandler.ErrorMessages;
import messageHandler.SystemMessages;
import messageHandler.messageHandler;

public class InstallSystemSet {
    public static String SystemSetPath = "\\Solar\\InstallationFiles";
    public static String FilePath = SystemSetPath;
    public static String installSystemSets(){
        File file = new File(SystemSetPath);
        if(!file.exists()){
            messageHandler.HandleMessage(1, "Unable to find Directory: " + SystemSetPath + ", at the expected location. Now Creating The Folder Structure");
            System.out.println(SystemMessages.getLastMessage());
            file.mkdirs();
            messageHandler.HandleMessage(1, "Folder Structure Created Successfully");
            System.out.println(SystemMessages.getLastMessage());
        }
        messageHandler.HandleMessage(1, "Now Creating System Files");
        System.out.println(SystemMessages.getLastMessage());
        FilePath = FilePath + "/Path.txt";
        file = new File(FilePath); 
        try {
            if(!file.exists()){
                file.createNewFile();
                messageHandler.HandleMessage(1, "Created Empty File Called Path; Will Populate File later");
                System.out.println(SystemMessages.getLastMessage());                
            }else{
                messageHandler.HandleMessage(1, "File Already Existed, Moving on to next File...");
                System.out.println(SystemMessages.getLastMessage());
            }
            FilePath = SystemSetPath + "/isFirstTime.txt";
            file = new File(FilePath);
            if(!file.exists()){
                file.createNewFile();
                messageHandler.HandleMessage(1, "Created Empty File called isFirstTime; Will Populate File in Just a moment");
                System.out.println(SystemMessages.getLastMessage());
                messageHandler.HandleMessage(1, "Now Populating isFirstTime.txt with Value" + false);
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("false");
                bw.close();
                messageHandler.HandleMessage(1, "Successfully populated isFirstTime.txt");
                System.out.println(SystemMessages.getLastMessage());
            }else{
                messageHandler.HandleMessage(1, "File Already Existed, Moving on to next File...");
                System.out.println(SystemMessages.getLastMessage());
            }
            FilePath = SystemSetPath + "/Version.txt";
            file = new File(FilePath);
            if(!file.exists()){
                file.createNewFile();
                messageHandler.HandleMessage(1, "Created Empty File called Version; Will Populate File in Just a moment");
                System.out.println(SystemMessages.getLastMessage());
                messageHandler.HandleMessage(1, "Now Populating Version.txt with Current Version: " + VersionController.getVersion());
                System.out.println(SystemMessages.getLastMessage());
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(VersionController.getVersion());
                bw.close();
                messageHandler.HandleMessage(1, "Version.txt was Successfully populated...");
                System.out.println(SystemMessages.getLastMessage());
            }else{
                messageHandler.HandleMessage(1, "File Already Existed, Moving on to next File...");
                System.out.println(SystemMessages.getLastMessage());
            }
        } catch (Exception e) {
            messageHandler.HandleMessage(-2, "Unable to Create System File at specified location [" + e.toString() + "]");
            System.out.println(ErrorMessages.getLastMessage());
        }
        return "";
    }    
}
