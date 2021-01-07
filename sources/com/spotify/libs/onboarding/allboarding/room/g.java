package com.spotify.libs.onboarding.allboarding.room;

import kotlin.jvm.internal.h;

public final class g {
    private final String a;
    private final Long b = null;

    public g(String str, Long l, int i) {
        int i2 = i & 2;
        h.e(str, "sessionId");
        this.a = str;
    }

    public final Long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.a(this.a, gVar.a) && h.a(this.b, gVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("OnboardingSession(sessionId=");
        V0.append(this.a);
        V0.append(", currentStepId=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
