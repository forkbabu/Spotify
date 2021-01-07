package com.google.android.gms.internal.recaptcha;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.recaptcha.a;
import com.google.android.gms.recaptcha.d;

public final class a3 implements b3, IInterface {
    private final IBinder a;
    private final String b = "com.google.android.gms.recaptcha.internal.IRecaptchaService";

    a3(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.internal.recaptcha.b3
    public final void F2(x2 x2Var, d dVar, a aVar) {
        Parcel T = T();
        v.b(T, x2Var);
        v.c(T, dVar);
        v.c(T, aVar);
        a0(3, T);
    }

    /* access modifiers changed from: protected */
    public final Parcel T() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a0(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.recaptcha.b3
    public final void k1(v2 v2Var, d dVar) {
        Parcel T = T();
        v.b(T, v2Var);
        v.c(T, dVar);
        a0(4, T);
    }

    @Override // com.google.android.gms.internal.recaptcha.b3
    public final void s1(z2 z2Var, String str) {
        Parcel T = T();
        v.b(T, z2Var);
        T.writeString(str);
        a0(2, T);
    }
}
