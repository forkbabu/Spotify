package com.google.android.play.core.internal;

import android.os.IBinder;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements IBinder.DeathRecipient {
    private final l a;

    c(l lVar) {
        this.a = lVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.a.k();
    }
}
