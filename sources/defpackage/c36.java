package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
/* renamed from: c36  reason: default package */
public final class c36 extends d36 {
    private final String a;

    c36(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null playlistUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d36) {
            return this.a.equals(((d36) obj).playlistUri());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // defpackage.d36
    @JsonProperty("playlist_uri")
    public String playlistUri() {
        return this.a;
    }

    public String toString() {
        return je.I0(je.V0("BlendLeaveRequest{playlistUri="), this.a, "}");
    }
}
