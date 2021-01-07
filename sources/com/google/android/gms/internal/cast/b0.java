package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.c;

public final class b0 extends vq {
    private final View b;

    public b0(View view) {
        this.b = view;
        view.setEnabled(false);
    }

    @Override // defpackage.vq
    public final void e(c cVar) {
        super.e(cVar);
        this.b.setEnabled(true);
    }

    @Override // defpackage.vq
    public final void f() {
        this.b.setEnabled(false);
        super.f();
    }
}
