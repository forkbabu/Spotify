package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.h;
import com.google.android.gms.internal.cast.a;
import com.google.android.gms.internal.cast.n0;

public abstract class a0 extends a implements x {
    public a0() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ((c.BinderC0091c) this).E3(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
        } else if (i == 2) {
            ((c.BinderC0091c) this).D3(parcel.readString(), (h) n0.a(parcel, h.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            ((c.BinderC0091c) this).R(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 4) {
            ((c.BinderC0091c) this).F3(parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
