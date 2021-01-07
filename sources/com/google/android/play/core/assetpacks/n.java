package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.m;

final class n extends j<Void> {
    final int c;
    final String d;
    final int e;
    final /* synthetic */ o f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(o oVar, m<Void> mVar, int i, String str, int i2) {
        super(oVar, mVar);
        this.f = oVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.j, com.google.android.play.core.internal.i0
    public final void j(Bundle bundle) {
        this.f.c.b();
        o.f.e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i = this.e;
        if (i > 0) {
            this.f.d(this.c, this.d, i - 1);
        }
    }
}
