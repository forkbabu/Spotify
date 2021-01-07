package com.spotify.mobius;

/* access modifiers changed from: package-private */
public class x<M> implements da2<M>, w92 {
    private final ia2 a;
    private final da2<M> b;
    private volatile boolean c = false;

    x(ia2 ia2, da2<M> da2) {
        ia2.getClass();
        this.a = ia2;
        this.b = da2;
    }

    @Override // defpackage.da2
    public void accept(M m) {
        if (!this.c) {
            this.a.a(new a(this, m));
        }
    }

    public /* synthetic */ void b(Object obj) {
        try {
            this.b.accept(obj);
        } catch (Throwable th) {
            a0.a(new RuntimeException("Consumer threw an exception when accepting message: " + obj, th));
        }
    }

    @Override // defpackage.w92
    public void dispose() {
        this.c = true;
        this.a.dispose();
    }
}
