package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum AdBreakState implements JacksonModel {
    IDLE("idle"),
    IN_PROGRESS("in_progress"),
    PENDING("pending");
    
    private static final Map<String, AdBreakState> sNameMap = new HashMap();
    private final String mName;

    static {
        Iterator it = EnumSet.allOf(AdBreakState.class).iterator();
        while (it.hasNext()) {
            AdBreakState adBreakState = (AdBreakState) it.next();
            sNameMap.put(adBreakState.getName(), adBreakState);
        }
    }

    private AdBreakState(String str) {
        this.mName = str;
    }

    public static AdBreakState getByName(String str) {
        return sNameMap.get(str);
    }

    @JsonValue
    public String getName() {
        return this.mName;
    }
}
