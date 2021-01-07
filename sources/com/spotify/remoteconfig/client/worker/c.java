package com.spotify.remoteconfig.client.worker;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class c {
    private final int a;
    private final TimeUnit b;
    private final int c;
    private final TimeUnit d;

    public c(int i, TimeUnit timeUnit, int i2, TimeUnit timeUnit2) {
        h.f(timeUnit, "repeatIntervalTimeUnit");
        h.f(timeUnit2, "flexIntervalTimeUnit");
        this.a = i;
        this.b = timeUnit;
        this.c = i2;
        this.d = timeUnit2;
    }

    public final int a() {
        return this.c;
    }

    public final TimeUnit b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final TimeUnit d() {
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
        return this.a == cVar.a && h.a(this.b, cVar.b) && this.c == cVar.c && h.a(this.d, cVar.d);
    }

    public int hashCode() {
        int i = this.a * 31;
        TimeUnit timeUnit = this.b;
        int i2 = 0;
        int hashCode = (((i + (timeUnit != null ? timeUnit.hashCode() : 0)) * 31) + this.c) * 31;
        TimeUnit timeUnit2 = this.d;
        if (timeUnit2 != null) {
            i2 = timeUnit2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("WorkerInterval(repeatInterval=");
        V0.append(this.a);
        V0.append(", repeatIntervalTimeUnit=");
        V0.append(this.b);
        V0.append(", flexInterval=");
        V0.append(this.c);
        V0.append(", flexIntervalTimeUnit=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
