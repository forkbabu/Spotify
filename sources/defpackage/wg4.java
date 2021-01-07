package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: wg4  reason: default package */
public final class wg4 extends ah4 {
    private final String a;
    private final List<ty4> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends ty4> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg4(String str, List<? extends ty4> list) {
        super(null);
        h.e(str, "playlistUri");
        h.e(list, "entitiesToAdd");
        this.a = str;
        this.b = list;
    }

    public final List<ty4> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg4)) {
            return false;
        }
        wg4 wg4 = (wg4) obj;
        return h.a(this.a, wg4.a) && h.a(this.b, wg4.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<ty4> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AddToPlaylist(playlistUri=");
        V0.append(this.a);
        V0.append(", entitiesToAdd=");
        return je.L0(V0, this.b, ")");
    }
}
