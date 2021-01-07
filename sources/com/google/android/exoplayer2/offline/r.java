package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.cache.c;
import com.google.android.exoplayer2.upstream.cache.d;
import com.google.android.exoplayer2.upstream.cache.e;
import com.google.android.exoplayer2.upstream.cache.i;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.util.PriorityTaskManager;

public final class r {
    private final Cache a;
    private final i b;
    private final PriorityTaskManager c = null;
    private final e d;
    private final e e;

    public r(Cache cache, k.a aVar, k.a aVar2, i.a aVar3, PriorityTaskManager priorityTaskManager, com.google.android.exoplayer2.upstream.cache.i iVar) {
        FileDataSource.a aVar4 = new FileDataSource.a();
        this.d = new e(cache, aVar, aVar4, new c(cache, 5242880), 1, null, iVar);
        int i = u.a;
        this.e = new e(cache, com.google.android.exoplayer2.upstream.c.a, aVar4, null, 1, null, iVar);
        this.a = cache;
        this.b = iVar;
    }

    public d a() {
        return this.d.a();
    }

    public d b() {
        return this.e.a();
    }

    public Cache c() {
        return this.a;
    }

    public com.google.android.exoplayer2.upstream.cache.i d() {
        com.google.android.exoplayer2.upstream.cache.i iVar = this.b;
        if (iVar != null) {
            return iVar;
        }
        int i = com.google.android.exoplayer2.upstream.cache.k.a;
        return a.a;
    }

    public PriorityTaskManager e() {
        PriorityTaskManager priorityTaskManager = this.c;
        return priorityTaskManager != null ? priorityTaskManager : new PriorityTaskManager();
    }
}
