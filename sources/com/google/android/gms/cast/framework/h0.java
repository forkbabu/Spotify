package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.cast.t;

public final class h0 extends t implements f0 {
    h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // com.google.android.gms.cast.framework.f0
    public final a w() {
        Parcel a0 = a0(5, T());
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }
}
