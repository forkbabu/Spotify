package com.spotify.mobile.android.hubframework.defaults;

import java.util.Locale;

public enum HubsComponentCategory {
    CARD,
    HEADER,
    ROW,
    SECTION_HEADER,
    SPINNER;
    
    private final String mId = name().toLowerCase(Locale.US);

    private HubsComponentCategory() {
    }

    public String d() {
        return this.mId;
    }
}
