package com.spotify.android.storage;

import java.lang.Thread;

/* access modifiers changed from: package-private */
public class b implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ c a;

    b(c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.a.a.a();
        g gVar = this.a.a;
        gVar.e("moving-state", "cancelled");
        gVar.b();
        this.a.d.a();
        this.a.e.uncaughtException(thread, th);
    }
}
