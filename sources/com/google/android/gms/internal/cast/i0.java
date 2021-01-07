package com.google.android.gms.internal.cast;

import android.widget.ProgressBar;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.h;

public final class i0 extends vq implements h.d {
    private final ProgressBar b;
    private final long c;

    public i0(ProgressBar progressBar, long j) {
        this.b = progressBar;
        this.c = j;
        g();
    }

    private final void g() {
        h b2 = b();
        if (b2 == null || !b2.m() || b2.o()) {
            this.b.setMax(1);
            this.b.setProgress(0);
            return;
        }
        this.b.setMax((int) b2.l());
        this.b.setProgress((int) b2.f());
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
    public final void e(c cVar) {
        super.e(cVar);
        h b2 = b();
        if (b2 != null) {
            b2.c(this, this.c);
        }
        g();
    }

    @Override // defpackage.vq
    public final void f() {
        if (b() != null) {
            b().x(this);
        }
        super.f();
        g();
    }
}
