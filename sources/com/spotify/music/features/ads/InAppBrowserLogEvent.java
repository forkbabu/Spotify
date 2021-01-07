package com.spotify.music.features.ads;

import java.util.Locale;

public enum InAppBrowserLogEvent {
    OPENED,
    CLOSED,
    PAGE_LOADED,
    ERROR;

    public String d() {
        return name().toLowerCase(Locale.US);
    }
}
