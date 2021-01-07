package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.common.util.e;
import com.spotify.music.C0707R;

public final class f0 extends vq {
    private final ImageView b;
    private final View c;
    private final boolean d;
    private final Drawable e;
    private final String f;
    private final Drawable g;
    private final String h;
    private final Drawable i;
    private final String j;
    private boolean k = false;

    public f0(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.b = imageView;
        this.e = drawable;
        this.g = drawable2;
        this.i = drawable3 != null ? drawable3 : drawable2;
        this.f = context.getString(C0707R.string.cast_play);
        this.h = context.getString(C0707R.string.cast_pause);
        this.j = context.getString(C0707R.string.cast_stop);
        this.c = view;
        this.d = z;
        imageView.setEnabled(false);
    }

    private final void g(Drawable drawable, String str) {
        boolean z = !drawable.equals(this.b.getDrawable());
        this.b.setImageDrawable(drawable);
        this.b.setContentDescription(str);
        this.b.setVisibility(0);
        this.b.setEnabled(true);
        View view = this.c;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z && this.k) {
            this.b.sendAccessibilityEvent(8);
        }
    }

    private final void h() {
        h b2 = b();
        if (b2 == null || !b2.m()) {
            this.b.setEnabled(false);
        } else if (b2.q()) {
            g(this.e, this.f);
        } else if (b2.r()) {
            if (b2.o()) {
                g(this.i, this.j);
            } else {
                g(this.g, this.h);
            }
        } else if (b2.n()) {
            i(false);
        } else if (b2.p()) {
            i(true);
        }
    }

    private final void i(boolean z) {
        if (e.b()) {
            this.k = this.b.isAccessibilityFocused();
        }
        View view = this.c;
        int i2 = 0;
        if (view != null) {
            view.setVisibility(0);
            if (this.k) {
                this.c.sendAccessibilityEvent(8);
            }
        }
        ImageView imageView = this.b;
        if (this.d) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        this.b.setEnabled(!z);
    }

    @Override // defpackage.vq
    public final void c() {
        h();
    }

    @Override // defpackage.vq
    public final void d() {
        i(true);
    }

    @Override // defpackage.vq
    public final void e(c cVar) {
        super.e(cVar);
        h();
    }

    @Override // defpackage.vq
    public final void f() {
        this.b.setEnabled(false);
        super.f();
    }
}
