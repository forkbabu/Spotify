package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class r2 extends a implements z1 {
    r2(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.z1
    public final Bundle m(Bundle bundle) {
        Parcel T = T();
        v.c(T, bundle);
        Parcel a0 = a0(1, T);
        Bundle bundle2 = (Bundle) v.a(a0, Bundle.CREATOR);
        a0.recycle();
        return bundle2;
    }
}
