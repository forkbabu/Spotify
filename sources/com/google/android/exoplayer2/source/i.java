package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.v;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ v.a a;
    public final /* synthetic */ v b;
    public final /* synthetic */ t.a c;

    public /* synthetic */ i(v.a aVar, v vVar, t.a aVar2) {
        this.a = aVar;
        this.b = vVar;
        this.c = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.a aVar = this.a;
        this.b.u(aVar.a, this.c);
    }
}
