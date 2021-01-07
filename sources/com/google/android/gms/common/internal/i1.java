package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.s;
import com.google.android.gms.common.u;
import com.google.android.gms.common.y;
import com.google.android.gms.dynamic.a;

public final class i1 extends st implements h1 {
    i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.h1
    public final boolean A2(y yVar, a aVar) {
        Parcel T = T();
        int i = tt.a;
        boolean z = true;
        T.writeInt(1);
        yVar.writeToParcel(T, 0);
        tt.b(T, aVar);
        Parcel a0 = a0(5, T);
        if (a0.readInt() == 0) {
            z = false;
        }
        a0.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.h1
    public final boolean a() {
        Parcel a0 = a0(7, T());
        int i = tt.a;
        boolean z = a0.readInt() != 0;
        a0.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.h1
    public final u x0(s sVar) {
        Parcel T = T();
        int i = tt.a;
        T.writeInt(1);
        sVar.writeToParcel(T, 0);
        Parcel a0 = a0(6, T);
        u uVar = (u) tt.a(a0, u.CREATOR);
        a0.recycle();
        return uVar;
    }
}
