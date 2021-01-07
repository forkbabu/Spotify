package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public class e extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new v0();
    private final int a;
    private final int b;
    private int c;
    String f;
    IBinder n;
    Scope[] o;
    Bundle p;
    Account q;
    c[] r;
    c[] s;
    private boolean t;
    private int u;
    boolean v;
    private final String w;

    public e(int i, String str) {
        this.a = 6;
        this.c = com.google.android.gms.common.e.a;
        this.b = i;
        this.t = true;
        this.w = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.M(parcel, 2, this.b);
        SafeParcelReader.M(parcel, 3, this.c);
        SafeParcelReader.T(parcel, 4, this.f, false);
        SafeParcelReader.L(parcel, 5, this.n, false);
        SafeParcelReader.W(parcel, 6, this.o, i, false);
        SafeParcelReader.E(parcel, 7, this.p, false);
        SafeParcelReader.S(parcel, 8, this.q, i, false);
        SafeParcelReader.W(parcel, 10, this.r, i, false);
        SafeParcelReader.W(parcel, 11, this.s, i, false);
        SafeParcelReader.C(parcel, 12, this.t);
        SafeParcelReader.M(parcel, 13, this.u);
        SafeParcelReader.C(parcel, 14, this.v);
        SafeParcelReader.T(parcel, 15, this.w, false);
        SafeParcelReader.m(parcel, a2);
    }

    e(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z, int i4, boolean z2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                i D3 = i.a.D3(iBinder);
                int i5 = a.a;
                if (D3 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = D3.a();
                    } catch (RemoteException unused) {
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.q = account2;
        } else {
            this.n = iBinder;
            this.q = account;
        }
        this.o = scopeArr;
        this.p = bundle;
        this.r = cVarArr;
        this.s = cVarArr2;
        this.t = z;
        this.u = i4;
        this.v = z2;
        this.w = str2;
    }
}
