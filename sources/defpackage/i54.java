package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: i54  reason: default package */
public final class i54 extends s44 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i54(String str) {
        super(null);
        h.e(str, "uri");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i54) && h.a(this.a, ((i54) obj).a);
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
        return je.I0(je.V0("NavigateToUri(uri="), this.a, ")");
    }
}
