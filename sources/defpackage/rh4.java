package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: rh4  reason: default package */
public final class rh4 extends ah4 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh4(String str) {
        super(null);
        h.e(str, "playlistUri");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof rh4) && h.a(this.a, ((rh4) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("SavePlaylistUri(playlistUri="), this.a, ")");
    }
}
