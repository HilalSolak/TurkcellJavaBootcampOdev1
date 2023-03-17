package org.example.business.abstracts;
import org.example.entities.Player;
import org.example.entities.Game;
import org.example.entities.Campaign;

public interface CampaignService {
    void campaignAdd(Player player,Game game,Campaign campaign);
    void campaignUpdate(Player player,Game game,Campaign campaign,int update);
}
