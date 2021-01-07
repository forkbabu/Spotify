package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.y;
import java.util.concurrent.atomic.AtomicInteger;

public class z {
    private static final AtomicInteger k = new AtomicInteger();
    private final Picasso a;
    private final y.b b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private Drawable h;
    private Drawable i;
    private Object j;

    z(Picasso picasso, Uri uri, int i2) {
        this.e = true;
        picasso.getClass();
        this.a = picasso;
        this.b = new y.b(uri, i2, picasso.l);
    }

    private y e(long j2) {
        int andIncrement = k.getAndIncrement();
        y a2 = this.b.a();
        a2.a = andIncrement;
        a2.b = j2;
        boolean z = this.a.n;
        if (z) {
            j0.h("Main", "created", a2.d(), a2.toString());
        }
        this.a.r(a2);
        if (a2 != a2) {
            a2.a = andIncrement;
            a2.b = j2;
            if (z) {
                String b2 = a2.b();
                j0.h("Main", "changed", b2, "into " + a2);
            }
        }
        return a2;
    }

    private Drawable k() {
        int i2 = this.f;
        if (i2 == 0) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return this.a.e.getDrawable(i2);
        }
        return this.a.e.getResources().getDrawable(this.f);
    }

    public z a() {
        this.b.b(17);
        return this;
    }

    public z b() {
        this.b.c();
        return this;
    }

    /* access modifiers changed from: package-private */
    public z c() {
        this.j = null;
        return this;
    }

    public z d(Bitmap.Config config) {
        this.b.d(config);
        return this;
    }

    public z f(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.i == null) {
            this.g = i2;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public z g(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        } else if (this.g == 0) {
            this.i = drawable;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public void h(g gVar) {
        long nanoTime = System.nanoTime();
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        } else if (this.b.e()) {
            if (!this.b.f()) {
                this.b.i(Picasso.Priority.LOW);
            }
            y e2 = e(nanoTime);
            String b2 = j0.b(e2, new StringBuilder());
            if (!MemoryPolicy.d(0) || this.a.o(b2) == null) {
                m mVar = new m(this.a, e2, 0, 0, this.j, b2, gVar);
                Handler handler = this.a.f.i;
                handler.sendMessage(handler.obtainMessage(1, mVar));
                return;
            }
            if (this.a.n) {
                String d2 = e2.d();
                StringBuilder V0 = je.V0("from ");
                V0.append(Picasso.LoadedFrom.MEMORY);
                j0.h("Main", "completed", d2, V0.toString());
            }
            if (gVar != null) {
                gVar.onSuccess();
            }
        }
    }

    public z i() {
        this.d = true;
        return this;
    }

    public Bitmap j() {
        long nanoTime = System.nanoTime();
        if (j0.f()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        } else if (this.d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        } else if (!this.b.e()) {
            return null;
        } else {
            y e2 = e(nanoTime);
            o oVar = new o(this.a, e2, 0, 0, this.j, j0.b(e2, new StringBuilder()));
            Picasso picasso = this.a;
            return e.e(picasso, picasso.f, picasso.g, picasso.h, oVar).f();
        }
    }

    /* access modifiers changed from: package-private */
    public Object l() {
        return this.j;
    }

    public void m(ImageView imageView) {
        n(imageView, null);
    }

    public void n(ImageView imageView, g gVar) {
        Bitmap o;
        long nanoTime = System.nanoTime();
        j0.a();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.b.e()) {
            this.a.b(imageView);
            if (this.e) {
                w.c(imageView, k());
            }
        } else {
            if (this.d) {
                if (!this.b.g()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.e) {
                            w.c(imageView, k());
                        }
                        Picasso picasso = this.a;
                        j jVar = new j(this, imageView, gVar);
                        if (picasso.j.containsKey(imageView)) {
                            picasso.a(imageView);
                        }
                        picasso.j.put(imageView, jVar);
                        return;
                    }
                    this.b.j(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            y e2 = e(nanoTime);
            StringBuilder sb = j0.a;
            String b2 = j0.b(e2, sb);
            sb.setLength(0);
            if (!MemoryPolicy.d(0) || (o = this.a.o(b2)) == null) {
                if (this.e) {
                    w.c(imageView, k());
                }
                this.a.g(new p(this.a, imageView, e2, 0, 0, this.g, this.i, b2, this.j, gVar, this.c));
                return;
            }
            this.a.b(imageView);
            Picasso picasso2 = this.a;
            Context context = picasso2.e;
            Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
            w.b(imageView, context, o, loadedFrom, this.c, picasso2.m);
            if (this.a.n) {
                String d2 = e2.d();
                j0.h("Main", "completed", d2, "from " + loadedFrom);
            }
            if (gVar != null) {
                gVar.onSuccess();
            }
        }
    }

    public void o(f0 f0Var) {
        Bitmap o;
        long nanoTime = System.nanoTime();
        j0.a();
        if (f0Var == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.d) {
            Drawable drawable = null;
            if (!this.b.e()) {
                this.a.c(f0Var);
                if (this.e) {
                    drawable = k();
                }
                f0Var.onPrepareLoad(drawable);
                return;
            }
            y e2 = e(nanoTime);
            StringBuilder sb = j0.a;
            String b2 = j0.b(e2, sb);
            sb.setLength(0);
            if (!MemoryPolicy.d(0) || (o = this.a.o(b2)) == null) {
                if (this.e) {
                    drawable = k();
                }
                f0Var.onPrepareLoad(drawable);
                this.a.g(new g0(this.a, f0Var, e2, 0, 0, this.i, b2, this.j, this.g));
                return;
            }
            this.a.c(f0Var);
            f0Var.onBitmapLoaded(o, Picasso.LoadedFrom.MEMORY);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    public z p() {
        this.c = true;
        return this;
    }

    public z q() {
        if (this.f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.h == null) {
            this.e = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public z r() {
        this.b.h();
        return this;
    }

    public z s(int i2) {
        if (!this.e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i2 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.h == null) {
            this.f = i2;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public z t(Drawable drawable) {
        if (!this.e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.f == 0) {
            this.h = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public z u(int i2, int i3) {
        this.b.j(i2, i3);
        return this;
    }

    public z v(int i2, int i3) {
        Resources resources = this.a.e.getResources();
        return u(resources.getDimensionPixelSize(i2), resources.getDimensionPixelSize(i3));
    }

    public z w(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        } else if (this.j == null) {
            this.j = obj;
            return this;
        } else {
            throw new IllegalStateException("Tag already set.");
        }
    }

    public z x(h0 h0Var) {
        this.b.k(h0Var);
        return this;
    }

    /* access modifiers changed from: package-private */
    public z y() {
        this.d = false;
        return this;
    }

    z() {
        this.e = true;
        this.a = null;
        this.b = new y.b(null, 0, null);
    }
}
