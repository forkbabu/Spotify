package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class mb extends a implements kb {
    mb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final void m(Bundle bundle) {
        Parcel T = T();
        v.c(T, bundle);
        C0(1, T);
    }
}
