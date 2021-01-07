package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.t;

public final class b0 extends t implements z {
    b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // com.google.android.gms.cast.framework.z
    public final f0 g0() {
        f0 f0Var;
        Parcel a0 = a0(6, T());
        IBinder readStrongBinder = a0.readStrongBinder();
        if (readStrongBinder == null) {
            f0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            if (queryLocalInterface instanceof f0) {
                f0Var = (f0) queryLocalInterface;
            } else {
                f0Var = new h0(readStrongBinder);
            }
        }
        a0.recycle();
        return f0Var;
    }

    @Override // com.google.android.gms.cast.framework.z
    public final boolean o() {
        Parcel a0 = a0(12, T());
        int i = n0.a;
        boolean z = a0.readInt() != 0;
        a0.recycle();
        return z;
    }

    @Override // com.google.android.gms.cast.framework.z
    public final k0 p() {
        k0 k0Var;
        Parcel a0 = a0(5, T());
        IBinder readStrongBinder = a0.readStrongBinder();
        if (readStrongBinder == null) {
            k0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (queryLocalInterface instanceof k0) {
                k0Var = (k0) queryLocalInterface;
            } else {
                k0Var = new n0(readStrongBinder);
            }
        }
        a0.recycle();
        return k0Var;
    }
}
