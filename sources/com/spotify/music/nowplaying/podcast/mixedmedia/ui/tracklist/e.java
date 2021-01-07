package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import kotlin.jvm.internal.h;

public final class e {
    private final a a;
    private final c b;

    public e(a aVar, c cVar) {
        h.e(aVar, "enhancedTrackListModel");
        h.e(cVar, "trackListItemViewModel");
        this.a = aVar;
        this.b = cVar;
    }

    public final a a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final c c() {
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
        return h.a(this.a, eVar.a) && h.a(this.b, eVar.b);
    }

    public int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        c cVar = this.b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListModels(enhancedTrackListModel=");
        V0.append(this.a);
        V0.append(", trackListItemViewModel=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
