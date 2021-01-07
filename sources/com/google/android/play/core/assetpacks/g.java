package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.g0;
import com.google.android.play.core.tasks.m;

final class g extends b {
    final /* synthetic */ int b;
    final /* synthetic */ m c;
    final /* synthetic */ o f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(o oVar, m mVar, int i, m mVar2) {
        super(mVar);
        this.f = oVar;
        this.b = i;
        this.c = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.b
    public final void a() {
        try {
            String str = this.f.a;
            int i = this.b;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            ((g0) this.f.c.f()).j1(str, bundle, o.n(), new j(this.f, this.c, (int[]) null));
        } catch (RemoteException e) {
            o.f.d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
