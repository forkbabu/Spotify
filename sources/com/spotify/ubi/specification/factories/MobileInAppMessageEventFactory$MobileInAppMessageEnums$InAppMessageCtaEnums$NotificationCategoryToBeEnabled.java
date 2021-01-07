package com.spotify.ubi.specification.factories;

public enum MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled {
    ARTIST_UPDATES("artist_updates"),
    CONCERT_NOTIFICATIONS("concert_notifications"),
    NEW_MUSIC("new_music"),
    NEWS_AND_OFFERS("news_and_offers"),
    PLAYLIST_UPDATES("playlist_updates"),
    PRODUCT_NEWS("product_news"),
    RECOMMENDED_MUSIC("recommended_music");
    
    public final String value;

    private MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled(String str) {
        this.value = str;
    }
}
