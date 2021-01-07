package com.spotify.imageresolve;

import com.fasterxml.jackson.annotation.JsonGetter;

/* access modifiers changed from: package-private */
public final class AutoValue_CacheStatusRequest extends CacheStatusRequest {
    private final Iterable<String> uris;

    AutoValue_CacheStatusRequest(Iterable<String> iterable) {
        if (iterable != null) {
            this.uris = iterable;
            return;
        }
        throw new NullPointerException("Null uris");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CacheStatusRequest) {
            return this.uris.equals(((CacheStatusRequest) obj).uris());
        }
        return false;
    }

    public int hashCode() {
        return this.uris.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CacheStatusRequest{uris=");
        V0.append(this.uris);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.imageresolve.CacheStatusRequest
    @JsonGetter("uris")
    public Iterable<String> uris() {
        return this.uris;
    }
}
