package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.m;

public abstract class b implements Runnable {
    private final m<?> a;

    b() {
        this.a = null;
    }

    public b(m<?> mVar) {
        this.a = mVar;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final m<?> b() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            m<?> mVar = this.a;
            if (mVar != null) {
                mVar.d(e);
            }
        }
    }
}
