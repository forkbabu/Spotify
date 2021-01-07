package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class v0 implements Parcelable.Creator<e> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        c[] cVarArr = null;
        c[] cVarArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.u(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.j(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.f(parcel, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 10:
                    cVarArr = (c[]) SafeParcelReader.j(parcel, readInt, c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (c[]) SafeParcelReader.j(parcel, readInt, c.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 13:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 14:
                    z2 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 15:
                    str2 = SafeParcelReader.g(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new e(i, i2, i3, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z, i4, z2, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i) {
        return new e[i];
    }
}
