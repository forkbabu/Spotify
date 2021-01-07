package com.spotify.libs.onboarding.allboarding.room;

import kotlin.jvm.internal.h;

public final class v {
    private final String a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;

    public v(String str, long j, String str2, String str3, String str4, int i) {
        h.e(str, "sectionId");
        h.e(str2, "adapterType");
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.f;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return h.a(this.a, vVar.a) && this.b == vVar.b && h.a(this.c, vVar.c) && h.a(this.d, vVar.d) && h.a(this.e, vVar.e) && this.f == vVar.f;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + e.a(this.b)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Section(sectionId=");
        V0.append(this.a);
        V0.append(", pickerStepDataId=");
        V0.append(this.b);
        V0.append(", adapterType=");
        V0.append(this.c);
        V0.append(", sectionTitle=");
        V0.append(this.d);
        V0.append(", sectionSubtitle=");
        V0.append(this.e);
        V0.append(", sectionOrder=");
        return je.B0(V0, this.f, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(String str, long j, String str2, String str3, String str4, int i, int i2) {
        this(str, j, str2, null, null, i);
        int i3 = i2 & 8;
        int i4 = i2 & 16;
    }
}
