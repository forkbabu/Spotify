package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.g0;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public final class i extends b {
    final /* synthetic */ m b;
    final /* synthetic */ o c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(o oVar, m mVar, m mVar2) {
        super(mVar);
        this.c = oVar;
        this.b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.b
    public final void a() {
        try {
            ((g0) this.c.d.f()).n1(this.c.a, o.n(), new m(this.c, this.b));
        } catch (RemoteException e) {
            o.f.d(e, "keepAlive", new Object[0]);
        }
    }
}
