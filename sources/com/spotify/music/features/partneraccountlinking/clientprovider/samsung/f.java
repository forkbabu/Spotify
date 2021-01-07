package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class f {
    @JsonCreator
    public static f create(@JsonProperty("partners") Map<String, Object> map) {
        return new e(map);
    }

    /* access modifiers changed from: package-private */
    @JsonProperty("partners")
    public abstract Map<String, Object> partners();
}
