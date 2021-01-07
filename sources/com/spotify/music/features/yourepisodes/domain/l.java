package com.spotify.music.features.yourepisodes.domain;

import com.spotify.music.features.yourepisodes.domain.e;
import defpackage.onc;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class l {
    private static final l d = new l(e.b.a, new c(onc.b.a, false), false);
    public static final a e = new a(null);
    private final e a;
    private final c b;
    private final boolean c;

    public static final class a {
        public a(f fVar) {
        }
    }

    public l(e eVar, c cVar, boolean z) {
        h.e(eVar, "uiState");
        h.e(cVar, "playerState");
        this.a = eVar;
        this.b = cVar;
        this.c = z;
    }

    public static l b(l lVar, e eVar, c cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            eVar = lVar.a;
        }
        if ((i & 2) != 0) {
            cVar = lVar.b;
        }
        if ((i & 4) != 0) {
            z = lVar.c;
        }
        lVar.getClass();
        h.e(eVar, "uiState");
        h.e(cVar, "playerState");
        return new l(eVar, cVar, z);
    }

    public final boolean c() {
        return this.c;
    }

    public final c d() {
        return this.b;
    }

    public final e e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.a(this.a, lVar.a) && h.a(this.b, lVar.b) && this.c == lVar.c;
    }

    public int hashCode() {
        e eVar = this.a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        c cVar = this.b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("YourEpisodesModel(uiState=");
        V0.append(this.a);
        V0.append(", playerState=");
        V0.append(this.b);
        V0.append(", contextDownloadEnabled=");
        return je.P0(V0, this.c, ")");
    }
}
