package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.g0;
import com.google.android.play.core.tasks.m;
import java.util.Map;

final class d extends b {
    final /* synthetic */ Map b;
    final /* synthetic */ m c;
    final /* synthetic */ o f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d(o oVar, m mVar, Map map, m mVar2) {
        super(mVar);
        this.f = oVar;
        this.b = map;
        this.c = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.b
    public final void a() {
        try {
            ((g0) this.f.c.f()).z2(this.f.a, o.g(this.b), new l(this.f, this.c));
        } catch (RemoteException e) {
            o.f.d(e, "syncPacks", new Object[0]);
            this.c.d(new RuntimeException(e));
        }
    }
}
