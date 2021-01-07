package com.spotify.music.follow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class h extends p {
    private final List<String> a;

    h(List<String> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null targetUris");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.a.equals(((p) obj).targetUris());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.follow.p
    @JsonProperty("target_uris")
    public List<String> targetUris() {
        return this.a;
    }

    public String toString() {
        return je.L0(je.V0("TargetUris{targetUris="), this.a, "}");
    }
}
