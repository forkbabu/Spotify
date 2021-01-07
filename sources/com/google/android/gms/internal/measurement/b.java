package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.h;

public abstract class b extends q0 implements c {
    public b() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.q0
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ((h.c) this).V2(parcel.readString(), parcel.readString(), (Bundle) v.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int a = ((h.c) this).a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
