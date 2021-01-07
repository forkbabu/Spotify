package com.spotify.music.podcast.entity.adapter.episoderow;

import com.spotify.music.podcastentityrow.playback.b;
import com.spotify.playlist.models.offline.a;
import java.util.List;
import kotlin.jvm.internal.h;

public final class j {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final long f;
    private final boolean g;
    private final Restriction h;
    private final boolean i;
    private final PlayState j;
    private final c k;
    private final String l;
    private final boolean m;
    private final int n;
    private final String o;
    private final List<b.C0333b> p;
    private final a q;
    private final boolean r;
    private final AddToYourEpisodesState s;
    private final boolean t;

    public j(String str, String str2, String str3, String str4, long j2, long j3, boolean z, Restriction restriction, boolean z2, PlayState playState, c cVar, String str5, boolean z3, int i2, String str6, List<b.C0333b> list, a aVar, boolean z4, AddToYourEpisodesState addToYourEpisodesState, boolean z5) {
        h.e(str, "title");
        h.e(str3, "description");
        h.e(str4, "publishDateLabel");
        h.e(restriction, "restriction");
        h.e(playState, "playState");
        h.e(cVar, "downloadState");
        h.e(str6, "episodeUri");
        h.e(list, "trackData");
        h.e(aVar, "offlineState");
        h.e(addToYourEpisodesState, "addToYourEpisodesState");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = restriction;
        this.i = z2;
        this.j = playState;
        this.k = cVar;
        this.l = str5;
        this.m = z3;
        this.n = i2;
        this.o = str6;
        this.p = list;
        this.q = aVar;
        this.r = z4;
        this.s = addToYourEpisodesState;
        this.t = z5;
    }

    public final AddToYourEpisodesState a() {
        return this.s;
    }

    public final String b() {
        return this.l;
    }

    public final String c() {
        return this.c;
    }

    public final c d() {
        return this.k;
    }

    public final String e() {
        return this.o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.a(this.a, jVar.a) && h.a(this.b, jVar.b) && h.a(this.c, jVar.c) && h.a(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f && this.g == jVar.g && h.a(this.h, jVar.h) && this.i == jVar.i && h.a(this.j, jVar.j) && h.a(this.k, jVar.k) && h.a(this.l, jVar.l) && this.m == jVar.m && this.n == jVar.n && h.a(this.o, jVar.o) && h.a(this.p, jVar.p) && h.a(this.q, jVar.q) && this.r == jVar.r && h.a(this.s, jVar.s) && this.t == jVar.t;
    }

    public final int f() {
        return this.n;
    }

    public final long g() {
        return this.e;
    }

    public final a h() {
        return this.q;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + e.a(this.e)) * 31) + e.a(this.f)) * 31;
        boolean z = this.g;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode4 + i4) * 31;
        Restriction restriction = this.h;
        int hashCode5 = (i7 + (restriction != null ? restriction.hashCode() : 0)) * 31;
        boolean z2 = this.i;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode5 + i8) * 31;
        PlayState playState = this.j;
        int hashCode6 = (i11 + (playState != null ? playState.hashCode() : 0)) * 31;
        c cVar = this.k;
        int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str5 = this.l;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z3 = this.m;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (((hashCode8 + i12) * 31) + this.n) * 31;
        String str6 = this.o;
        int hashCode9 = (i15 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<b.C0333b> list = this.p;
        int hashCode10 = (hashCode9 + (list != null ? list.hashCode() : 0)) * 31;
        a aVar = this.q;
        int hashCode11 = (hashCode10 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z4 = this.r;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (hashCode11 + i16) * 31;
        AddToYourEpisodesState addToYourEpisodesState = this.s;
        if (addToYourEpisodesState != null) {
            i2 = addToYourEpisodesState.hashCode();
        }
        int i20 = (i19 + i2) * 31;
        boolean z5 = this.t;
        if (!z5) {
            i3 = z5 ? 1 : 0;
        }
        return i20 + i3;
    }

    public final PlayState i() {
        return this.j;
    }

    public final long j() {
        return this.f;
    }

    public final String k() {
        return this.d;
    }

    public final Restriction l() {
        return this.h;
    }

    public final boolean m() {
        return this.t;
    }

    public final String n() {
        return this.b;
    }

    public final String o() {
        return this.a;
    }

    public final List<b.C0333b> p() {
        return this.p;
    }

    public final boolean q() {
        return this.m;
    }

    public final boolean r() {
        return this.i;
    }

    public final boolean s() {
        return this.g;
    }

    public final boolean t() {
        return this.r;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeRowViewModel(title=");
        V0.append(this.a);
        V0.append(", showName=");
        V0.append(this.b);
        V0.append(", description=");
        V0.append(this.c);
        V0.append(", publishDateLabel=");
        V0.append(this.d);
        V0.append(", lengthInMillis=");
        V0.append(this.e);
        V0.append(", progressInMillis=");
        V0.append(this.f);
        V0.append(", isPlayed=");
        V0.append(this.g);
        V0.append(", restriction=");
        V0.append(this.h);
        V0.append(", isPlayable=");
        V0.append(this.i);
        V0.append(", playState=");
        V0.append(this.j);
        V0.append(", downloadState=");
        V0.append(this.k);
        V0.append(", artworkUri=");
        V0.append(this.l);
        V0.append(", isLastItem=");
        V0.append(this.m);
        V0.append(", index=");
        V0.append(this.n);
        V0.append(", episodeUri=");
        V0.append(this.o);
        V0.append(", trackData=");
        V0.append(this.p);
        V0.append(", offlineState=");
        V0.append(this.q);
        V0.append(", isVideo=");
        V0.append(this.r);
        V0.append(", addToYourEpisodesState=");
        V0.append(this.s);
        V0.append(", shouldShowMarkAsPlayed=");
        return je.P0(V0, this.t, ")");
    }
}
