package com.spotify.mobile.android.sso;

import com.spotify.mobile.android.sso.k;

public final /* synthetic */ class c implements si0 {
    public final /* synthetic */ AuthorizationActivity a;
    public final /* synthetic */ k b;

    public /* synthetic */ c(AuthorizationActivity authorizationActivity, k kVar) {
        this.a = authorizationActivity;
        this.b = kVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        AuthorizationActivity authorizationActivity = this.a;
        k kVar = this.b;
        k.c cVar = (k.c) obj;
        authorizationActivity.getClass();
        kVar.getClass();
        authorizationActivity.n1(((k.c) kVar).d(), null, null);
    }
}
