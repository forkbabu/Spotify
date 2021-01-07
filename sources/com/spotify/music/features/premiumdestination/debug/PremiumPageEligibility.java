package com.spotify.music.features.premiumdestination.debug;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

public enum PremiumPageEligibility {
    DEFAULT_ELIGIBILITY("Default Eligibility", null),
    INTRO("intro", "intro"),
    NONINTRO("non-intro", "nonintro"),
    WINBACK(Offer.AD_TARGETING_KEY_WINBACK, Offer.AD_TARGETING_KEY_WINBACK);
    
    private final String mDisplayName;
    private final String mEligibility;

    private PremiumPageEligibility(String str, String str2) {
        this.mDisplayName = str;
        this.mEligibility = str2;
    }

    public String d() {
        return this.mEligibility;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mDisplayName;
    }
}
