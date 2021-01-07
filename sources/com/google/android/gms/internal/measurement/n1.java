package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* access modifiers changed from: package-private */
public final class n1 extends ContentObserver {
    n1() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        k1.e.set(true);
    }
}
