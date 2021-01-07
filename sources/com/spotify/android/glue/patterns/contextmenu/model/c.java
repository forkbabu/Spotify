package com.spotify.android.glue.patterns.contextmenu.model;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;

public class c {
    private final CharSequence a;
    private final ImmutableList<Drawable> b;
    private int c;
    private boolean d = true;
    private boolean e = true;
    private a f;
    private d g;

    public interface a {
        void a(c cVar);
    }

    public c(int i, CharSequence charSequence, ImmutableList<Drawable> immutableList, int i2) {
        this.a = charSequence;
        this.b = immutableList;
        this.c = i2;
    }

    public nqe a() {
        d dVar = this.g;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    public Drawable b() {
        return this.b.get(this.c);
    }

    public CharSequence c() {
        return this.a;
    }

    public void d() {
        this.c = (this.c + 1) % this.b.size();
    }

    public boolean e() {
        return this.e;
    }

    public void f() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public c g(boolean z) {
        this.e = z;
        return this;
    }

    public c h(a aVar, d dVar) {
        this.f = aVar;
        this.g = dVar;
        return this;
    }

    public c i(a aVar) {
        this.f = aVar;
        return this;
    }

    public c j(boolean z) {
        this.d = z;
        return this;
    }

    public boolean k() {
        return this.d;
    }
}
