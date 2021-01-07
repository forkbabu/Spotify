package com.google.android.play.core.assetpacks;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Runnable {
    private final t a;
    private final AssetPackState b;

    q(t tVar, AssetPackState assetPackState) {
        this.a = tVar;
        this.b = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
