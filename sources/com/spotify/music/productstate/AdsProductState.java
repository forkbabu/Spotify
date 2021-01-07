package com.spotify.music.productstate;

import com.spotify.music.features.ads.model.Ad;

public enum AdsProductState {
    ENABLED("1"),
    DISABLED(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
    
    private final String mValue;

    private AdsProductState(String str) {
        this.mValue = str;
    }

    public String d() {
        return this.mValue;
    }
}
