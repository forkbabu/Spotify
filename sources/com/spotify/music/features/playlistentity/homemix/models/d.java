package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import java.util.List;

/* access modifiers changed from: package-private */
public final class d extends HomeMixTuning {
    private final String a;
    private final List<String> b;

    /* access modifiers changed from: package-private */
    public static final class b implements HomeMixTuning.a {
        private String a;
        private List<String> b;

        b() {
        }

        public HomeMixTuning.a a(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null blacklist");
        }

        public HomeMixTuning b() {
            String str = this.a == null ? " style" : "";
            if (this.b == null) {
                str = je.x0(str, " blacklist");
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public HomeMixTuning.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null style");
        }
    }

    d(String str, List list, a aVar) {
        this.a = str;
        this.b = list;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning
    @JsonProperty("member_blacklist")
    public List<String> blacklist() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeMixTuning)) {
            return false;
        }
        HomeMixTuning homeMixTuning = (HomeMixTuning) obj;
        if (!this.a.equals(homeMixTuning.style()) || !this.b.equals(homeMixTuning.blacklist())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning
    @JsonProperty("style")
    public String style() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMixTuning{style=");
        V0.append(this.a);
        V0.append(", blacklist=");
        return je.L0(V0, this.b, "}");
    }
}
