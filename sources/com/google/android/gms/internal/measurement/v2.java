package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class v2 extends q0 implements z1 {
    public static z1 D3(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof z1) {
            return (z1) queryLocalInterface;
        }
        return new r2(iBinder);
    }
}
