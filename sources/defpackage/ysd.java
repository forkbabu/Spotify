package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: ysd  reason: default package */
public final class ysd extends vsd {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ysd(String str) {
        super(null);
        h.e(str, "title");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ysd) && h.a(this.a, ((ysd) obj).a);
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
        return je.I0(je.V0("StringTitle(title="), this.a, ")");
    }
}
