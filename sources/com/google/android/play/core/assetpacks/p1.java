package com.google.android.play.core.assetpacks;

import android.content.Intent;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p1 implements Runnable {
    private final q1 a;
    private final Intent b;

    p1(q1 q1Var, Intent intent) {
        this.a = q1Var;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
