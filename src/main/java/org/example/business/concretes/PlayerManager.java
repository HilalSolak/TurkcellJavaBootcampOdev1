package org.example.business.concretes;


import org.example.entities.Player;
import org.example.business.abstracts.PlayerService;
import org.example.abstracts0.UserValidator;
import org.example.entities.Utils;

public class PlayerManager implements PlayerService, UserValidator {
    static int sayac = 0;

    public PlayerManager() {
    }

    public PlayerManager(int sayac) {
        this.sayac = sayac;
    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        PlayerManager.sayac = sayac;
    }

    @Override
    public void register(Player player) {
        Utils.check();
        System.out.println("Oyuncu sisteme kayit oluyor...");
        System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu sisteme kayit oldu...");

    }

    @Override
    public void userValidation(Player player) {
        System.out.println("Dogrulama gerceklestiriliyor..");
        System.out.println(player.getFirstName() + " " + player.getLastName() + " adli oyuncunun e-devlet uzerinde dogrulamasi yapildi...");
        sayac++;
        register(player);
    }

    @Override
    public void playerDelete(Player player) {
        Utils.check();
        System.out.println("Oyuncu sistemden siliniyor...");
        sayac--;
        System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyucu sistemden cikarildi..");

    }

    @Override
    public void playerUpdate(Player player) {
        Utils.check();
        System.out.println("Oyuncu bilgilerini guncelliyor..");
        System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu bilgileri guncellendi...");

    }
}
