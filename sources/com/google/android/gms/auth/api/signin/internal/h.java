package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.a;
import com.google.android.gms.common.api.c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class h extends a<Void> {
    private Semaphore l = new Semaphore(0);
    private Set<c> m;

    public h(Context context, Set<c> set) {
        super(context);
        this.m = set;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.b
    public final void f() {
        this.l.drainPermits();
        d();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.loader.content.a
    public final Void m() {
        Iterator<c> it = this.m.iterator();
        if (!it.hasNext()) {
            try {
                this.l.tryAcquire(0, 5, TimeUnit.SECONDS);
                return null;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return null;
            }
        } else {
            it.next().getClass();
            throw new UnsupportedOperationException();
        }
    }
}
