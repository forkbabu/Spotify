package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.b;

public interface j extends IInterface {

    public static abstract class a extends rt implements j {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.rt
        public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ((b.j) this).D3(parcel.readInt(), parcel.readStrongBinder(), (Bundle) tt.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                parcel.readInt();
                Bundle bundle = (Bundle) tt.a(parcel, Bundle.CREATOR);
                new Exception();
            } else if (i != 3) {
                return false;
            } else {
                ((b.j) this).E3(parcel.readInt(), parcel.readStrongBinder(), (t0) tt.a(parcel, t0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
