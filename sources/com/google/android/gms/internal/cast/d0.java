package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.h;
import com.spotify.music.C0707R;

public final class d0 extends vq {
    private final ImageView b;
    private final String c;
    private final String d;
    private final Context e;
    private e.c f = null;

    public d0(ImageView imageView, Context context) {
        this.b = imageView;
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.c = applicationContext.getString(C0707R.string.cast_mute);
        this.d = applicationContext.getString(C0707R.string.cast_unmute);
        imageView.setEnabled(false);
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
        if (this.f == null) {
            this.f = new g0(this);
        }
        super.e(cVar);
        cVar.n(this.f);
        g();
    }

    @Override // defpackage.vq
    public final void f() {
        e.c cVar;
        this.b.setEnabled(false);
        c d2 = a.e(this.e).c().d();
        if (!(d2 == null || (cVar = this.f) == null)) {
            d2.r(cVar);
        }
        super.f();
    }

    /* access modifiers changed from: protected */
    public final void g() {
        c d2 = a.e(this.e).c().d();
        if (d2 == null || !d2.c()) {
            this.b.setEnabled(false);
            return;
        }
        h b2 = b();
        if (b2 == null || !b2.m()) {
            this.b.setEnabled(false);
        } else {
            this.b.setEnabled(true);
        }
        boolean q = d2.q();
        this.b.setSelected(q);
        this.b.setContentDescription(q ? this.d : this.c);
    }
}
