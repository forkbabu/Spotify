package com.spotify.music.nowplaying.podcast.mixedmedia.model;

import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    private final a a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;
    private final TrackListItemType f;
    private final List<String> g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    public b(a aVar, String str, String str2, long j2, long j3, TrackListItemType trackListItemType, List<String> list, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        h.e(aVar, "episodeUri");
        h.e(str, "trackUri");
        h.e(trackListItemType, "segmentType");
        h.e(list, "artistNames");
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = j3;
        this.f = trackListItemType;
        this.g = list;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
    }

    public final List<String> a() {
        return this.g;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.n;
    }

    public final String d() {
        return this.k;
    }

    public final a e() {
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
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && h.a(this.f, bVar.f) && h.a(this.g, bVar.g) && h.a(this.h, bVar.h) && h.a(this.i, bVar.i) && h.a(this.j, bVar.j) && h.a(this.k, bVar.k) && h.a(this.l, bVar.l) && h.a(this.m, bVar.m) && h.a(this.n, bVar.n);
    }

    public final String f() {
        return this.l;
    }

    public final String g() {
        return this.i;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        a aVar = this.a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + e.a(this.d)) * 31) + e.a(this.e)) * 31;
        TrackListItemType trackListItemType = this.f;
        int hashCode4 = (hashCode3 + (trackListItemType != null ? trackListItemType.hashCode() : 0)) * 31;
        List<String> list = this.g;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.h;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.i;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.j;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.k;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.l;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.m;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.n;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return hashCode11 + i2;
    }

    public final TrackListItemType i() {
        return this.f;
    }

    public final long j() {
        return this.d;
    }

    public final long k() {
        return this.e;
    }

    public final String l() {
        return this.m;
    }

    public final String m() {
        return this.j;
    }

    public final String n() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListItemModel(episodeUri=");
        V0.append(this.a);
        V0.append(", trackUri=");
        V0.append(this.b);
        V0.append(", artistUri=");
        V0.append(this.c);
        V0.append(", startTimeMs=");
        V0.append(this.d);
        V0.append(", stopTimeMs=");
        V0.append(this.e);
        V0.append(", segmentType=");
        V0.append(this.f);
        V0.append(", artistNames=");
        V0.append(this.g);
        V0.append(", segmentTitle=");
        V0.append(this.h);
        V0.append(", segmentSubtitle=");
        V0.append(this.i);
        V0.append(", trackName=");
        V0.append(this.j);
        V0.append(", episodeName=");
        V0.append(this.k);
        V0.append(", segmentImageUrl=");
        V0.append(this.l);
        V0.append(", trackImageUrl=");
        V0.append(this.m);
        V0.append(", episodeImageUrl=");
        return je.I0(V0, this.n, ")");
    }
}
