package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.k;

/* access modifiers changed from: package-private */
public final class e extends c {
    e() {
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Intent a(ErrorMessage errorMessage, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("ERROR_TYPE", errorMessage.g().d());
        intent.putExtra("ERROR_CODE", errorMessage.ordinal());
        intent.putExtra("ERROR_DESCRIPTION", str);
        return intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Intent b(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("AUTHORIZATION_CODE", bundle.getString("AUTHORIZATION_CODE"));
        return intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Uri d(Uri uri, ErrorMessage errorMessage, String str) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Uri e(Uri uri, k.b bVar) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Bundle f(String str, int i, String str2) {
        Logger.d("Google V1 doesn't support token response type", new Object[0]);
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Bundle g(String str, String str2) {
        return je.F("AUTHORIZATION_CODE", str, "STATE", str2);
    }
}
