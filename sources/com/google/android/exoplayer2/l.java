package com.google.android.exoplayer2;

import com.google.android.exoplayer2.s;
import java.util.concurrent.CopyOnWriteArrayList;

public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ CopyOnWriteArrayList a;
    public final /* synthetic */ s.b b;

    public /* synthetic */ l(CopyOnWriteArrayList copyOnWriteArrayList, s.b bVar) {
        this.a = copyOnWriteArrayList;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.H(this.a, this.b);
    }
}
