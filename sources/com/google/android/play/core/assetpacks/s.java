package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Runnable {
    private final t a;
    private final Bundle b;

    s(t tVar, Bundle bundle) {
        this.a = tVar;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b);
    }
}
