package com.spotify.music.navigation;

public interface NavigationItem {

    public enum NavigationGroup {
        NONE,
        HOME,
        FIND,
        COLLECTION,
        FREE_TIER_COLLECTION,
        PREMIUM,
        ONE_TAP_BROWSE,
        STATIONS_PROMO,
        VOICE;

        static {
            values();
        }
    }

    NavigationGroup k0();
}
