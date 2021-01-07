package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.Picasso;

public class q extends z {
    private final z l;
    private final Uri m;
    private final pg0<String, String, Void> n;

    class a implements f0 {
        final /* synthetic */ f0 a;

        a(f0 f0Var) {
            this.a = f0Var;
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            q.A(q.this);
            this.a.onBitmapFailed(exc, drawable);
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            q.z(q.this);
            this.a.onBitmapLoaded(bitmap, loadedFrom);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
            this.a.onPrepareLoad(drawable);
        }
    }

    class b implements g {
        b() {
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            q.A(q.this);
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            q.z(q.this);
        }
    }

    class c implements g {
        final /* synthetic */ g a;

        c(g gVar) {
            this.a = gVar;
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            q.A(q.this);
            this.a.onError(exc);
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            q.z(q.this);
            this.a.onSuccess();
        }
    }

    public q(Picasso picasso, pg0<String, String, Void> pg0, z zVar, Uri uri) {
        super(picasso, uri, 0);
        this.l = zVar;
        this.m = uri;
        this.n = pg0;
    }

    static void A(q qVar) {
        Uri uri = qVar.m;
        if (uri != null) {
            qVar.n.a("uri_failed", uri.toString());
        }
    }

    static void z(q qVar) {
        Uri uri = qVar.m;
        if (uri != null) {
            qVar.n.a("uri_succeeded", uri.toString());
        }
    }

    @Override // com.squareup.picasso.z
    public z a() {
        this.l.a();
        return this;
    }

    @Override // com.squareup.picasso.z
    public z b() {
        this.l.b();
        return this;
    }

    @Override // com.squareup.picasso.z
    public z d(Bitmap.Config config) {
        this.l.d(config);
        return this;
    }

    @Override // com.squareup.picasso.z
    public z f(int i) {
        this.l.f(i);
        return this;
    }

    @Override // com.squareup.picasso.z
    public z g(Drawable drawable) {
        this.l.g(drawable);
        return this;
    }

    @Override // com.squareup.picasso.z
    public void h(g gVar) {
        this.l.h(gVar);
    }

    @Override // com.squareup.picasso.z
    public z i() {
        this.l.i();
        return this;
    }

    @Override // com.squareup.picasso.z
    public Bitmap j() {
        return this.l.j();
    }

    @Override // com.squareup.picasso.z
    public void m(ImageView imageView) {
        this.l.n(imageView, new b());
    }

    @Override // com.squareup.picasso.z
    public void n(ImageView imageView, g gVar) {
        this.l.n(imageView, new c(gVar));
    }

    @Override // com.squareup.picasso.z
    public void o(f0 f0Var) {
        this.l.o(new a(f0Var));
    }

    @Override // com.squareup.picasso.z
    public z p() {
        this.l.p();
        return this;
    }

    @Override // com.squareup.picasso.z
    public z q() {
        this.l.q();
        return this;
    }

    @Override // com.squareup.picasso.z
    public z r() {
        this.l.r();
        return this;
    }

    @Override // com.squareup.picasso.z
    public z s(int i) {
        this.l.s(i);
        return this;
    }

    @Override // com.squareup.picasso.z
    public z t(Drawable drawable) {
        this.l.t(drawable);
        return this;
    }

    @Override // com.squareup.picasso.z
    public z u(int i, int i2) {
        this.l.u(i, i2);
        return this;
    }

    @Override // com.squareup.picasso.z
    public z v(int i, int i2) {
        this.l.v(i, i2);
        return this;
    }

    @Override // com.squareup.picasso.z
    public z w(Object obj) {
        this.l.w(obj);
        return this;
    }

    @Override // com.squareup.picasso.z
    public z x(h0 h0Var) {
        this.l.x(h0Var);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.z
    public z y() {
        this.l.y();
        return this;
    }
}
