package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: b35  reason: default package */
public final class b35 {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final List<j25> e;

    public b35() {
        this(null, null, false, false, null, 31);
    }

    public b35(String str, String str2, boolean z, boolean z2, List<j25> list) {
        h.e(str, "uri");
        h.e(str2, "title");
        h.e(list, "artists");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
    }

    public static b35 a(b35 b35, String str, String str2, boolean z, boolean z2, List list, int i) {
        List<j25> list2 = null;
        String str3 = (i & 1) != 0 ? b35.a : null;
        String str4 = (i & 2) != 0 ? b35.b : null;
        if ((i & 4) != 0) {
            z = b35.c;
        }
        if ((i & 8) != 0) {
            z2 = b35.d;
        }
        if ((i & 16) != 0) {
            list2 = b35.e;
        }
        h.e(str3, "uri");
        h.e(str4, "title");
        h.e(list2, "artists");
        return new b35(str3, str4, z, z2, list2);
    }

    public final List<j25> b() {
        return this.e;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b35)) {
            return false;
        }
        b35 b35 = (b35) obj;
        return h.a(this.a, b35.a) && h.a(this.b, b35.b) && this.c == b35.c && this.d == b35.d && h.a(this.e, b35.e);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.d;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (i6 + i2) * 31;
        List<j25> list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return i7 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Track(uri=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", playing=");
        V0.append(this.c);
        V0.append(", explicit=");
        V0.append(this.d);
        V0.append(", artists=");
        return je.L0(V0, this.e, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b35(java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, java.util.List r9, int r10) {
        /*
            r4 = this;
            r0 = r10 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r5
        L_0x0009:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            r6 = 0
            if (r5 == 0) goto L_0x0016
            r2 = 0
            goto L_0x0017
        L_0x0016:
            r2 = r7
        L_0x0017:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001d
            r3 = 0
            goto L_0x001e
        L_0x001d:
            r3 = r8
        L_0x001e:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0024
            kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.a
        L_0x0024:
            r10 = r9
            r5 = r4
            r6 = r0
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b35.<init>(java.lang.String, java.lang.String, boolean, boolean, java.util.List, int):void");
    }
}
