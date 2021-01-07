package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: oh4  reason: default package */
public final class oh4 extends bh4 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oh4(String str) {
        super(null);
        h.e(str, "reason");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof oh4) && h.a(this.a, ((oh4) obj).a);
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
        return je.I0(je.V0("PlaylistUpdateFailed(reason="), this.a, ")");
    }
}
