package com.spotify.mobile.android.quotesharing;

import kotlin.jvm.internal.h;

public final class b {
    private final String a;
    private final long b;
    private final String c;
    private final String d;
    private final a e;

    public b(String str, long j, String str2, String str3, a aVar) {
        h.e(str, "attribution");
        h.e(str2, "imageUri");
        h.e(str3, "loggingUri");
        h.e(aVar, "shareData");
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = aVar;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final a c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && this.b == bVar.b && h.a(this.c, bVar.c) && h.a(this.d, bVar.d) && h.a(this.e, bVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + e.a(this.b)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        a aVar = this.e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("QuoteCardViewModel(attribution=");
        V0.append(this.a);
        V0.append(", timestampMs=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", loggingUri=");
        V0.append(this.d);
        V0.append(", shareData=");
        V0.append(this.e);
        V0.append(")");
        return V0.toString();
    }
}
