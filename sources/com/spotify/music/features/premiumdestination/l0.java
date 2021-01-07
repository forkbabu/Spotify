package com.spotify.music.features.premiumdestination;

import com.spotify.remoteconfig.PremiumDestinationProperties;

public class l0 {
    private final PremiumDestinationProperties a;

    public l0(PremiumDestinationProperties premiumDestinationProperties) {
        this.a = premiumDestinationProperties;
    }

    public /* synthetic */ Boolean a(Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && this.a.a());
    }
}
