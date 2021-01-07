package com.spotify.mobile.android.sso;

import com.spotify.mobile.android.sso.k;

public final /* synthetic */ class d implements si0 {
    public final /* synthetic */ AuthorizationActivity a;
    public final /* synthetic */ k b;

    public /* synthetic */ d(AuthorizationActivity authorizationActivity, k kVar) {
        this.a = authorizationActivity;
        this.b = kVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        AuthorizationActivity authorizationActivity = this.a;
        k kVar = this.b;
        k.d dVar = (k.d) obj;
        authorizationActivity.getClass();
        kVar.getClass();
        k.d dVar2 = (k.d) kVar;
        authorizationActivity.n1(dVar2.e(), dVar2.d(), dVar2.f());
    }
}
