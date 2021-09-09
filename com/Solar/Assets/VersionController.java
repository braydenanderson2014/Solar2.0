package com.Solar.Assets;
import java.io.*;
import java.util.Scanner;
public class VersionController {
    private static String DefaultVersion = "ALPHA V1.1.0";
    private static Scanner scan = new Scanner(System.in);
    private static String Version = "";
    public VersionController(){
        Version = DefaultVersion;

    }
    public static String updateVersion(){
        return Version;
    }
}
