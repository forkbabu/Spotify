package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: dt8  reason: default package */
public final class dt8 {
    private final rqe a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;

    public dt8(rqe rqe, int i, String str, String str2, String str3) {
        h.e(rqe, "ubiEventLocation");
        h.e(str, "targetUri");
        h.e(str2, "sectionId");
        h.e(str3, "requestId");
        this.a = rqe;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final rqe e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt8)) {
            return false;
        }
        dt8 dt8 = (dt8) obj;
        return h.a(this.a, dt8.a) && this.b == dt8.b && h.a(this.c, dt8.c) && h.a(this.d, dt8.d) && h.a(this.e, dt8.e);
    }

    public int hashCode() {
        rqe rqe = this.a;
        int i = 0;
        int hashCode = (((rqe != null ? rqe.hashCode() : 0) * 31) + this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoggingData(ubiEventLocation=");
        V0.append(this.a);
        V0.append(", position=");
        V0.append(this.b);
        V0.append(", targetUri=");
        V0.append(this.c);
        V0.append(", sectionId=");
        V0.append(this.d);
        V0.append(", requestId=");
        return je.I0(V0, this.e, ")");
    }
}
