package com.spotify.music.libs.partnerapps;

import com.spotify.music.C0707R;

public enum PartnerType {
    GOOGLE_MAPS(C0707R.string.navigation_app_name_googlemaps, "google_maps", "com.google.android.apps.maps", "http://maps.google.com/maps"),
    WAZE(C0707R.string.navigation_app_name_waze, "waze", "com.waze", "waze://spotifysdk/"),
    ALEXA(C0707R.string.voice_assistants_app_name_alexa, "alexa", "", ""),
    UNKNOWN(0, "unknown", "", "");
    
    private final boolean mIsWhitelisted = false;
    private final String mPackageName;
    private final String mPartnerIntegrationId;
    private final int mPartnerName;
    private final String mRedirectUri;

    private PartnerType(int i, String str, String str2, String str3) {
        this.mPartnerName = i;
        this.mPartnerIntegrationId = str;
        this.mPackageName = str2;
        this.mRedirectUri = str3;
    }

    public static PartnerType k(String str) {
        PartnerType partnerType = GOOGLE_MAPS;
        if (partnerType.mPartnerIntegrationId.equals(str)) {
            return partnerType;
        }
        PartnerType partnerType2 = WAZE;
        if (partnerType2.mPartnerIntegrationId.equals(str)) {
            return partnerType2;
        }
        PartnerType partnerType3 = ALEXA;
        if (partnerType3.mPartnerIntegrationId.equals(str)) {
            return partnerType3;
        }
        return UNKNOWN;
    }

    public String d() {
        return this.mPackageName;
    }

    public String g() {
        return this.mPartnerIntegrationId;
    }

    public String h() {
        return this.mRedirectUri;
    }

    public boolean i() {
        return this.mIsWhitelisted;
    }
}
