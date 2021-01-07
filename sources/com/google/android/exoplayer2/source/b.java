package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.v;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ v.a a;
    public final /* synthetic */ v b;
    public final /* synthetic */ t.a c;
    public final /* synthetic */ v.c f;

    public /* synthetic */ b(v.a aVar, v vVar, t.a aVar2, v.c cVar) {
        this.a = aVar;
        this.b = vVar;
        this.c = aVar2;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.a aVar = this.a;
        this.b.s(aVar.a, this.c, this.f);
    }
}
