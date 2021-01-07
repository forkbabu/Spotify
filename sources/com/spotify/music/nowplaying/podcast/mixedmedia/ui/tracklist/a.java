package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.c;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class a {
    private final c a;
    private final boolean b;
    private final f c;
    private final Map<String, CollectionStateProvider.a> d;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(c cVar, boolean z, f fVar, Map<String, ? extends CollectionStateProvider.a> map) {
        h.e(cVar, "trackListModel");
        h.e(fVar, "currentSegment");
        h.e(map, "collectionStateMap");
        this.a = cVar;
        this.b = z;
        this.c = fVar;
        this.d = map;
    }

    public final f a() {
        return this.c;
    }

    public final c b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d(String str) {
        h.e(str, "trackUri");
        CollectionStateProvider.a aVar = this.d.get(str);
        if (aVar != null) {
            return aVar.b();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            return this.b == aVar.b && !(h.a(this.c, aVar.c) ^ true) && !(h.a(this.d, aVar.d) ^ true);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.EnhancedTrackListModel");
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (defpackage.a.a(this.b) * 31)) * 31);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EnhancedTrackListModel(trackListModel=");
        V0.append(this.a);
        V0.append(", isActuallyPlaying=");
        V0.append(this.b);
        V0.append(", currentSegment=");
        V0.append(this.c);
        V0.append(", collectionStateMap=");
        return je.M0(V0, this.d, ")");
    }
}
