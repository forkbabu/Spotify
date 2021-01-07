package com.google.android.gms.cast.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.cast.a;
import com.google.android.gms.internal.cast.n0;

public abstract class d extends a implements e {
    public d() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        u3((Bundle) n0.a(parcel, Bundle.CREATOR));
        return true;
    }
}
