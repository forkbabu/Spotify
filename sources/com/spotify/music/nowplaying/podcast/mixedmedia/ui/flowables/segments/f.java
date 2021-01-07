package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments;

import com.spotify.music.nowplaying.podcast.mixedmedia.model.b;
import defpackage.j1c;
import kotlin.jvm.internal.h;

public final class f {
    private final b a;
    private final int b;
    private final j1c.a c;
    private final j1c.b.C0628b d;
    private final m1c e;

    public f(b bVar, int i, j1c.a aVar, j1c.b.C0628b bVar2, m1c m1c) {
        h.e(bVar, "itemModel");
        h.e(aVar, "physicalStartPosition");
        h.e(bVar2, "playbackStartPosition");
        h.e(m1c, "sizeAndCoefficient");
        this.a = bVar;
        this.b = i;
        this.c = aVar;
        this.d = bVar2;
        this.e = m1c;
    }

    public final int a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public final j1c.a c() {
        return this.c;
    }

    public final j1c.b.C0628b d() {
        return this.d;
    }

    public final m1c e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && this.b == fVar.b && h.a(this.c, fVar.c) && h.a(this.d, fVar.d) && h.a(this.e, fVar.e);
    }

    public int hashCode() {
        b bVar = this.a;
        int i = 0;
        int hashCode = (((bVar != null ? bVar.hashCode() : 0) * 31) + this.b) * 31;
        j1c.a aVar = this.c;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        j1c.b.C0628b bVar2 = this.d;
        int hashCode3 = (hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        m1c m1c = this.e;
        if (m1c != null) {
            i = m1c.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TimeLineSegment(itemModel=");
        V0.append(this.a);
        V0.append(", index=");
        V0.append(this.b);
        V0.append(", physicalStartPosition=");
        V0.append(this.c);
        V0.append(", playbackStartPosition=");
        V0.append(this.d);
        V0.append(", sizeAndCoefficient=");
        V0.append(this.e);
        V0.append(")");
        return V0.toString();
    }
}
