package com.spotify.music.features.ads.api;

import io.reactivex.a;
import java.util.Locale;
import java.util.Map;

public interface SlotApi {

    public enum Intent {
        NOW("now"),
        NEXT_CONTEXT("next_context"),
        NEXT_TRACK("next_track"),
        FETCH("fetch"),
        CLEAR("clear");
        
        private final String mName;

        private Intent(String str) {
            this.mName = str;
        }

        public String d() {
            return this.mName.toLowerCase(Locale.US);
        }
    }

    a a(String str, Intent intent);

    a b(String str, Intent intent, Map<String, String> map);
}
