package com.spotify.mobile.android.util.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.paste.graphics.drawable.b;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.g;
import com.squareup.picasso.z;

public class h {
    private static final Object c = new Object();
    private final Context a;
    private final Picasso b;

    public h(Context context, Picasso picasso) {
        this.a = context;
        this.b = picasso;
    }

    public void a() {
        this.b.d(c);
    }

    public void b(ImageView imageView, Uri uri) {
        z l = this.b.l(uri);
        l.w(c);
        l.m(imageView);
    }

    public void c(ImageView imageView, Uri uri, dwd dwd) {
        z l = this.b.l(uri);
        l.w(c);
        l.o(rwd.h(imageView, dwd));
    }

    public void d(ImageView imageView, String str) {
        z m = this.b.m(str);
        m.w(c);
        m.m(imageView);
    }

    public void e(ImageView imageView, String str, Drawable drawable, pud pud) {
        z m = this.b.m(str);
        m.g(drawable);
        m.t(drawable);
        m.w(c);
        if (pud != null) {
            m.o(rwd.g(imageView, pud, null));
        } else {
            m.m(imageView);
        }
    }

    public void f(ImageView imageView, Uri uri) {
        z l = this.b.l(uri);
        Context context = imageView.getContext();
        int i = yc0.b;
        l.t(yc0.i(context, SpotifyIcon.ALBUM_32));
        l.i();
        l.w(c);
        l.m(imageView);
    }

    public void g(ImageView imageView, Uri uri, g gVar) {
        pud a2 = b.a();
        Drawable a3 = yc0.a(this.a);
        z l = this.b.l(uri);
        l.g(a3);
        l.t(a3);
        l.w(c);
        l.o(rwd.g(imageView, a2, gVar));
    }

    public void h(ImageView imageView, String str) {
        e(imageView, str, yc0.a(this.a), b.a());
    }

    public void i(ImageView imageView, String str) {
        e(imageView, str, yc0.h(this.a), b.a());
    }

    public void j(ImageView imageView, String str) {
        e(imageView, str, yc0.n(this.a), null);
    }

    public void k(ImageView imageView, String str) {
        Context context = this.a;
        int i = yc0.b;
        e(imageView, str, yc0.k(context, SpotifyIcon.USER_32, false, false), b.a());
    }
}
