package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;

public class j implements m {
    private final m a;
    private final Intent b;

    j(m mVar, Intent intent) {
        this.a = mVar;
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
        return AuthorizationRequest.ResponseType.CODE;
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
        String[] stringArrayExtra = this.b.getStringArrayExtra("SCOPE");
        return stringArrayExtra != null ? stringArrayExtra : new String[0];
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String getState() {
        return this.a.getState();
    }
}
