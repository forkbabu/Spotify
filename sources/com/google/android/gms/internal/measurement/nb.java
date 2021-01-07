package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class nb extends q0 implements kb {
    public nb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.q0
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ((hb) this).m((Bundle) v.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
