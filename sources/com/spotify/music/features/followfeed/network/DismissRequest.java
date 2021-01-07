package com.spotify.music.features.followfeed.network;

import androidx.annotation.Keep;
import kotlin.jvm.internal.h;

@Keep
public final class DismissRequest {
    private final String uri;

    public DismissRequest(String str) {
        h.e(str, "uri");
        this.uri = str;
    }

    public static /* synthetic */ DismissRequest copy$default(DismissRequest dismissRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dismissRequest.uri;
        }
        return dismissRequest.copy(str);
    }

    public final String component1() {
        return this.uri;
    }

    public final DismissRequest copy(String str) {
        h.e(str, "uri");
        return new DismissRequest(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DismissRequest) && h.a(this.uri, ((DismissRequest) obj).uri);
        }
        return true;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("DismissRequest(uri="), this.uri, ")");
    }
}
