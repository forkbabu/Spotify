package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {
    private final t a;
    private final Bundle b;
    private final AssetPackState c;

    r(t tVar, Bundle bundle, AssetPackState assetPackState) {
        this.a = tVar;
        this.b = bundle;
        this.c = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b, this.c);
    }
}
