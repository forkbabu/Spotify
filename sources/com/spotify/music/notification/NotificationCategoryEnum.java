package com.spotify.music.notification;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONObject;

public enum NotificationCategoryEnum {
    DEFAULT("DEFAULT", "default", "NOTIFICATION_CHANNEL_DEFAULT", SpSharedPreferences.b.e("DEFAULT")),
    RECOMMENDED_MUSIC("RECOMMENDED_MUSIC", "notify-recommended-music", "NOTIFICATION_CHANNEL_RECOMMENDED_MUSIC", SpSharedPreferences.b.e("RECOMMENDED_MUSIC")),
    NEW_MUSIC("NEW_MUSIC", "notify-new-music", "NOTIFICATION_CHANNEL_NEW_MUSIC", SpSharedPreferences.b.e("NEW_MUSIC")),
    PLAYLIST_UPDATES("PLAYLIST_UPDATES", "notify-playlist-updates", "NOTIFICATION_CHANNEL_PLAYLIST_UPDATES", SpSharedPreferences.b.e("PLAYLIST_UPDATES")),
    CONCERT_NOTIFICATIONS("CONCERT_NOTIFICATIONS", "notify-concert-notifications", "NOTIFICATION_CHANNEL_CONCERT_NOTIFICATIONS", SpSharedPreferences.b.e("CONCERT_NOTIFICATIONS")),
    ARTIST_UPDATES("ARTIST_UPDATES", "notify-artist-updates", "NOTIFICATION_CHANNEL_ARTIST_UPDATES", SpSharedPreferences.b.e("ARTIST_UPDATES")),
    PRODUCT_NEWS("PRODUCT_NEWS", "notify-product-news", "NOTIFICATION_CHANNEL_PRODUCT_NEWS", SpSharedPreferences.b.e("PRODUCT_NEWS")),
    NEWS_AND_OFFERS("NEWS_AND_OFFERS", "notify-news-and-offers", "NOTIFICATION_CHANNEL_NEWS_AND_OFFERS", SpSharedPreferences.b.e("NEWS_AND_OFFERS"));
    
    private final SpSharedPreferences.b<Object, JSONObject> mCacheKey;
    private final String mId;
    private final String mOSId;
    private final String mRemoteId;

    private NotificationCategoryEnum(String str, String str2, String str3, SpSharedPreferences.b bVar) {
        this.mRemoteId = str2;
        this.mId = str;
        this.mOSId = str3;
        this.mCacheKey = bVar;
    }

    public static NotificationCategoryEnum fromCacheId(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1912868095:
                if (str.equals("RECOMMENDED_MUSIC")) {
                    c = 0;
                    break;
                }
                break;
            case -1322216643:
                if (str.equals("PLAYLIST_UPDATES")) {
                    c = 1;
                    break;
                }
                break;
            case -933753789:
                if (str.equals("PRODUCT_NEWS")) {
                    c = 2;
                    break;
                }
                break;
            case -850762106:
                if (str.equals("NEW_MUSIC")) {
                    c = 3;
                    break;
                }
                break;
            case 120158731:
                if (str.equals("NEWS_AND_OFFERS")) {
                    c = 4;
                    break;
                }
                break;
            case 880059087:
                if (str.equals("CONCERT_NOTIFICATIONS")) {
                    c = 5;
                    break;
                }
                break;
            case 1047506866:
                if (str.equals("ARTIST_UPDATES")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return RECOMMENDED_MUSIC;
            case 1:
                return PLAYLIST_UPDATES;
            case 2:
                return PRODUCT_NEWS;
            case 3:
                return NEW_MUSIC;
            case 4:
                return NEWS_AND_OFFERS;
            case 5:
                return CONCERT_NOTIFICATIONS;
            case 6:
                return ARTIST_UPDATES;
            default:
                return DEFAULT;
        }
    }

    public static NotificationCategoryEnum fromOSId(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1196752938:
                if (str.equals("NOTIFICATION_CHANNEL_NEW_MUSIC")) {
                    c = 0;
                    break;
                }
                break;
            case -425119501:
                if (str.equals("NOTIFICATION_CHANNEL_PRODUCT_NEWS")) {
                    c = 1;
                    break;
                }
                break;
            case -408304609:
                if (str.equals("NOTIFICATION_CHANNEL_CONCERT_NOTIFICATIONS")) {
                    c = 2;
                    break;
                }
                break;
            case 199612251:
                if (str.equals("NOTIFICATION_CHANNEL_NEWS_AND_OFFERS")) {
                    c = 3;
                    break;
                }
                break;
            case 218785890:
                if (str.equals("NOTIFICATION_CHANNEL_ARTIST_UPDATES")) {
                    c = 4;
                    break;
                }
                break;
            case 1140842477:
                if (str.equals("NOTIFICATION_CHANNEL_PLAYLIST_UPDATES")) {
                    c = 5;
                    break;
                }
                break;
            case 1427520593:
                if (str.equals("NOTIFICATION_CHANNEL_RECOMMENDED_MUSIC")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return NEW_MUSIC;
            case 1:
                return PRODUCT_NEWS;
            case 2:
                return CONCERT_NOTIFICATIONS;
            case 3:
                return NEWS_AND_OFFERS;
            case 4:
                return ARTIST_UPDATES;
            case 5:
                return PLAYLIST_UPDATES;
            case 6:
                return RECOMMENDED_MUSIC;
            default:
                return DEFAULT;
        }
    }

    public static NotificationCategoryEnum fromRemoteId(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1474763089:
                if (str.equals("notify-recommended-music")) {
                    c = 0;
                    break;
                }
                break;
            case -1318328504:
                if (str.equals("notify-artist-updates")) {
                    c = 1;
                    break;
                }
                break;
            case -828406013:
                if (str.equals("notify-news-and-offers")) {
                    c = 2;
                    break;
                }
                break;
            case 203138612:
                if (str.equals("notify-new-music")) {
                    c = 3;
                    break;
                }
                break;
            case 822001277:
                if (str.equals("notify-concert-notifications")) {
                    c = 4;
                    break;
                }
                break;
            case 1331895763:
                if (str.equals("notify-playlist-updates")) {
                    c = 5;
                    break;
                }
                break;
            case 1648494837:
                if (str.equals("notify-product-news")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return RECOMMENDED_MUSIC;
            case 1:
                return ARTIST_UPDATES;
            case 2:
                return NEWS_AND_OFFERS;
            case 3:
                return NEW_MUSIC;
            case 4:
                return CONCERT_NOTIFICATIONS;
            case 5:
                return PLAYLIST_UPDATES;
            case 6:
                return PRODUCT_NEWS;
            default:
                return DEFAULT;
        }
    }

    public SpSharedPreferences.b<Object, JSONObject> getCacheKey() {
        return this.mCacheKey;
    }

    public String getId() {
        return this.mId;
    }

    public String getOSId() {
        return this.mOSId;
    }

    public String getRemoteId() {
        return this.mRemoteId;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("NotificationChannels{mRemoteId='");
        je.A(V0, this.mRemoteId, '\'', ", mId='");
        je.A(V0, this.mId, '\'', ", mOsId='");
        je.A(V0, this.mOSId, '\'', ", mCacheKeyIdentifier=");
        V0.append(this.mCacheKey.a());
        V0.append('}');
        return V0.toString();
    }
}
