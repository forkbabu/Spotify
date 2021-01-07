package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: ug4  reason: default package */
public final class ug4 extends ah4 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ug4(String str) {
        super(null);
        h.e(str, "playlistUri");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ug4) && h.a(this.a, ((ug4) obj).a);
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
        return je.I0(je.V0("AddPlaylistToLibrary(playlistUri="), this.a, ")");
    }
}
