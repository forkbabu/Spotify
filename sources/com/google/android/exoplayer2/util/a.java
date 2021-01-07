package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.m;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ m.b a;
    public final /* synthetic */ m.a b;

    public /* synthetic */ a(m.b bVar, m.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
