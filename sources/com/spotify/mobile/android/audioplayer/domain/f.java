package com.spotify.mobile.android.audioplayer.domain;

import android.net.Uri;
import kotlin.jvm.internal.h;

public final class f {
    private final Uri a;
    private final boolean b;
    private final boolean c;
    private final long d;
    private final long e;
    private final long f;

    public f() {
        this(null, false, false, 0, 0, 0, 63);
    }

    public f(Uri uri, boolean z, boolean z2, long j, long j2, long j3) {
        this.a = uri;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public static f a(f fVar, Uri uri, boolean z, boolean z2, long j, long j2, long j3, int i) {
        Uri uri2 = (i & 1) != 0 ? fVar.a : uri;
        boolean z3 = (i & 2) != 0 ? fVar.b : z;
        boolean z4 = (i & 4) != 0 ? fVar.c : z2;
        long j4 = (i & 8) != 0 ? fVar.d : j;
        long j5 = (i & 16) != 0 ? fVar.e : j2;
        long j6 = (i & 32) != 0 ? fVar.f : j3;
        fVar.getClass();
        return new f(uri2, z3, z4, j4, j5, j6);
    }

    public final long b() {
        return this.f;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.b;
    }

    public final long e() {
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
        return h.a(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
    }

    public final long f() {
        return this.d;
    }

    public int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        boolean z = this.b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((((((i5 + i) * 31) + e.a(this.d)) * 31) + e.a(this.e)) * 31) + e.a(this.f);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AudioPlayerModel(audioUri=");
        V0.append(this.a);
        V0.append(", muted=");
        V0.append(this.b);
        V0.append(", hasAudioFocus=");
        V0.append(this.c);
        V0.append(", playStartTime=");
        V0.append(this.d);
        V0.append(", pauseStartTime=");
        V0.append(this.e);
        V0.append(", accumulatedPauseTime=");
        return je.E0(V0, this.f, ")");
    }

    public f(Uri uri, boolean z, boolean z2, long j, long j2, long j3, int i) {
        int i2 = i & 1;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        j = (i & 8) != 0 ? 0 : j;
        j2 = (i & 16) != 0 ? 0 : j2;
        j3 = (i & 32) != 0 ? 0 : j3;
        this.a = null;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }
}
