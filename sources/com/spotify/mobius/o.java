package com.spotify.mobius;

/* access modifiers changed from: package-private */
public class o<I> implements da2<I>, w92 {
    private final da2<I> a;
    private final w92 b;
    private volatile boolean c;

    private o(da2<I> da2, w92 w92) {
        this.a = da2;
        this.b = w92;
    }

    static <I> o<I> b(h<I> hVar) {
        hVar.getClass();
        return new o<>(hVar, hVar);
    }

    static <I> o<I> c(da2<I> da2) {
        da2.getClass();
        return new o<>(da2, null);
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
