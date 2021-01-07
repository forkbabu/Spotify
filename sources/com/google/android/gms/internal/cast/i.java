package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.c0;
import com.google.android.gms.cast.framework.g0;
import com.google.android.gms.cast.framework.j0;
import com.google.android.gms.cast.framework.m;
import com.google.android.gms.cast.framework.media.internal.e;
import com.google.android.gms.cast.framework.x;
import com.google.android.gms.cast.framework.z;
import com.google.android.gms.dynamic.a;
import java.util.Map;

public final class i extends t implements j {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // com.google.android.gms.internal.cast.j
    public final g0 V0(a aVar, a aVar2, a aVar3) {
        Parcel T = T();
        n0.b(T, aVar);
        n0.b(T, aVar2);
        n0.b(T, aVar3);
        Parcel a0 = a0(5, T);
        g0 D3 = g0.a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.internal.cast.j
    public final j0 j0(String str, String str2, m mVar) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        n0.b(T, mVar);
        Parcel a0 = a0(2, T);
        j0 D3 = j0.a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.internal.cast.j
    public final z s2(a aVar, b bVar, l lVar, Map map) {
        Parcel T = T();
        n0.b(T, aVar);
        n0.c(T, bVar);
        n0.b(T, lVar);
        T.writeMap(map);
        Parcel a0 = a0(1, T);
        z D3 = z.a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.internal.cast.j
    public final c0 v0(b bVar, a aVar, x xVar) {
        Parcel T = T();
        n0.c(T, bVar);
        n0.b(T, aVar);
        n0.b(T, xVar);
        Parcel a0 = a0(3, T);
        c0 D3 = c0.a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.internal.cast.j
    public final e z3(a aVar, com.google.android.gms.cast.framework.media.internal.i iVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel T = T();
        n0.b(T, aVar);
        n0.b(T, iVar);
        T.writeInt(i);
        T.writeInt(i2);
        T.writeInt(z ? 1 : 0);
        T.writeLong(2097152);
        T.writeInt(5);
        T.writeInt(333);
        T.writeInt(10000);
        Parcel a0 = a0(6, T);
        e D3 = e.a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }
}
