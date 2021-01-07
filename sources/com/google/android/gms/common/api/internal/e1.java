package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class e1 extends f0 {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ f1 b;

    e1(f1 f1Var, Dialog dialog) {
        this.b = f1Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void a() {
        this.b.b.l();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
