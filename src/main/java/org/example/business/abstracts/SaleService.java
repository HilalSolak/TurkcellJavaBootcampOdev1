package org.example.business.abstracts;

import org.example.entities.Campaign;
import org.example.entities.Game;
import org.example.entities.Player;

public interface SaleService {
    void saleWithCampaign(Player player, Campaign campaign, Game game);

    void refundGameWithCampaign(Player player, Campaign campaign, Game game);

    void refundGame(Player player, Game game);

    void saleWithoutCampaign(Player player, Game game);
}
