package com.spotify.music.features.userplaylistresolver.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.userplaylistresolver.api.c;

/* access modifiers changed from: package-private */
public final class a extends c {
    private final String a;

    /* access modifiers changed from: package-private */
    public static final class b implements c.a {
        private String a;

        b() {
        }

        public c a() {
            String str = this.a == null ? " intentUri" : "";
            if (str.isEmpty()) {
                return new a(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public c.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null intentUri");
        }
    }

    a(String str, C0257a aVar) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).intentUri());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.userplaylistresolver.api.c
    @JsonProperty("intent")
    public String intentUri() {
        return this.a;
    }

    public String toString() {
        return je.I0(je.V0("IntentToUriV1Request{intentUri="), this.a, "}");
    }
}
