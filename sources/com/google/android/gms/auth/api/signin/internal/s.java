package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class s extends rs implements t {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.t
    public final void e2(r rVar, GoogleSignInOptions googleSignInOptions) {
        Parcel T = T();
        ss.b(T, rVar);
        ss.c(T, googleSignInOptions);
        a0(103, T);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.t
    public final void i3(r rVar, GoogleSignInOptions googleSignInOptions) {
        Parcel T = T();
        ss.b(T, rVar);
        ss.c(T, googleSignInOptions);
        a0(102, T);
    }
}
