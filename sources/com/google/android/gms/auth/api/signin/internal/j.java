package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;

public final class j extends f<t> {
    private final GoogleSignInOptions L;

    public j(Context context, Looper looper, c cVar, GoogleSignInOptions googleSignInOptions, c.a aVar, c.b bVar) {
        super(context, looper, 91, cVar, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.a();
        }
        aVar2.g(os.a());
        if (!cVar.d().isEmpty()) {
            for (Scope scope : cVar.d()) {
                aVar2.e(scope, new Scope[0]);
            }
        }
        this.L = aVar2.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String A() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final GoogleSignInOptions Z() {
        return this.L;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int l() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof t) {
            return (t) queryLocalInterface;
        }
        return new s(iBinder);
    }
}
