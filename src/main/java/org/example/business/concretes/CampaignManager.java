package org.example.business.concretes;

import org.example.business.abstracts.CampaignService;
import org.example.entities.Campaign;
import org.example.entities.Game;
import org.example.entities.Player;
import org.example.entities.Utils;

public class CampaignManager implements CampaignService {
    @Override
    public void campaignAdd(Player player, Game game, Campaign campaign) {
        Utils.check();

            double a = game.getGamePrice();
            double b = campaign.getCampaignAmount();
            double newAmount;

            System.out.println(player.getNickname()+" isimli kullanicisi icin "+ campaign.getCampaignDescription()+" kampanyasi uygulaniyor...");
            System.out.println("Kampanya uygulanmadan onceki fiyat : " + a);

            newAmount = (a - (a*b)/100);
            game.setGamePriceAfterCampaign(newAmount);

            System.out.println("Kampanya uygulandi...");
            System.out.println("Oyunun yeni fiyati : " + newAmount);


    }


    @Override
    public void campaignUpdate(Player player, Game game, Campaign campaign, int update) {
        Utils.check();

        double a = game.getGamePrice();
        campaign.setCampaignAmount(update);
        double b = campaign.getCampaignAmount();
        double newAmount;

        System.out.println("Kampanya miktari guncelleniyor...");
        System.out.println("Kampanya guncellenmeden onceki fiyat : " + a);

        newAmount = (a - (a*b)/100);
        game.setGamePrice(newAmount);

        System.out.println("Kampanya uygulandi...");
        System.out.println("Oyunun fiyati : " + newAmount);
    }
}
