package com.Solar.install;
public class installDirectories{
    private static boolean isFirstTime = FirstTime.checkFirstTime();
    public static boolean checkIsFirstTime() {
        return isFirstTime;
    }
    public static boolean updateIsFirstTime(){
        return isFirstTime;
    }
}