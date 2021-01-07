package com.spotify.music.features.navigation;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public enum BottomTab {
    HOME("spotify:home", ViewUris.d),
    FIND("spotify:find", ViewUris.n0),
    LIBRARY("spotify:collection", ViewUris.l1),
    FREE_TIER_YOUR_PLAYLISTS("spotify:playlists", ViewUris.N),
    FREE_TIER_PREMIUM("spotify:upsell:premium_in_app_destination", ViewUris.b1),
    STATIONS_PROMO("spotify:stations-promo", ViewUris.p2),
    VOICE("spotify:voice", ViewUris.f2),
    UNKNOWN("", null);
    
    private final String mRootUri;
    private final c mViewUri;

    private BottomTab(String str, c cVar) {
        this.mRootUri = str;
        this.mViewUri = cVar;
    }

    public String d() {
        return this.mRootUri;
    }

    public c g() {
        return this.mViewUri;
    }
}
