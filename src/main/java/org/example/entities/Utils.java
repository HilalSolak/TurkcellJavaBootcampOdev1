package org.example.entities;

import org.example.business.concretes.PlayerManager;

public class Utils {
    public static void check(){
        if(PlayerManager.getSayac()> 0){
            System.out.println("islem gerceklestiriliyor...");

        }
        else if(PlayerManager.getSayac() <= 0){

            System.out.println("KUllanici bulanamadigi icin islem gerceklestirilemedi...");
            System.exit(0);
        }
    }
}
