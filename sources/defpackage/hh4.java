package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: hh4  reason: default package */
public final class hh4 extends ah4 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh4(String str) {
        super(null);
        h.e(str, "previewId");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hh4) && h.a(this.a, ((hh4) obj).a);
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
        return je.I0(je.V0("PausePreview(previewId="), this.a, ")");
    }
}
