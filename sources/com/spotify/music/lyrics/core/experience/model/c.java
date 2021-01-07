package com.spotify.music.lyrics.core.experience.model;

import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class c {
    private final String a;
    private final Lyrics b;
    private final ndb c;
    private final int d;
    private final int e;
    private final boolean f;
    private final Pair<Integer, Integer> g;

    public c(String str, Lyrics lyrics, ndb ndb, int i, int i2, boolean z, Pair<Integer, Integer> pair) {
        h.e(str, "plainText");
        h.e(lyrics, "lyrics");
        h.e(ndb, "lineHeightSpan");
        h.e(pair, "size");
        this.a = str;
        this.b = lyrics;
        this.c = ndb;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = pair;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }

    public final ndb c() {
        return this.c;
    }

    public final Lyrics d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && h.a(this.g, cVar.g);
    }

    public final boolean f() {
        return this.f;
    }

    public final Pair<Integer, Integer> g() {
        return this.g;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Lyrics lyrics = this.b;
        int hashCode2 = (hashCode + (lyrics != null ? lyrics.hashCode() : 0)) * 31;
        ndb ndb = this.c;
        int hashCode3 = (((((hashCode2 + (ndb != null ? ndb.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        Pair<Integer, Integer> pair = this.g;
        if (pair != null) {
            i = pair.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LyricsUIModel(plainText=");
        V0.append(this.a);
        V0.append(", lyrics=");
        V0.append(this.b);
        V0.append(", lineHeightSpan=");
        V0.append(this.c);
        V0.append(", activeColor=");
        V0.append(this.d);
        V0.append(", inactiveColor=");
        V0.append(this.e);
        V0.append(", showExtraInfo=");
        V0.append(this.f);
        V0.append(", size=");
        V0.append(this.g);
        V0.append(")");
        return V0.toString();
    }
}
