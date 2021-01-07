package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.v;
import java.io.IOException;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ v.a a;
    public final /* synthetic */ v b;
    public final /* synthetic */ v.b c;
    public final /* synthetic */ v.c f;
    public final /* synthetic */ IOException n;
    public final /* synthetic */ boolean o;

    public /* synthetic */ c(v.a aVar, v vVar, v.b bVar, v.c cVar, IOException iOException, boolean z) {
        this.a = aVar;
        this.b = vVar;
        this.c = bVar;
        this.f = cVar;
        this.n = iOException;
        this.o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.a aVar = this.a;
        this.b.K(aVar.a, aVar.b, this.c, this.f, this.n, this.o);
    }
}
