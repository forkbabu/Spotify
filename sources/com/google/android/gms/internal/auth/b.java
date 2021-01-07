package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

public final class b implements c, IInterface {
    private final IBinder a;

    b(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
