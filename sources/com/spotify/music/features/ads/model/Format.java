package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum Format implements JacksonModel {
    AUDIO("audio"),
    BANNER("banner"),
    VIDEO("video");
    
    private static final Map<String, Format> sNameMap = new HashMap(3);
    private final String mName;

    static {
        Iterator it = EnumSet.allOf(Format.class).iterator();
        while (it.hasNext()) {
            Format format = (Format) it.next();
            sNameMap.put(format.getName(), format);
        }
    }

    private Format(String str) {
        this.mName = str;
    }

    public static Format getByName(String str) {
        return sNameMap.get(str);
    }

    public String getCosmosEndpoint() {
        StringBuilder V0 = je.V0("sp://ads/v1/formats/");
        V0.append(getName());
        return V0.toString();
    }

    @JsonValue
    public String getName() {
        return this.mName;
    }
}
