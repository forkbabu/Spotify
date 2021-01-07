package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class c0 extends nt implements d0 {
    c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    @Override // com.google.android.gms.common.internal.d0
    public final a v1(a aVar, n0 n0Var) {
        Parcel T = T();
        int i = ot.a;
        T.writeStrongBinder((rt) aVar);
        ot.b(T, n0Var);
        Parcel a0 = a0(T);
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }
}
