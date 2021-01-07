package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.f1;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.dynamic.b;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new x();
    private final String a;
    private final m b;
    private final boolean c;
    private final boolean f;

    y(String str, IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.a = str;
        p pVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.a b2 = f1.D3(iBinder).b();
                if (b2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) b.E3(b2);
                }
                if (bArr != null) {
                    pVar = new p(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = pVar;
        this.c = z;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 1, this.a, false);
        m mVar = this.b;
        if (mVar == null) {
            mVar = null;
        } else {
            mVar.getClass();
        }
        SafeParcelReader.L(parcel, 2, mVar, false);
        SafeParcelReader.C(parcel, 3, this.c);
        SafeParcelReader.C(parcel, 4, this.f);
        SafeParcelReader.m(parcel, a2);
    }

    y(String str, m mVar, boolean z, boolean z2) {
        this.a = str;
        this.b = mVar;
        this.c = z;
        this.f = z2;
    }
}
