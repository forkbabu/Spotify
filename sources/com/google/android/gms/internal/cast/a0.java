package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.media.b;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.j;

public final class a0 extends vq {
    private final ImageView b;
    private final b c;
    private final Bitmap d;
    private final View e;
    private final c f;
    private final com.google.android.gms.cast.framework.media.internal.b g;

    public a0(ImageView imageView, Context context, b bVar, int i, View view) {
        this.b = imageView;
        this.c = bVar;
        c cVar = null;
        this.d = i != 0 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
        this.e = null;
        a f2 = a.f(context);
        if (f2 != null) {
            com.google.android.gms.cast.framework.media.a I1 = f2.b().I1();
            this.f = I1 != null ? I1.Q1() : cVar;
        } else {
            this.f = null;
        }
        this.g = new com.google.android.gms.cast.framework.media.internal.b(context.getApplicationContext());
    }

    private final void i() {
        hr b2;
        h b3 = b();
        if (b3 == null || !b3.m()) {
            j();
            return;
        }
        MediaInfo h = b3.h();
        Uri uri = null;
        if (h != null) {
            c cVar = this.f;
            if (cVar == null || (b2 = cVar.b(h.Q1(), this.c)) == null || b2.I1() == null) {
                j Q1 = h.Q1();
                if (!(Q1 == null || Q1.o2() == null || Q1.o2().size() <= 0)) {
                    uri = Q1.o2().get(0).I1();
                }
            } else {
                uri = b2.I1();
            }
        }
        if (uri == null) {
            j();
        } else {
            this.g.e(uri);
        }
    }

    private final void j() {
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
            this.b.setVisibility(4);
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            this.b.setImageBitmap(bitmap);
        }
    }

    @Override // defpackage.vq
    public final void c() {
        i();
    }

    @Override // defpackage.vq
    public final void e(com.google.android.gms.cast.framework.c cVar) {
        super.e(cVar);
        this.g.d(new c0(this));
        j();
        i();
    }

    @Override // defpackage.vq
    public final void f() {
        this.g.a();
        j();
        super.f();
    }
}
