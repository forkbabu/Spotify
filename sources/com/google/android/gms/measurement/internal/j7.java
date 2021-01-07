package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* access modifiers changed from: package-private */
public final class j7 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ Uri b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String f;
    private final /* synthetic */ g7 n;

    j7(g7 g7Var, boolean z, Uri uri, String str, String str2) {
        this.n = g7Var;
        this.a = z;
        this.b = uri;
        this.c = str;
        this.f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g7.a(this.n, this.a, this.b, this.c, this.f);
    }
}
