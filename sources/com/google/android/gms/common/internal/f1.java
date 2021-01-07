package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class f1 extends rt implements d1 {
    public f1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static d1 D3(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof d1) {
            return (d1) queryLocalInterface;
        }
        return new e1(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.rt
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a b = b();
            parcel2.writeNoException();
            tt.b(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
