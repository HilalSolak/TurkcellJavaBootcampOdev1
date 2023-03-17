package org.example;

import org.example.entities.Campaign;
import org.example.entities.Game;
import org.example.entities.Player;
import org.example.business.concretes.PlayerManager;
import org.example.business.concretes.SaleManager;
import org.example.business.concretes.CampaignManager;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.setId(1);
        player.setFirstName("Merve");
        player.setLastName("Çanakcı");
        player.setNickname("vendeton");
        player.setBirthday("2000");
        player.setIdentityNumber("11111111111");

        PlayerManager playerManager = new PlayerManager();

        playerManager.userValidation(player);
        playerManager.playerUpdate(player);

        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setCampaignDescription("Super Mayis Indirimleri");
        campaign.setCampaignAmount(20);

        Game game = new Game();
        game.setId(1);
        game.setGameName(" Valorant");
        game.setGamePrice(100);
        game.setGamePriceAfterCampaign(100);


        CampaignManager campaignManager = new CampaignManager();
        campaignManager.campaignAdd(player, game, campaign);

        SaleManager saleManager = new SaleManager();
        saleManager.saleWithCampaign(player, campaign, game);
        saleManager.refundGameWithCampaign(player,campaign, game);
        saleManager.saleWithoutCampaign(player, game);
        saleManager.refundGame(player, game);

    }
}