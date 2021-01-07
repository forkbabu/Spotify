package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import java.util.List;
import kotlin.jvm.internal.h;

public final class d extends a {
    private final yz8 a;
    private final List<c> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(yz8 yz8, List<c> list) {
        super(null);
        h.e(yz8, "title");
        h.e(list, "topFiveList");
        this.a = yz8;
        this.b = list;
    }

    public final yz8 a() {
        return this.a;
    }

    public final List<c> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && h.a(this.b, dVar.b);
    }

    public int hashCode() {
        yz8 yz8 = this.a;
        int i = 0;
        int hashCode = (yz8 != null ? yz8.hashCode() : 0) * 31;
        List<c> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TopFiveList(title=");
        V0.append(this.a);
        V0.append(", topFiveList=");
        return je.L0(V0, this.b, ")");
    }
}
