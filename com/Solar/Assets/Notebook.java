package com.Solar.Assets;
import java.util.ArrayList;
import java.util.Scanner;
public class Notebook {
    private static ArrayList<String>userNotes = new ArrayList<String>();
    private static Scanner scan = new Scanner(System.in);
    public static boolean newNote(){
        String note = "Null";
        System.out.println("Type Done When Done Typing Notes");
        while (!note.equals("done") || !note.equals("Done")) {
            note = scan.nextLine();
            addNote(note);
        }
        return true;
    }
    public static boolean addNote(String note){
        userNotes.add(note);
        return true;
    }
    public static boolean deleteNote(){
        return true;
    }
    public static boolean submitNotesToFile(){
        return true;
    }
    public static String viewNotes(){
        return "Notes";
    }
    public static String resetNotes(){
        return "Notes";
    }
    public static String loadUserNotes(){
        return "Notes";
    }
}
