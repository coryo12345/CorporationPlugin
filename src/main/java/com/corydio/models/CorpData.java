package com.corydio.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CorpData implements Serializable {
    // static factory
    private static CorpData data = null;

    public static CorpData getCorpData() {
        if (data == null) {
            data = new CorpData();
        }
        return data;
    }

    // instance properties
    private final Map<UUID, Corporation> corporationsByPlayer;

    private CorpData() {
        this.corporationsByPlayer = new HashMap<UUID, Corporation>();
    }

    public Corporation getCorporationForPlayer(UUID playerId) {
        return this.corporationsByPlayer.get(playerId);
    }

    public Corporation addPlayerToNewCorporation(UUID playerId, String corpName) {
        Corporation corp = new Corporation(corpName);
        this.corporationsByPlayer.put(playerId, corp);
        return corp;
    }
}
