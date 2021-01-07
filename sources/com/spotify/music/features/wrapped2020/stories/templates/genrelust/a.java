package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import kotlin.jvm.internal.h;

public final class a {
    private final int a;
    private final yz8 b;
    private final yz8 c;

    public a(int i, yz8 yz8, yz8 yz82) {
        h.e(yz8, "topLabel");
        h.e(yz82, "bottomLabel");
        this.a = i;
        this.b = yz8;
        this.c = yz82;
    }

    public final yz8 a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final yz8 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && h.a(this.b, aVar.b) && h.a(this.c, aVar.c);
    }

    public int hashCode() {
        int i = this.a * 31;
        yz8 yz8 = this.b;
        int i2 = 0;
        int hashCode = (i + (yz8 != null ? yz8.hashCode() : 0)) * 31;
        yz8 yz82 = this.c;
        if (yz82 != null) {
            i2 = yz82.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BlobData(color=");
        V0.append(this.a);
        V0.append(", topLabel=");
        V0.append(this.b);
        V0.append(", bottomLabel=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
