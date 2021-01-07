package com.google.android.play.core.internal;

import java.io.InputStream;

public final class p extends o {
    private final o a;
    private final long b;
    private final long c;

    public p(o oVar, long j, long j2) {
        this.a = oVar;
        long d = d(j);
        this.b = d;
        this.c = d(d + j2);
    }

    private final long d(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.a.a() ? this.a.a() : j;
    }

    @Override // com.google.android.play.core.internal.o
    public final long a() {
        return this.c - this.b;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.o
    public final InputStream b(long j, long j2) {
        long d = d(this.b);
        return this.a.b(d, d(j2 + d) - d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
