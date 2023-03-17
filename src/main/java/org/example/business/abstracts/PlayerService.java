package org.example.business.abstracts;

import org.example.entities.Player;

public interface PlayerService {

    void register(Player player);
    void playerDelete(Player player);
    void playerUpdate(Player player);

}
