package com.spotify.mobile.android.sso.protocol;

import android.net.Uri;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;

public class p implements m {
    private final Uri a;

    p(String str) {
        this.a = Uri.parse(str);
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String a() {
        String queryParameter = this.a.getQueryParameter("client_id");
        return queryParameter != null ? queryParameter : "";
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String b() {
        String queryParameter = this.a.getQueryParameter("redirect_uri");
        return queryParameter != null ? queryParameter : "";
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public AuthorizationRequest.ResponseType c() {
        return AuthorizationRequest.ResponseType.CODE;
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public boolean d() {
        return this.a.getBooleanQueryParameter("show_dialog", false);
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public /* synthetic */ ClientIdentity e() {
        return l.a(this);
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String[] f() {
        String queryParameter = this.a.getQueryParameter("scope");
        if (queryParameter == null) {
            return new String[0];
        }
        return queryParameter.split(" ");
    }

    @Override // com.spotify.mobile.android.sso.protocol.m
    public String getState() {
        String queryParameter = this.a.getQueryParameter("state");
        return queryParameter != null ? queryParameter : "";
    }
}
