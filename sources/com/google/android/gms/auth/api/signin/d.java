package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;

public class d implements i {
    private Status a;
    private GoogleSignInAccount b;

    public d(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    public GoogleSignInAccount a() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.i
    public Status h() {
        return this.a;
    }
}
