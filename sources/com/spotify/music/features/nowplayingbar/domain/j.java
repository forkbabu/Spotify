package com.spotify.music.features.nowplayingbar.domain;

import kotlin.jvm.internal.h;

public final class j {
    private final Track a;
    private final Track b;
    private final Track c;

    public j(Track track, Track track2, Track track3) {
        h.e(track2, "current");
        this.a = track;
        this.b = track2;
        this.c = track3;
    }

    public final Track a() {
        return this.b;
    }

    public final Track b() {
        return this.c;
    }

    public final Track c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.a(this.a, jVar.a) && h.a(this.b, jVar.b) && h.a(this.c, jVar.c);
    }

    public int hashCode() {
        Track track = this.a;
        int i = 0;
        int hashCode = (track != null ? track.hashCode() : 0) * 31;
        Track track2 = this.b;
        int hashCode2 = (hashCode + (track2 != null ? track2.hashCode() : 0)) * 31;
        Track track3 = this.c;
        if (track3 != null) {
            i = track3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Tracks(previous=");
        V0.append(this.a);
        V0.append(", current=");
        V0.append(this.b);
        V0.append(", next=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
