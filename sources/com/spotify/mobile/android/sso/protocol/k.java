package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import com.google.common.base.Charsets;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;

public class k implements m {
    private final m a;
    private final Intent b;

    k(i iVar, Intent intent) {
        this.a = iVar;
        this.b = intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String a() {
        return this.a.a();
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String b() {
        return this.a.b();
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public AuthorizationRequest.ResponseType c() {
        return this.a.c();
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public boolean d() {
        return this.a.d();
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public ClientIdentity e() {
        return this.a.e();
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String[] f() {
        String stringExtra = this.b.getStringExtra("SCOPES");
        return stringExtra != null ? gf0.c(stringExtra, Charsets.UTF_8).split(" +") : new String[0];
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String getState() {
        return this.a.getState();
    }
}
