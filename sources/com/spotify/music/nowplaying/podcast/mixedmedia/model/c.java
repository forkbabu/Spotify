package com.spotify.music.nowplaying.podcast.mixedmedia.model;

import java.util.List;
import kotlin.jvm.internal.h;

public final class c {
    private final a a;
    private final String b;
    private final List<b> c;
    private final boolean d;

    public c(a aVar, String str, List<b> list, boolean z) {
        h.e(aVar, "episodeUri");
        h.e(str, "episodeName");
        h.e(list, "trackListItems");
        this.a = aVar;
        this.b = str;
        this.c = list;
        this.d = z;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final a c() {
        return this.a;
    }

    public final List<b> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && this.d == cVar.d;
    }

    public int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<b> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListModel(episodeUri=");
        V0.append(this.a);
        V0.append(", episodeName=");
        V0.append(this.b);
        V0.append(", trackListItems=");
        V0.append(this.c);
        V0.append(", canUpsell=");
        return je.P0(V0, this.d, ")");
    }
}
