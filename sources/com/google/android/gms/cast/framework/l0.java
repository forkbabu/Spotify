package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.t;

public final class l0 extends t implements j0 {
    l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // com.google.android.gms.cast.framework.j0
    public final void Y2(int i) {
        Parcel T = T();
        T.writeInt(i);
        C0(12, T);
    }

    @Override // com.google.android.gms.cast.framework.j0
    public final boolean h() {
        Parcel a0 = a0(5, T());
        int i = n0.a;
        boolean z = a0.readInt() != 0;
        a0.recycle();
        return z;
    }

    @Override // com.google.android.gms.cast.framework.j0
    public final boolean p1() {
        Parcel a0 = a0(9, T());
        int i = n0.a;
        boolean z = a0.readInt() != 0;
        a0.recycle();
        return z;
    }

    @Override // com.google.android.gms.cast.framework.j0
    public final a q1() {
        Parcel a0 = a0(1, T());
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.cast.framework.j0
    public final boolean s() {
        Parcel a0 = a0(6, T());
        int i = n0.a;
        boolean z = a0.readInt() != 0;
        a0.recycle();
        return z;
    }

    @Override // com.google.android.gms.cast.framework.j0
    public final void t1(int i) {
        Parcel T = T();
        T.writeInt(i);
        C0(15, T);
    }

    @Override // com.google.android.gms.cast.framework.j0
    public final void y2(int i) {
        Parcel T = T();
        T.writeInt(i);
        C0(13, T);
    }
}
