package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.internal.cast.a;
import com.google.android.gms.internal.cast.n0;

public abstract class n extends a implements IInterface {
    public n() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            com.google.android.gms.dynamic.a F3 = ((k.a) this).F3(parcel.readString());
            parcel2.writeNoException();
            n0.b(parcel2, F3);
        } else if (i == 2) {
            boolean E3 = ((k.a) this).E3();
            parcel2.writeNoException();
            int i3 = n0.a;
            parcel2.writeInt(E3 ? 1 : 0);
        } else if (i == 3) {
            String D3 = ((k.a) this).D3();
            parcel2.writeNoException();
            parcel2.writeString(D3);
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
