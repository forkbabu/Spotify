package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.g0;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public final class f extends b {
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ m f;
    final /* synthetic */ int n;
    final /* synthetic */ o o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(o oVar, m mVar, int i, String str, m mVar2, int i2) {
        super(mVar);
        this.o = oVar;
        this.b = i;
        this.c = str;
        this.f = mVar2;
        this.n = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.b
    public final void a() {
        try {
            String str = this.o.a;
            int i = this.b;
            String str2 = this.c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            ((g0) this.o.c.f()).R0(str, bundle, o.n(), new n(this.o, this.f, this.b, this.c, this.n));
        } catch (RemoteException e) {
            o.f.d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
