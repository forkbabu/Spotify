package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import kotlin.jvm.internal.h;

public final class e {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final String f;

    public e(int i, int i2, int i3, int i4, int i5, String str) {
        h.e(str, "shareScheme");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = str;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && h.a(this.f, eVar.f);
    }

    public final String f() {
        return this.f;
    }

    public int hashCode() {
        int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        String str = this.f;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SummaryShareColorSchemes(primaryTextColor=");
        V0.append(this.a);
        V0.append(", secondaryTextColor=");
        V0.append(this.b);
        V0.append(", footerTextColor=");
        V0.append(this.c);
        V0.append(", backgroundColor=");
        V0.append(this.d);
        V0.append(", footerBackgroundColor=");
        V0.append(this.e);
        V0.append(", shareScheme=");
        return je.I0(V0, this.f, ")");
    }
}
