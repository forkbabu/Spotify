package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.h;

public final class m0 extends vq {
    private final View b;
    private final int c;

    public m0(View view, int i) {
        this.b = view;
        this.c = i;
    }

    private final void g() {
        h b2 = b();
        if (b2 == null || !b2.m()) {
            this.b.setVisibility(this.c);
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // defpackage.vq
    public final void c() {
        g();
    }

    @Override // defpackage.vq
    public final void e(c cVar) {
        super.e(cVar);
        g();
    }

    @Override // defpackage.vq
    public final void f() {
        this.b.setVisibility(this.c);
        super.f();
    }
}
