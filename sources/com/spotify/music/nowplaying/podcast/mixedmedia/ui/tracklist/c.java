package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import com.spotify.music.nowplaying.podcast.mixedmedia.model.TrackListItemType;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.a;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class c {
    private final a a;
    private final String b;
    private final String c;
    private final TrackListItemType d;
    private final String e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final long i;
    private final boolean j;
    private final boolean k;

    public c(a aVar, String str, String str2, TrackListItemType trackListItemType, String str3, String str4, boolean z, boolean z2, long j2, boolean z3, boolean z4) {
        h.e(aVar, "episodeUri");
        h.e(str, "trackUri");
        h.e(str2, "imageUri");
        h.e(trackListItemType, "itemType");
        h.e(str3, "title");
        h.e(str4, ContextTrack.Metadata.KEY_SUBTITLE);
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = trackListItemType;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = j2;
        this.j = z3;
        this.k = z4;
    }

    public final boolean a() {
        return this.k;
    }

    public final a b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final TrackListItemType d() {
        return this.d;
    }

    public final long e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && h.a(this.d, cVar.d) && h.a(this.e, cVar.e) && h.a(this.f, cVar.f) && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        a aVar = this.a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        TrackListItemType trackListItemType = this.d;
        int hashCode4 = (hashCode3 + (trackListItemType != null ? trackListItemType.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = (hashCode5 + i2) * 31;
        boolean z = this.g;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        boolean z2 = this.h;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int a2 = (((i8 + i9) * 31) + e.a(this.i)) * 31;
        boolean z3 = this.j;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (a2 + i12) * 31;
        boolean z4 = this.k;
        if (!z4) {
            i4 = z4 ? 1 : 0;
        }
        return i15 + i4;
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.h;
    }

    public final boolean k() {
        return this.g;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListItemViewModel(episodeUri=");
        V0.append(this.a);
        V0.append(", trackUri=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", itemType=");
        V0.append(this.d);
        V0.append(", title=");
        V0.append(this.e);
        V0.append(", subtitle=");
        V0.append(this.f);
        V0.append(", isSelected=");
        V0.append(this.g);
        V0.append(", isPlaying=");
        V0.append(this.h);
        V0.append(", startTimeMs=");
        V0.append(this.i);
        V0.append(", isInCollection=");
        V0.append(this.j);
        V0.append(", canUpsell=");
        return je.P0(V0, this.k, ")");
    }
}
