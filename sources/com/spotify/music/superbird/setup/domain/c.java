package com.spotify.music.superbird.setup.domain;

import com.spotify.superbird.ota.model.g;
import kotlin.jvm.internal.h;

public final class c {
    private final String a;
    private final g b;
    private final boolean c;
    private final boolean d;

    public c(String str, g gVar, boolean z, boolean z2) {
        h.e(str, "serial");
        this.a = str;
        this.b = gVar;
        this.c = z;
        this.d = z2;
    }

    public static c a(c cVar, String str, g gVar, boolean z, boolean z2, int i) {
        g gVar2 = null;
        String str2 = (i & 1) != 0 ? cVar.a : null;
        if ((i & 2) != 0) {
            gVar2 = cVar.b;
        }
        if ((i & 4) != 0) {
            z = cVar.c;
        }
        if ((i & 8) != 0) {
            z2 = cVar.d;
        }
        h.e(str2, "serial");
        return new c(str2, gVar2, z, z2);
    }

    public final String b() {
        return this.a;
    }

    public final g c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        g gVar = this.b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.d;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CheckForUpdatesResult(serial=");
        V0.append(this.a);
        V0.append(", updatableItem=");
        V0.append(this.b);
        V0.append(", isAutoUpdatable=");
        V0.append(this.c);
        V0.append(", isDownloaded=");
        return je.P0(V0, this.d, ")");
    }
}
