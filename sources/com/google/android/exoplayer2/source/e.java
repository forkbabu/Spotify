package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.v;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ v.a a;
    public final /* synthetic */ v b;
    public final /* synthetic */ v.b c;
    public final /* synthetic */ v.c f;

    public /* synthetic */ e(v.a aVar, v vVar, v.b bVar, v.c cVar) {
        this.a = aVar;
        this.b = vVar;
        this.c = bVar;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.a aVar = this.a;
        this.b.J(aVar.a, aVar.b, this.c, this.f);
    }
}
