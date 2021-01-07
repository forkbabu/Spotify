package com.google.android.play.core.assetpacks;

import android.os.Bundle;

final class m extends j<Void> {
    final /* synthetic */ o c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m(o oVar, com.google.android.play.core.tasks.m<Void> mVar) {
        super(oVar, mVar);
        this.c = oVar;
    }

    @Override // com.google.android.play.core.assetpacks.j, com.google.android.play.core.internal.i0
    public final void t(Bundle bundle, Bundle bundle2) {
        super.t(bundle, bundle2);
        if (!this.c.e.compareAndSet(true, false)) {
            o.f.g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.e();
        }
    }
}
