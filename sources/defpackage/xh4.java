package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: xh4  reason: default package */
public final class xh4 extends ah4 {
    private final String a;
    private final String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xh4(String str, String str2) {
        super(null);
        h.e(str, "playlistUri");
        h.e(str2, "entityUri");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh4)) {
            return false;
        }
        xh4 xh4 = (xh4) obj;
        return h.a(this.a, xh4.a) && h.a(this.b, xh4.b);
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
        StringBuilder V0 = je.V0("UndoRemoveItem(playlistUri=");
        V0.append(this.a);
        V0.append(", entityUri=");
        return je.I0(V0, this.b, ")");
    }
}
