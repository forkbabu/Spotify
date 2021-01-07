package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: w37  reason: default package */
public final class w37 {
    private final x37 a;
    private final String b;
    private final qyd c;

    public w37(x37 x37, String str, qyd qyd) {
        h.e(x37, "state");
        h.e(str, "searchText");
        h.e(qyd, "show");
        this.a = x37;
        this.b = str;
        this.c = qyd;
    }

    public static w37 a(w37 w37, x37 x37, String str, qyd qyd, int i) {
        if ((i & 1) != 0) {
            x37 = w37.a;
        }
        qyd qyd2 = null;
        String str2 = (i & 2) != 0 ? w37.b : null;
        if ((i & 4) != 0) {
            qyd2 = w37.c;
        }
        h.e(x37, "state");
        h.e(str2, "searchText");
        h.e(qyd2, "show");
        return new w37(x37, str2, qyd2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w37)) {
            return false;
        }
        w37 w37 = (w37) obj;
        return h.a(this.a, w37.a) && h.a(this.b, w37.b) && h.a(this.c, w37.c);
    }

    public int hashCode() {
        x37 x37 = this.a;
        int i = 0;
        int hashCode = (x37 != null ? x37.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        qyd qyd = this.c;
        if (qyd != null) {
            i = qyd.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FindInShowModel(state=");
        V0.append(this.a);
        V0.append(", searchText=");
        V0.append(this.b);
        V0.append(", show=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
