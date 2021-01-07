package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: eh4  reason: default package */
public final class eh4 extends ah4 {
    private final String a;
    private final String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eh4(String str, String str2) {
        super(null);
        h.e(str, "playlistUri");
        h.e(str2, "rowId");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh4)) {
            return false;
        }
        eh4 eh4 = (eh4) obj;
        return h.a(this.a, eh4.a) && h.a(this.b, eh4.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DeletePlaylistTrack(playlistUri=");
        V0.append(this.a);
        V0.append(", rowId=");
        return je.I0(V0, this.b, ")");
    }
}
