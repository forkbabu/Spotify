package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.TreeSet;

public final class r implements f {
    private final long a;
    private final TreeSet<j> b = new TreeSet<>(b.a);
    private long c;

    public r(long j) {
        this.a = j;
    }

    private void g(Cache cache, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            try {
                cache.h(this.b.first());
            } catch (Cache.CacheException unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void a(Cache cache, j jVar) {
        this.b.add(jVar);
        this.c += jVar.c;
        g(cache, 0);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.f
    public boolean b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.f
    public void c(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            g(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void d(Cache cache, j jVar) {
        this.b.remove(jVar);
        this.c -= jVar.c;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void e(Cache cache, j jVar, j jVar2) {
        this.b.remove(jVar);
        this.c -= jVar.c;
        a(cache, jVar2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.f
    public void f() {
    }
}
