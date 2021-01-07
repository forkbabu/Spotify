package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class e1 extends st implements d1 {
    e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.d1
    public final a b() {
        Parcel a0 = a0(1, T());
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.common.internal.d1
    public final int c() {
        Parcel a0 = a0(2, T());
        int readInt = a0.readInt();
        a0.recycle();
        return readInt;
    }
}
