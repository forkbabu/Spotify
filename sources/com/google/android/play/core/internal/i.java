package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

final class i extends b {
    final /* synthetic */ IBinder b;
    final /* synthetic */ k c;

    i(k kVar, IBinder iBinder) {
        this.c = kVar;
        this.b = iBinder;
    }

    @Override // com.google.android.play.core.internal.b
    public final void a() {
        l lVar = this.c.a;
        lVar.k = (IInterface) lVar.g.a(this.b);
        l.n(this.c.a);
        this.c.a.e = false;
        for (Runnable runnable : this.c.a.d) {
            runnable.run();
        }
        this.c.a.d.clear();
    }
}
