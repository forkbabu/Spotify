package com.google.android.exoplayer2;

import com.google.android.exoplayer2.r;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ r.a a;
    public final /* synthetic */ int b;

    public /* synthetic */ a(r.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.a aVar = this.a;
        r.b(r.this, this.b);
    }
}
