package com.spotify.music.features.preloadnotification.conditions;

enum PreloadedPartner {
    SAMSUNG("samsung-mobile-preload");
    
    private static final PreloadedPartner[] b = values();
    private final String mPartnerName;

    private PreloadedPartner(String str) {
        this.mPartnerName = str;
    }

    static boolean d(String str) {
        for (PreloadedPartner preloadedPartner : b) {
            if (str.equals(preloadedPartner.mPartnerName)) {
                return true;
            }
        }
        return false;
    }
}
