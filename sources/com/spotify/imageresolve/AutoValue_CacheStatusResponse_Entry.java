package com.spotify.imageresolve;

import com.spotify.imageresolve.CacheStatusResponse;

final class AutoValue_CacheStatusResponse_Entry extends CacheStatusResponse.Entry {
    private final boolean cached;
    private final String uri;

    AutoValue_CacheStatusResponse_Entry(String str, boolean z) {
        if (str != null) {
            this.uri = str;
            this.cached = z;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.imageresolve.CacheStatusResponse.Entry
    public boolean cached() {
        return this.cached;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CacheStatusResponse.Entry)) {
            return false;
        }
        CacheStatusResponse.Entry entry = (CacheStatusResponse.Entry) obj;
        if (!this.uri.equals(entry.uri()) || this.cached != entry.cached()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.uri.hashCode() ^ 1000003) * 1000003) ^ (this.cached ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Entry{uri=");
        V0.append(this.uri);
        V0.append(", cached=");
        return je.P0(V0, this.cached, "}");
    }

    @Override // com.spotify.imageresolve.CacheStatusResponse.Entry
    public String uri() {
        return this.uri;
    }
}
