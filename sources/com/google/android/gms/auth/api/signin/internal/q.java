package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class q extends qs implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qs
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ss.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) ss.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 102:
                R1((Status) ss.a(parcel, Status.CREATOR));
                break;
            case 103:
                j2((Status) ss.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
