package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class g1 extends rt implements h1 {
    public static h1 D3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof h1) {
            return (h1) queryLocalInterface;
        }
        return new i1(iBinder);
    }
}
