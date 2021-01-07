package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.t;

public final class i0 extends t implements g0 {
    i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // com.google.android.gms.cast.framework.g0
    public final IBinder G(Intent intent) {
        Parcel T = T();
        n0.c(T, intent);
        Parcel a0 = a0(3, T);
        IBinder readStrongBinder = a0.readStrongBinder();
        a0.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.cast.framework.g0
    public final void onDestroy() {
        C0(4, T());
    }

    @Override // com.google.android.gms.cast.framework.g0
    public final int p3(Intent intent, int i, int i2) {
        Parcel T = T();
        n0.c(T, intent);
        T.writeInt(i);
        T.writeInt(i2);
        Parcel a0 = a0(2, T);
        int readInt = a0.readInt();
        a0.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.g0
    public final void q() {
        C0(1, T());
    }
}
