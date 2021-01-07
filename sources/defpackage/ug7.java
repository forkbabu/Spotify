package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: ug7  reason: default package */
public final class ug7 extends ag7 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ug7(String str) {
        super(null);
        h.e(str, "showUri");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ug7) && h.a(this.a, ((ug7) obj).a);
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
        return je.I0(je.V0("UnfollowEvent(showUri="), this.a, ")");
    }
}
