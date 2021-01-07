package com.google.firebase.iid;

import com.google.android.gms.tasks.h;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l0 implements Runnable {
    private final h a;

    l0(h hVar) {
        this.a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(new IOException("TIMEOUT"));
    }
}
