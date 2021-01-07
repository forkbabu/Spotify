package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class a extends e {
    private final List<LocalSourceJacksonModel> a;

    a(List<LocalSourceJacksonModel> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null sources");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.a.equals(((e) obj).sources());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.localfilesimport.model.e
    @JsonProperty("sources")
    public List<LocalSourceJacksonModel> sources() {
        return this.a;
    }

    public String toString() {
        return je.L0(je.V0("LocalSourcesRequest{sources="), this.a, "}");
    }
}
