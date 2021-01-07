package com.spotify.mobius.rx2;

import com.spotify.mobius.h;

class c<I> implements da2<I>, w92 {
    private final da2<I> a;
    private final w92 b;
    private volatile boolean c;

    private c(da2<I> da2, w92 w92) {
        this.a = da2;
        this.b = w92;
    }

    static <I> c<I> b(h<I> hVar) {
        hVar.getClass();
        return new c<>(hVar, hVar);
    }

    static <I> c<I> c(da2<I> da2) {
        da2.getClass();
        return new c<>(da2, null);
    }

    @Override // defpackage.da2
    public void accept(I i) {
        if (!this.c) {
            this.a.accept(i);
        }
    }

    @Override // defpackage.w92
    public void dispose() {
        this.c = true;
        w92 w92 = this.b;
        if (w92 != null) {
            w92.dispose();
        }
    }
}
