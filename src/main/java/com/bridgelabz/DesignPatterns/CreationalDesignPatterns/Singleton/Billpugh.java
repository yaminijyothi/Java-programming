package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Singleton;

public class Billpugh {
private Billpugh(){}

private static class Helper{
    private static final Billpugh instance= new Billpugh();
}

public static Billpugh getInstance(){
    return Helper.instance;
}
}

