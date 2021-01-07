package com.spotify.libs.onboarding.allboarding.flow;

import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final long b;

    public a(String str, long j) {
        h.e(str, "sessionId");
        this.a = str;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + e.a(this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Destination(sessionId=");
        V0.append(this.a);
        V0.append(", screenDataId=");
        return je.E0(V0, this.b, ")");
    }
}
