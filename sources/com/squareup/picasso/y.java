package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class y {
    private static final long s = TimeUnit.SECONDS.toNanos(5);
    int a;
    long b;
    public final Uri c;
    public final int d;
    public final List<h0> e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final float l;
    public final float m;
    public final float n;
    public final boolean o;
    public final boolean p;
    public final Bitmap.Config q;
    public final Picasso.Priority r;

    public static final class b {
        private Uri a;
        private int b;
        private int c;
        private int d;
        private boolean e;
        private int f;
        private boolean g;
        private boolean h;
        private List<h0> i;
        private Bitmap.Config j;
        private Picasso.Priority k;

        b(Uri uri, int i2, Bitmap.Config config) {
            this.a = uri;
            this.b = i2;
            this.j = config;
        }

        public y a() {
            boolean z = this.g;
            if (z && this.e) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.e && this.c == 0 && this.d == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z && this.c == 0 && this.d == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.k == null) {
                    this.k = Picasso.Priority.NORMAL;
                }
                return new y(this.a, this.b, null, this.i, this.c, this.d, this.e, this.g, this.f, this.h, 0.0f, 0.0f, 0.0f, false, false, this.j, this.k, null);
            }
        }

        public b b(int i2) {
            if (!this.g) {
                this.e = true;
                this.f = i2;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        public b c() {
            if (!this.e) {
                this.g = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        public b d(Bitmap.Config config) {
            if (config != null) {
                this.j = config;
                return this;
            }
            throw new IllegalArgumentException("config == null");
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return (this.a == null && this.b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.k != null;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return (this.c == 0 && this.d == 0) ? false : true;
        }

        public b h() {
            if (this.d == 0 && this.c == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.h = true;
            return this;
        }

        public b i(Picasso.Priority priority) {
            if (this.k == null) {
                this.k = priority;
                return this;
            }
            throw new IllegalStateException("Priority already set.");
        }

        public b j(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.c = i2;
                this.d = i3;
                return this;
            }
        }

        public b k(h0 h0Var) {
            if (h0Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (h0Var.a() != null) {
                if (this.i == null) {
                    this.i = new ArrayList(2);
                }
                this.i.add(h0Var);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }
    }

    y(Uri uri, int i2, String str, List list, int i3, int i4, boolean z, boolean z2, int i5, boolean z3, float f2, float f3, float f4, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority, a aVar) {
        this.c = uri;
        this.d = i2;
        if (list == null) {
            this.e = null;
        } else {
            this.e = Collections.unmodifiableList(list);
        }
        this.f = i3;
        this.g = i4;
        this.h = z;
        this.j = z2;
        this.i = i5;
        this.k = z3;
        this.l = f2;
        this.m = f3;
        this.n = f4;
        this.o = z4;
        this.p = z5;
        this.q = config;
        this.r = priority;
    }

    public boolean a() {
        return (this.f == 0 && this.g == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        long nanoTime = System.nanoTime() - this.b;
        if (nanoTime > s) {
            return d() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return d() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return a() || this.l != 0.0f;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return je.A0(je.V0("[R"), this.a, ']');
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.d;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.c);
        }
        List<h0> list = this.e;
        if (list != null && !list.isEmpty()) {
            for (h0 h0Var : this.e) {
                sb.append(' ');
                sb.append(h0Var.a());
            }
        }
        if (this.f > 0) {
            sb.append(" resize(");
            sb.append(this.f);
            sb.append(',');
            sb.append(this.g);
            sb.append(')');
        }
        if (this.h) {
            sb.append(" centerCrop");
        }
        if (this.j) {
            sb.append(" centerInside");
        }
        if (this.l != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.l);
            if (this.o) {
                sb.append(" @ ");
                sb.append(this.m);
                sb.append(',');
                sb.append(this.n);
            }
            sb.append(')');
        }
        if (this.p) {
            sb.append(" purgeable");
        }
        if (this.q != null) {
            sb.append(' ');
            sb.append(this.q);
        }
        sb.append('}');
        return sb.toString();
    }
}
