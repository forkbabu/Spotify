package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import kotlin.jvm.internal.h;

public final class b extends a {
    private final a09 a;
    private final a09 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a09 a09, a09 a092) {
        super(null);
        h.e(a09, "title");
        this.a = a09;
        this.b = a092;
    }

    public final a09 a() {
        return this.b;
    }

    public final a09 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
    }

    public int hashCode() {
        a09 a09 = this.a;
        int i = 0;
        int hashCode = (a09 != null ? a09.hashCode() : 0) * 31;
        a09 a092 = this.b;
        if (a092 != null) {
            i = a092.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Teaser(title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
