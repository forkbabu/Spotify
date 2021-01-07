package com.google.android.exoplayer2.upstream.cache;

import java.io.File;

public class j implements Comparable<j> {
    public final String a;
    public final long b;
    public final long c;
    public final boolean f;
    public final File n;
    public final long o;

    public j(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.f = file != null;
        this.n = file;
        this.o = j3;
    }

    /* renamed from: d */
    public int compareTo(j jVar) {
        if (!this.a.equals(jVar.a)) {
            return this.a.compareTo(jVar.a);
        }
        long j = this.b - jVar.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
