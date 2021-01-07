package com.spotify.music.libs.voice;

import com.adjust.sdk.Constants;

public enum VoiceSourceElement {
    BROWSE_MIC_BUTTON("search_mic"),
    CAR_MODE_MIC_BUTTON("car_mode_mic"),
    FREE_TIER_HOME("free_tier_home"),
    LONG_PRESS_SEARCH_ICON("long_press_search"),
    SEARCH_MIC_BUTTON("floating_mic"),
    DEEPLINK(Constants.DEEPLINK),
    VOICE_ONBOARDING("onboarding_mic"),
    WAKEWORD("wakeword");
    
    private final String mElementId;

    private VoiceSourceElement(String str) {
        this.mElementId = str;
    }

    public String d() {
        return this.mElementId;
    }
}
