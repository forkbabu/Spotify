package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.o;

public final class k0 extends vq {
    private final View b;
    private final int c;

    public k0(View view, int i) {
        this.b = view;
        this.c = i;
        view.setEnabled(false);
    }

    private final void g() {
        boolean z;
        Integer p2;
        h b2 = b();
        if (b2 != null) {
            if (b2.m()) {
                o i = b2.i();
                if (i.z2(64) || i.x2() != 0 || ((p2 = i.p2(i.Q1())) != null && p2.intValue() < i.w2() - 1)) {
                    z = true;
                    if (z && !b2.s()) {
                        this.b.setVisibility(0);
                        this.b.setEnabled(true);
                        return;
                    }
                }
            }
            z = false;
            this.b.setVisibility(0);
            this.b.setEnabled(true);
            return;
        }
        this.b.setVisibility(this.c);
        this.b.setEnabled(false);
    }

    @Override // defpackage.vq
    public final void c() {
        g();
    }

    @Override // defpackage.vq
    public final void d() {
        this.b.setEnabled(false);
    }

    @Override // defpackage.vq
    public final void e(c cVar) {
        super.e(cVar);
        g();
    }

    @Override // defpackage.vq
    public final void f() {
        this.b.setEnabled(false);
        super.f();
    }
}
