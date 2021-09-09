package com.Solar;
import java.io.*;
import com.Solar.messageHandler.messageHandler;
public class Program{
    public static boolean isRunning = false;
    public static boolean start(){
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
            return true;
        } catch (IOException | InterruptedException e) {
            messageHandler.HandleMessage(-3, e.toString());
        }
        return true;
    }
    public static void stop(){
        System.exit(1);
    }
    public static void main(String[] args) {
        start();

    }
}