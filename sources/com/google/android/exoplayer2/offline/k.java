package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.g;

public final class k {
    public final DownloadRequest a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    final p h;

    public k(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3) {
        this(downloadRequest, i, j, j2, j3, i2, i3, new p());
    }

    public long a() {
        return this.h.a;
    }

    public float b() {
        return this.h.b;
    }

    public k(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, p pVar) {
        pVar.getClass();
        boolean z = true;
        g.a((i3 == 0) == (i != 4));
        if (i2 != 0) {
            g.a((i == 2 || i == 0) ? false : z);
        }
        this.a = downloadRequest;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = pVar;
    }
}
