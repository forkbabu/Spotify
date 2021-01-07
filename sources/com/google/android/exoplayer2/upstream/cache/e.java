package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.d;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.k;

public final class e implements k.a {
    private final Cache a;
    private final k.a b;
    private final k.a c;
    private final int d;
    private final i.a e;
    private final i f;

    public e(Cache cache, k.a aVar, k.a aVar2, i.a aVar3, int i, d.a aVar4, i iVar) {
        this.a = cache;
        this.b = aVar;
        this.c = aVar2;
        this.e = aVar3;
        this.d = i;
        this.f = iVar;
    }

    /* renamed from: b */
    public d a() {
        i iVar;
        Cache cache = this.a;
        k a2 = this.b.a();
        k a3 = this.c.a();
        i.a aVar = this.e;
        if (aVar == null) {
            iVar = null;
        } else {
            iVar = ((c) aVar).a();
        }
        return new d(cache, a2, a3, iVar, this.d, null, this.f);
    }
}
