package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.h;

public final class h0 extends vq implements h.d {
    private final View b;
    private final xq c;

    public h0(View view, xq xqVar) {
        this.b = view;
        this.c = xqVar;
        view.setEnabled(false);
    }

    private final void g() {
        View view;
        h b2 = b();
        boolean z = false;
        if (b2 == null || !b2.m() || b2.s()) {
            view = this.b;
        } else {
            if (!b2.o()) {
                view = this.b;
            } else {
                View view2 = this.b;
                if (b2.t()) {
                    xq xqVar = this.c;
                    if (!((xqVar.h() + ((long) xqVar.d())) - (xqVar.h() + ((long) xqVar.f())) < 10000)) {
                        view = view2;
                    }
                }
                view = view2;
            }
            z = true;
        }
        view.setEnabled(z);
    }

    @Override // com.google.android.gms.cast.framework.media.h.d
    public final void a(long j, long j2) {
        g();
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
        if (b() != null) {
            b().c(this, 1000);
        }
        g();
    }

    @Override // defpackage.vq
    public final void f() {
        if (b() != null) {
            b().x(this);
        }
        this.b.setEnabled(false);
        super.f();
        g();
    }
}
