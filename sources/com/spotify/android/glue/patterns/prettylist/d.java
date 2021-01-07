package com.spotify.android.glue.patterns.prettylist;

import android.view.View;
import android.widget.ImageView;

/* access modifiers changed from: package-private */
public abstract class d {
    protected final PrettyHeaderView a;
    protected final ImageView b;
    protected final View c;
    protected boolean d = true;
    protected boolean e = true;
    protected View f;
    protected View g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected u p = u.g;
    protected CharSequence q;
    protected int r;
    protected boolean s = true;

    public d(PrettyHeaderView prettyHeaderView, ImageView imageView, View view, int i2) {
        this.a = prettyHeaderView;
        this.b = imageView;
        this.c = view;
        this.l = i2;
    }

    public abstract int a();

    public ImageView b() {
        return this.b;
    }

    public abstract boolean c();

    public abstract void d(boolean z, int i2, int i3, int i4, int i5);

    public abstract void e(int i2, int i3);

    public void f(int i2) {
        this.b.setColorFilter(i2);
    }

    public void g(int i2) {
        this.r = i2;
    }

    public abstract void h(int i2);

    public abstract void i(boolean z);

    public abstract void j(int i2, float f2);

    public void k(int i2) {
        this.h = i2;
    }

    public void l(int i2) {
        this.i = i2;
    }
}
