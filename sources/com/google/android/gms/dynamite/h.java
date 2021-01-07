package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class h extends st implements i {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.i
    public final a B(a aVar, String str, int i, a aVar2) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(i);
        tt.b(T, aVar2);
        Parcel a0 = a0(8, T);
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int M2(a aVar, String str, boolean z) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(z ? 1 : 0);
        Parcel a0 = a0(5, T);
        int readInt = a0.readInt();
        a0.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int X2(a aVar, String str, boolean z) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(z ? 1 : 0);
        Parcel a0 = a0(3, T);
        int readInt = a0.readInt();
        a0.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int b() {
        Parcel a0 = a0(6, T());
        int readInt = a0.readInt();
        a0.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final a b3(a aVar, String str, int i) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(i);
        Parcel a0 = a0(4, T);
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.dynamite.i
    public final a m3(a aVar, String str, boolean z, long j) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(z ? 1 : 0);
        T.writeLong(j);
        Parcel a0 = a0(7, T);
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.dynamite.i
    public final a w2(a aVar, String str, int i) {
        Parcel T = T();
        tt.b(T, aVar);
        T.writeString(str);
        T.writeInt(i);
        Parcel a0 = a0(2, T);
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }
}
