package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class j extends st implements k {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.k
    public final a B(a aVar, String str, int i, a aVar2) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(i);
        tt.b(T, aVar2);
        Parcel a0 = a0(2, T);
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.dynamite.k
    public final a b2(a aVar, String str, int i, a aVar2) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(i);
        tt.b(T, aVar2);
        Parcel a0 = a0(3, T);
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }
}
