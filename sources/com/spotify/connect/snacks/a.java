package com.spotify.connect.snacks;

import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final String b;
    private final boolean c;

    public a(String str, String str2, boolean z) {
        h.e(str, "name");
        h.e(str2, "cosmosId");
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AvailableDevice(name=");
        V0.append(this.a);
        V0.append(", cosmosId=");
        V0.append(this.b);
        V0.append(", isActive=");
        return je.P0(V0, this.c, ")");
    }
}
