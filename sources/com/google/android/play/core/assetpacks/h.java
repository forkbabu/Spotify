package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.g0;
import com.google.android.play.core.tasks.m;

final class h extends b {
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String f;
    final /* synthetic */ int n;
    final /* synthetic */ m o;
    final /* synthetic */ o p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(o oVar, m mVar, int i, String str, String str2, int i2, m mVar2) {
        super(mVar);
        this.p = oVar;
        this.b = i;
        this.c = str;
        this.f = str2;
        this.n = i2;
        this.o = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.b
    public final void a() {
        try {
            ((g0) this.p.c.f()).y1(this.p.a, o.j(this.b, this.c, this.f, this.n), o.n(), new k(this.p, this.o));
        } catch (RemoteException e) {
            o.f.e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.c, this.f, Integer.valueOf(this.n), Integer.valueOf(this.b));
            this.o.d(new RuntimeException(e));
        }
    }
}
