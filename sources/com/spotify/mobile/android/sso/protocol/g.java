package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.k;

public class g extends c {
    g() {
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Intent a(ErrorMessage errorMessage, String str, String str2) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Intent b(Bundle bundle) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Uri d(Uri uri, ErrorMessage errorMessage, String str) {
        StringBuilder sb = new StringBuilder(50);
        sb.append(errorMessage.d());
        if (!TextUtils.isEmpty(str)) {
            sb.append(": ");
            sb.append(str);
        }
        Uri.Builder buildUpon = uri.buildUpon();
        return buildUpon.appendQueryParameter(AppProtocol.LogMessage.SEVERITY_ERROR, buildUpon.toString()).build();
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Uri e(Uri uri, k.b bVar) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (bVar.f() != null) {
            buildUpon.appendQueryParameter("state", bVar.f());
        }
        buildUpon.appendQueryParameter("code", bVar.d());
        return buildUpon.build();
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Bundle f(String str, int i, String str2) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Bundle g(String str, String str2) {
        return null;
    }
}
