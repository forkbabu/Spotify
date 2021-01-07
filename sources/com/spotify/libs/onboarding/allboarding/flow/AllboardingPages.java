package com.spotify.libs.onboarding.allboarding.flow;

public enum AllboardingPages {
    LOADING("spotify:internal:allboarding:loading"),
    PICKER("spotify:internal:allboarding:picker"),
    SEARCH("spotify:internal:allboarding:search"),
    SEND("spotify:internal:allboarding:send");
    
    private final String url;

    private AllboardingPages(String str) {
        this.url = str;
    }

    public final String d() {
        return this.url;
    }
}
