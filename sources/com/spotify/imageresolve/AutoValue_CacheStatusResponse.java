package com.spotify.imageresolve;

import com.spotify.imageresolve.CacheStatusResponse;
import java.util.List;

final class AutoValue_CacheStatusResponse extends CacheStatusResponse {
    private final List<CacheStatusResponse.Entry> result;

    AutoValue_CacheStatusResponse(List<CacheStatusResponse.Entry> list) {
        if (list != null) {
            this.result = list;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CacheStatusResponse) {
            return this.result.equals(((CacheStatusResponse) obj).result());
        }
        return false;
    }

    public int hashCode() {
        return this.result.hashCode() ^ 1000003;
    }

    @Override // com.spotify.imageresolve.CacheStatusResponse
    public List<CacheStatusResponse.Entry> result() {
        return this.result;
    }

    public String toString() {
        return je.L0(je.V0("CacheStatusResponse{result="), this.result, "}");
    }
}
