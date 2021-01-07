package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.v;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ v.a a;
    public final /* synthetic */ v b;
    public final /* synthetic */ v.c c;

    public /* synthetic */ d(v.a aVar, v vVar, v.c cVar) {
        this.a = aVar;
        this.b = vVar;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.a aVar = this.a;
        this.b.B(aVar.a, aVar.b, this.c);
    }
}
