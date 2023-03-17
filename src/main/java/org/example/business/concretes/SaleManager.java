package org.example.business.concretes;

import org.example.business.abstracts.SaleService;
import org.example.entities.Campaign;
import org.example.entities.Game;
import org.example.entities.Player;
import org.example.entities.Utils;

public class SaleManager implements SaleService {
    static boolean control;

  @Override
    public void saleWithCampaign(Player player, Campaign campaign, Game game) {

        Utils.check();
        System.out.println(player.getNickname() + " isimli oyuncu "+ campaign.getCampaignDescription()+" kampanyasindan yararlanarak "
                + "%"+ campaign.getCampaignAmount()+" indirimle"+
                game.getGameName() + " adli oyunu "+game.getGamePriceAfterCampaign()+" fiyatına satin aliyor..");

    }
   @Override
    public void refundGame(Player player, Game game) {
        Utils.check();
        System.out.println(player.getNickname() + " isimli oyuncu "+
                 game.getGameName() + " adli oyunu iade etti..");
        System.out.println("iade edilen tutar : " + game.getGamePrice());

    }
    @Override
    public void refundGameWithCampaign(Player player, Campaign campaign,Game game) {
        Utils.check();
        System.out.println(player.getNickname() + " isimli oyuncu "+
                game.getGameName() + "adli oyunu iade etti..");
        System.out.println("iade edilen tutar : " + game.getGamePriceAfterCampaign());

    }
    @Override
    public void saleWithoutCampaign(Player player, Game game) {
        Utils.check();
        System.out.println(player.getNickname() + " isimli oyuncu "+
                game.getGameName() + " adli oyunu " +game.getGamePrice()+ " fiyatına satin aliyor..");

    }

}

