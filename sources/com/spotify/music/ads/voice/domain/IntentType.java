package com.spotify.music.ads.voice.domain;

import java.util.Arrays;
import java.util.Locale;

public enum IntentType {
    PLAY,
    SAVE,
    NO_INTENT;

    public static boolean d(String str, String str2) {
        Locale locale = Locale.US;
        return str != null && Arrays.asList(str2.toLowerCase(locale).split("[-_]")).contains(str.toLowerCase(locale));
    }
}
