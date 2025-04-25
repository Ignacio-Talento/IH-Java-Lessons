package com.ironhack.w1.d4;

public class Main {
    public static void main(String[] args) {

//        Abastract classes & interfaces

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);
//        Player player = new Player(0.3, 2); // we cannot create an instance of an abstract class

        System.out.println("Web Player volume: " + webPlayer.getVolume());
        webPlayer.close();
        applePlayer.close();
        applePlayer.play();
        System.out.println(applePlayer.getVolume());
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.7, 3);
        androidPlayer.play();
        androidPlayer.close();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        System.out.println(androidPlayer.getVolume());

        System.out.println(androidPlayer.share());

    }
}
