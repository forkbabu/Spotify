package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements Callable {
    private final boolean a;
    private final String b;
    private final m c;

    n(boolean z, String str, m mVar) {
        this.a = z;
        this.b = str;
        this.c = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return l.c(this.a, this.b, this.c);
    }
}
