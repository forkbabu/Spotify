package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;

public class i implements m {
    private final Intent a;

    i(Intent intent) {
        this.a = intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String a() {
        String stringExtra = this.a.getStringExtra("CLIENT_ID");
        return stringExtra != null ? stringExtra : "";
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String b() {
        String stringExtra = this.a.getStringExtra("REDIRECT_URI");
        return stringExtra != null ? stringExtra : "";
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public AuthorizationRequest.ResponseType c() {
        String stringExtra = this.a.getStringExtra("RESPONSE_TYPE");
        if (stringExtra != null) {
            if (stringExtra.equals("token")) {
                return AuthorizationRequest.ResponseType.TOKEN;
            }
            if (stringExtra.equals("code")) {
                return AuthorizationRequest.ResponseType.CODE;
            }
        }
        return AuthorizationRequest.ResponseType.NONE;
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public boolean d() {
        return false;
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public ClientIdentity e() {
        return (ClientIdentity) this.a.getParcelableExtra("CLIENT_IDENTITY");
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String[] f() {
        String[] stringArrayExtra = this.a.getStringArrayExtra("SCOPES");
        return stringArrayExtra != null ? stringArrayExtra : new String[0];
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String getState() {
        String stringExtra = this.a.getStringExtra("STATE");
        return stringExtra != null ? stringExtra : "";
    }
}
