package com.google.android.play.core.assetpacks;

final /* synthetic */ class z1 implements Runnable {
    private final z a;

    private z1(z zVar) {
        this.a = zVar;
    }

    static Runnable a(z zVar) {
        return new z1(zVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l();
    }
}
