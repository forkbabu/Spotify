package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* access modifiers changed from: package-private */
public final class k implements l {
    private final IBinder a;

    k(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void k2(j jVar, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder((rt) jVar);
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
