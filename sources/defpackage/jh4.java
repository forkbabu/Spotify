package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: jh4  reason: default package */
public final class jh4 extends ah4 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jh4(String str) {
        super(null);
        h.e(str, "previewId");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof jh4) && h.a(this.a, ((jh4) obj).a);
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
        return je.I0(je.V0("PlayPreview(previewId="), this.a, ")");
    }
}
