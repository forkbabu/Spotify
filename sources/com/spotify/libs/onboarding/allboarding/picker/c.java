package com.spotify.libs.onboarding.allboarding.picker;

import kotlin.jvm.internal.h;

public final class c {
    private final String a;
    private final boolean b;
    private final String c;

    public c(String str, boolean z, String str2) {
        h.e(str, "label");
        h.e(str2, "postUrl");
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && this.b == cVar.b && h.a(this.c, cVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ActionButton(label=");
        V0.append(this.a);
        V0.append(", isVisible=");
        V0.append(this.b);
        V0.append(", postUrl=");
        return je.I0(V0, this.c, ")");
    }
}
